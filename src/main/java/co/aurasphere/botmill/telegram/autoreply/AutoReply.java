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
package co.aurasphere.botmill.telegram.autoreply;

import co.aurasphere.botmill.telegram.bean.TelegramBotMillBean;
import co.aurasphere.botmill.telegram.event.TelegramBotMillEvent;
import co.aurasphere.botmill.telegram.internal.util.network.NetworkUtils;
import co.aurasphere.botmill.telegram.model.outcoming.TelegramBotMillResponse;
import co.aurasphere.botmill.telegram.model.update.Update;

/**
 * A class that represents an automatic reply to an event. AutoReply are used in
 * conjuction with {@link TelegramBotMillEvent} in order to handle a Telegram
 * callback automatically, using the delegation design pattern.
 * 
 * @author Donato Rimenti
 */
public abstract class AutoReply extends TelegramBotMillBean implements Reply {

	/**
	 * Method which defines the reply flow.
	 * 
	 * @param update
	 *            the current callback message
	 */
	public void reply(Update update) {
		TelegramBotMillResponse response = createResponse(update);
		if (response != null) {
			// If the response is valid, replies to it.
			if (validate(response)) {
				NetworkUtils.postJsonMessage(response, response.getTelegramMethod());
			}
		}
	}

	public abstract TelegramBotMillResponse createResponse(Update update);

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "AutoReply []";
	}

}
