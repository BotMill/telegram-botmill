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

import java.util.regex.Pattern;

import co.aurasphere.botmill.telegram.event.TelegramBotMillEvent;
import co.aurasphere.botmill.telegram.event.base.BasePatternEvent;
import co.aurasphere.botmill.telegram.model.update.Update;

/**
 * An {@link TelegramBotMillEvent} that triggers whenever the users sends a text
 * message that matches a {@link Pattern}.
 * 
 * @author Donato Rimenti
 * 
 */
public class MessagePatternEvent extends BasePatternEvent {

	/**
	 * Instantiates a new MessagePatternEvent.
	 *
	 * @param expectedPattern
	 *            the {@link BasePatternEvent#expectedPattern}.
	 */
	public MessagePatternEvent(Pattern expectedPattern) {
		super(expectedPattern);
	}

	/**
	 * Instantiates a new MessagePatternEvent.
	 *
	 * @param expectedPattern
	 *            the {@link BasePatternEvent#expectedPattern}.
	 */
	public MessagePatternEvent(String expectedPattern) {
		super(expectedPattern);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see co.aurasphere.botmill.telegram.event.TelegramBotMillEvent#
	 * verifyEventCondition(co.aurasphere.botmill.telegram.model.update.Update)
	 */
	public final boolean verifyEventCondition(Update update) {
		String message = safeGetMessage(update);
		return verifyPatternMatch(message);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * co.aurasphere.botmill.telegram.event.base.BasePatternEvent#toString()
	 */
	@Override
	public String toString() {
		return "MessagePatternEvent [expectedPattern=" + expectedPattern + "]";
	}
}
