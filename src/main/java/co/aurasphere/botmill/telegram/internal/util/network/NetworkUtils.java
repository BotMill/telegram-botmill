/*
 * MIT License
 *
 * Copyright (c) 2016 BotMill.io
 * 
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package co.aurasphere.botmill.telegram.internal.util.network;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.List;

import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpRequestBase;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import co.aurasphere.botmill.telegram.TelegramBotMillContext;
import co.aurasphere.botmill.telegram.internal.util.json.JsonUtils;
import co.aurasphere.botmill.telegram.model.outcoming.TelegramBotMillBaseMethodDTO;
import co.aurasphere.botmill.telegram.model.outcoming.TelegramBotMillResponse;
import co.aurasphere.botmill.telegram.support.TelegramBotMillMonitor;

/**
 * Class that contains methods that allows Telegram BotMill to communicate
 * through the network.
 * 
 * @author Donato Rimenti
 * 
 */
public class NetworkUtils {

	/**
	 * The base URL used for Telegram communication.
	 */
	private final static String BASE_TELEGRAM_ENDPOINT = "https://api.telegram.org/bot";

	/**
	 * The logger.
	 */
	private static final Logger logger = LoggerFactory
			.getLogger(NetworkUtils.class);

	/**
	 * The registered monitors to the {@link TelegramBotMillContext}.
	 */
	private static final List<TelegramBotMillMonitor> registeredMonitors = TelegramBotMillContext
			.getInstance().getRegisteredMonitors();

	/**
	 * POSTs a message as a JSON string to Telegram.
	 * 
	 * @param input
	 *            the JSON data to send.
	 * @param method
	 *            the Telegram method to call.
	 */
	public static void postJsonMessage(StringEntity input, TelegramMethod method) {
		String botToken = TelegramBotMillContext.getInstance().getBotToken();
		// If the page token is invalid, returns.

		HttpPost post = new HttpPost(BASE_TELEGRAM_ENDPOINT + botToken + "/"
				+ method.getMethodName());
		post.setEntity(input);
		send(post);
	}

	/**
	 * POSTs a message as a JSON string to Telegram.
	 * 
	 * @param input
	 *            the data to send.
	 */
	public static void postJsonMessage(TelegramBotMillBaseMethodDTO input) {
		StringEntity stringEntity = toStringEntity(input);
		postJsonMessage(stringEntity, input.getTelegramMethod());
	}

	/**
	 * Sends a request.
	 * 
	 * @param request
	 *            the request to send
	 * @return response the response.
	 */
	private static String send(HttpRequestBase request) {
		CloseableHttpClient httpClient = HttpClientBuilder.create().build();
		logger.debug(request.getRequestLine().toString());
		HttpResponse httpResponse = null;
		String response = null;
		try {
			httpResponse = httpClient.execute(request);
			response = logResponse(httpResponse);
		} catch (Exception e) {
			logger.error("Error during HTTP connection to Telegram: ", e);
		} finally {
			try {
				httpClient.close();
			} catch (IOException e) {
				logger.error("Error while closing HTTP connection: ", e);
			}
		}
		return response;
	}

	/**
	 * Logs the response before returning it.
	 *
	 * @param response
	 *            the response to log.
	 * @return the string
	 * @throws IOException
	 *             Signals that an I/O exception has occurred.
	 */
	private static String logResponse(HttpResponse response) throws IOException {
		int statusCode = response.getStatusLine().getStatusCode();

		// Logs the raw JSON for debug purposes.
		String output = getResponseContent(response);
		logger.debug("HTTP Status Code: {}", statusCode);
		logger.debug("Raw response: {}", output);

		// If the status code is > 400 there was an error.
		if (statusCode >= 400) {
			logger.error("HTTP connection failed with error code {}.",
					statusCode);
			
			// Tries to parse the object as an Update.
			
			// TODO
			// Sends the callback to the registered network monitors.
			for (TelegramBotMillMonitor monitor : registeredMonitors) {
				// monitor.onError(errorMessage);
			}
		} else {
			// TODO
			// Sends the callback to the registered network monitors.
			for (TelegramBotMillMonitor monitor : registeredMonitors) {
				// monitor.onConfirmation(confirmationMessage);
			}
		}
		return output;
	}

	/**
	 * Utility method that converts an HttpResponse to a String.
	 *
	 * @param response
	 *            the response to convert.
	 * @return a String with the response content.
	 * @throws IOException
	 *             Signals that an I/O exception has occurred.
	 */
	private static String getResponseContent(HttpResponse response)
			throws IOException {
		InputStream inputStream = response.getEntity().getContent();
		BufferedInputStream bufferedInputStream = new BufferedInputStream(
				inputStream);
		InputStreamReader inputStreamReader = new InputStreamReader(
				bufferedInputStream);
		BufferedReader br = new BufferedReader(inputStreamReader);
		StringBuilder builder = new StringBuilder();
		String output = null;
		while ((output = br.readLine()) != null) {
			builder.append(output);
		}
		return builder.toString();
	}

	/**
	 * Utility to send a POST request.
	 * 
	 * @param url
	 *            the url we need to send the post request to.
	 * @param entity
	 *            the entity that containts the object we need to pass as part
	 *            of the post request.
	 * @return {@link String}
	 */
	public static String post(String url, StringEntity entity) {
		HttpPost post = new HttpPost(url);
		post.setHeader("Content-Type", "application/x-www-form-urlencoded");
		post.setEntity(entity);
		return send(post);
	}

	/**
	 * Utility to send a GET request.
	 * 
	 * @param url
	 *            the url we need to send the get request to.
	 * @return {@link String}
	 */
	public static String get(String url) {
		HttpGet get = new HttpGet(url);
		return send(get);
	}

	/**
	 * Utility method that converts an object to its StringEntity
	 * representation.
	 * 
	 * @param object
	 *            the object to convert to a StringEntity.
	 * @return a {@link StringEntity} object containing the object JSON.
	 */
	private static StringEntity toStringEntity(Object object) {
		StringEntity input = null;
		try {
			String json = JsonUtils.toJson(object);
			input = new StringEntity(json, StandardCharsets.UTF_8);
			input.setContentType("application/json");
			logger.debug("Request: {}", inputStreamToString(input.getContent()));
		} catch (Exception e) {
			logger.error("Error during JSON message creation: ", e);
		}
		return input;
	}

	/**
	 * Utility method which converts an InputStream to a String.
	 *
	 * @param stream
	 *            the InputStream to convert.
	 * @return a String with the InputStream content.
	 * @throws IOException
	 *             Signals that an I/O exception has occurred.
	 */
	private static String inputStreamToString(InputStream stream)
			throws IOException {
		ByteArrayOutputStream result = new ByteArrayOutputStream();
		byte[] buffer = new byte[1024];
		int length;
		String resultString = null;
		while ((length = stream.read(buffer)) != -1) {
			result.write(buffer, 0, length);
		}
		resultString = result.toString("UTF-8");
		return resultString;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "NetworkUtils []";
	}

}
