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
package co.aurasphere.botmill.telegram.support.update;

import org.hibernate.validator.constraints.NotEmpty;

import co.aurasphere.botmill.telegram.internal.util.network.TelegramMethod;
import co.aurasphere.botmill.telegram.model.outcoming.TelegramBotMillBaseMethodDTO;

/**
 * Options for the {@link UpdateService#setWebhook(SetWebhookOptions)} method.
 * 
 * @author Donato Rimenti
 */
public class SetWebhookOptions extends TelegramBotMillBaseMethodDTO {

	/**
	 * The serial version UID.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * HTTPS url to send updates to. Use an empty string to remove webhook
	 * integration.
	 */
	@NotEmpty
	private String url;
	
	/**
	 * Instantiates a new SetWebhookOptions.
	 */
	public SetWebhookOptions(){
		this.telegramMethod = TelegramMethod.SET_WEBHOOK;
	}

	/**
	 * Gets the {@link #url}.
	 *
	 * @return the {@link #url}.
	 */
	public String getUrl() {
		return url;
	}

	/**
	 * Sets the {@link #url}.
	 *
	 * @param url
	 *            the {@link #url} to set.
	 */
	public void setUrl(String url) {
		this.url = url;
	}

}
