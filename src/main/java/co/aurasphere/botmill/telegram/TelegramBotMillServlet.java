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
package co.aurasphere.botmill.telegram;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.aurasphere.botmill.core.base.BotMillServlet;
import co.aurasphere.botmill.telegram.internal.util.json.JsonUtils;
import co.aurasphere.botmill.telegram.model.update.Update;

/**
 * Main Servlet for Telegram BotMill framework.
 * 
 * The Telegram BotMillServlet supports POST requests only. Each post request is
 * parsed as an {@link Update} object and forwarded to the registered bots in
 * the {@link TelegramBotMillContext}.
 *
 * @author Donato Rimenti
 * 
 */
public class TelegramBotMillServlet extends BotMillServlet {

	/**
	 * The serial version UID.
	 */
	private static final long serialVersionUID = 1L;

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * javax.servlet.http.HttpServlet#doPost(javax.servlet.http.HttpServletRequest
	 * , javax.servlet.http.HttpServletResponse)
	 */
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

		logger.trace("POST received!");
		Update callback = null;

		// Extrapolates and logs the JSON for debugging.
		String json = readerToString(req.getReader());
		logger.debug("JSON input: " + json);

		// Parses the request as a Telegram Update.
		try {
			callback = JsonUtils.fromJson(json, Update.class);
		} catch (Exception e) {
			logger.error("Error during Telegram Update parsing: ", e);
			return;
		}

		// If the received POST is a Telegram Update, it forwards it to the
		// registered bots.
		if (callback != null) {
			for (TelegramBot bot : TelegramBotMillContext.getInstance()
					.getRegisteredBots()) {
				bot.processMessage(callback);
			}
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "TelegramBotMillServlet []";
	}

}