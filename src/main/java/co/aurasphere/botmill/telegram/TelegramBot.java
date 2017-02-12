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

import java.util.ArrayList;
import java.util.List;

import co.aurasphere.botmill.common.BotMillPolicy;
import co.aurasphere.botmill.telegram.actionframe.ActionFrame;
import co.aurasphere.botmill.telegram.autoreply.AutoReply;
import co.aurasphere.botmill.telegram.event.TelegramBotMillEvent;
import co.aurasphere.botmill.telegram.model.update.Update;

/**
 * Class that represents a TelegramBotMill bot. Each bot has a list of
 * {@link TelegramBotMillEvent}. An event is a callback from Telegram Platform.
 * At each callback received from Telegram, all registered bots callbacks
 * handler are checked. If any callback condition is verified, then the
 * callback handler method is called.
 *
 * @author Donato Rimenti
 */
public class TelegramBot {

	/**
	 * A list of registered {@link TelegramBotMillEvent} for the current bot.
	 */
	private List<ActionFrame> actionFrameList;

	/**
	 * The policy this bot follows when processing the callback handler list.
	 */
	private BotMillPolicy botMillPolicy;

	/**
	 * Instantiates a new TelegramBot with a default policy of
	 * {@link TelegramBotMillPolicy#FIRST_ONLY}.
	 */
	public TelegramBot() {
		this(BotMillPolicy.FIRST_ONLY);
	}

	/**
	 * Instantiates a new TelegramBot.
	 *
	 * @param botMillPolicy
	 *            the {@link #botMillPolicy}.
	 */
	public TelegramBot(BotMillPolicy botMillPolicy) {
		if (botMillPolicy == null) {
			botMillPolicy = BotMillPolicy.FIRST_ONLY;
		}
		this.botMillPolicy = botMillPolicy;
		this.actionFrameList = new ArrayList<ActionFrame>();
		TelegramBotMillContext.getInstance().register(this);
	}

	/**
	 * Adds an {@link ActionFrame} to this bot.
	 * 
	 * @param actionFrame
	 *            the actionFrame to add.
	 */
	public void addActionFrame(ActionFrame actionFrame) {
		this.actionFrameList.add(actionFrame);
	}

	/**
	 * Adds an {@link ActionFrame} to this bot.
	 * 
	 * @param event
	 *            the {@link TelegramBotMillEvent} to handle.
	 * @param reply
	 *            the {@link AutoReply} which should handle the event.
	 */
	public void addActionFrame(TelegramBotMillEvent event, AutoReply reply) {
		ActionFrame frame = new ActionFrame(event, reply);
		this.actionFrameList.add(frame);
	}

	/**
	 * Adds an {@link ActionFrame} to this bot with multiple reply.
	 * 
	 * @param event
	 *            the {@link TelegramBotMillEvent} to handle.
	 * @param replies
	 *            the collection of {@link AutoReply} which should handle the
	 *            event.
	 */
	public void addActionFrame(TelegramBotMillEvent event, AutoReply... replies) {
		ActionFrame frame = new ActionFrame(event, replies);
		this.actionFrameList.add(frame);
	}

	/**
	 * Checks if there's any registered {@link TelegramBotMillEvent} for the
	 * incoming callback. If there's any, then the callback is handled. The
	 * chain will be processed according to the {@link TelegramBotMillPolicy}
	 * followed by this bot. If the policy is {@link BotMillPolicy#FIRST_ONLY},
	 * the chain will be processed until the first callback matches. Otherwise,
	 * if the policy is {@link BotMillPolicy#PROCESS_ALL}, all the chain will
	 * always be processed.
	 * 
	 * @param update
	 *            the incoming message.
	 */
	public void processMessage(Update update) {
		for (ActionFrame f : this.actionFrameList) {
			// If the policy is FIRST_ONLY stop processing the chain at the
			// first trigger.
			if (f.getReplies() != null && f.getReplies().length > 0) {
				if (f.processMultipleReply(update)
						&& this.botMillPolicy.equals(BotMillPolicy.FIRST_ONLY)) {
					break;
				}
			} else {
				if (f.process(update)
						&& this.botMillPolicy.equals(BotMillPolicy.FIRST_ONLY)) {
					break;
				}
			}
		}
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
		result = prime * result
				+ ((actionFrameList == null) ? 0 : actionFrameList.hashCode());
		result = prime * result
				+ ((botMillPolicy == null) ? 0 : botMillPolicy.hashCode());
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
		TelegramBot other = (TelegramBot) obj;
		if (actionFrameList == null) {
			if (other.actionFrameList != null)
				return false;
		} else if (!actionFrameList.equals(other.actionFrameList))
			return false;
		if (botMillPolicy != other.botMillPolicy)
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
		return "TelegramBot [actionFrameList=" + actionFrameList + ", policy="
				+ botMillPolicy + "]";
	}

}
