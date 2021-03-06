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
package co.aurasphere.botmill.telegram.model.outcoming.factory;

import co.aurasphere.botmill.telegram.bean.TelegramBotMillBean;
import co.aurasphere.botmill.telegram.model.outcoming.TelegramBotMillResponse;
import co.aurasphere.botmill.telegram.model.update.Update;

/**
 * Abstract class for the response builders. Defines how a bot should build the
 * {@link TelegramBotMillResponse} object representing its response.
 * 
 * @author Donato Rimenti
 * 
 */
public abstract class TelegramBotMillResponseBuilder extends TelegramBotMillBean {

	/**
	 * Builds the {@link TelegramBotMillResponse} that the bot should return.
	 * 
	 * @param update
	 *            a {@link Update} object representing the incoming
	 *            message.
	 * @return the {@link TelegramBotMillResponse} of this bot.
	 */
	abstract TelegramBotMillResponse build(Update update);

	/* (non-Javadoc)
	 * @see co.aurasphere.botmill.telegram.bean.TelegramBotMillBean#toString()
	 */
	@Override
	public String toString() {
		return "TelegramBotMillResponseBuilder []";
	}

}
