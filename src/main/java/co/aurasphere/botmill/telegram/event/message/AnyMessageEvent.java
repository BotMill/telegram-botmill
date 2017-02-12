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
package co.aurasphere.botmill.telegram.event.message;

import co.aurasphere.botmill.telegram.bean.TelegramBotMillBean;
import co.aurasphere.botmill.telegram.event.TelegramBotMillEvent;
import co.aurasphere.botmill.telegram.event.TelegramBotMillEventType;
import co.aurasphere.botmill.telegram.model.update.Update;

/**
 * A {@link TelegramBotMillEvent} that triggers whenever the users sends a text
 * message.
 * 
 * @author Donato Rimenti
 * 
 */
public class AnyMessageEvent extends TelegramBotMillBean implements TelegramBotMillEvent {

	/**
	 * Verify event condition.
	 *
	 * @param update
	 *            the update
	 * @return true if the incoming callback contains a non-empty, non-null text
	 *         message, false otherwise.
	 */
	public final boolean verifyEventCondition(Update update) {
		return eventKind(update) == TelegramBotMillEventType.MESSAGE;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see co.aurasphere.botmill.telegram.bean.TelegramBotMillBean#toString()
	 */
	@Override
	public String toString() {
		return "AnyMessageEvent []";
	}

}
