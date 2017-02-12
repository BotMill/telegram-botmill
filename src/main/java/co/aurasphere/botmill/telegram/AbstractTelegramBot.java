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

import co.aurasphere.botmill.telegram.actionframe.ActionFrame;
import co.aurasphere.botmill.telegram.autoreply.AutoReply;
import co.aurasphere.botmill.telegram.event.TelegramBotMillEvent;

/**
 * Base {@link TelegramBotDefinition} implementation that takes care of the
 * {@link TelegramBot} handling.
 * 
 * @author Donato Rimenti
 * 
 */
public abstract class AbstractTelegramBot implements TelegramBotDefinition {

	/**
	 * The {@link TelegramBot} object handled by this class.
	 */
	protected TelegramBot telegramBot;

	/**
	 * Base constructor. Instantiates a {@link TelegramBot} and registers it to the
	 * context.
	 */
	public AbstractTelegramBot() {
		this.telegramBot = new TelegramBot();
	}

	/**
	 * Adds an {@link ActionFrame} to the current bot.
	 * 
	 * @param actionFrame
	 *            the ActionFrame to add.
	 */
	protected void addActionFrame(ActionFrame actionFrame) {
		telegramBot.addActionFrame(actionFrame);
	}

	/**
	 * Adds an {@link ActionFrame} to the current bot.
	 * 
	 * @param event
	 *            the {@link TelegramBotMillEvent} that triggers the ActionFrame.
	 * @param reply
	 *            the {@link AutoReply} to return when the event is triggered.
	 */
	protected void addActionFrame(TelegramBotMillEvent event, AutoReply reply) {
		telegramBot.addActionFrame(event, reply);
	}

	/**
	 * Adds an {@link ActionFrame} to the current bot.
	 * 
	 * @param event
	 *            the {@link TelegramBotMillEvent} that triggers the ActionFrame.
	 * @param replies
	 *            the list of {@link AutoReply} to return when the event is
	 *            triggered.
	 */
	protected void addActionFrame(TelegramBotMillEvent event, AutoReply... replies) {
		telegramBot.addActionFrame(event, replies);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((telegramBot == null) ? 0 : telegramBot.hashCode());
		return result;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AbstractTelegramBot other = (AbstractTelegramBot) obj;
		if (telegramBot == null) {
			if (other.telegramBot != null)
				return false;
		} else if (!telegramBot.equals(other.telegramBot))
			return false;
		return true;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "AbstractTelegramBot [telegramBot=" + telegramBot + "]";
	}

}
