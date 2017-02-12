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

import org.hibernate.validator.constraints.NotBlank;

import co.aurasphere.botmill.telegram.model.outcoming.TelegramBotMillResponse;
import co.aurasphere.botmill.telegram.model.outcoming.factory.ReplyFactory;
import co.aurasphere.botmill.telegram.model.update.Update;

/**
 * An {@link AutoReply} that replies with a specified message.
 * 
 * @author Donato Rimenti
 * 
 */
public class MessageAutoReply extends AutoReply {

	/**
	 * The reply message. It can't be blank.
	 */
	@NotBlank
	private String replyMessage;

	/**
	 * Instantiates a new message auto reply.
	 *
	 * @param replyMessage
	 *            the {@link #replyMessage}.
	 */
	public MessageAutoReply(String replyMessage) {
		this.replyMessage = replyMessage;
	}

	/**
	 * {@inheritDoc} It replies with the message specified in the constructor.
	 */
	public TelegramBotMillResponse createResponse(Update update) {
		return ReplyFactory.addTextMessageOnly(this.replyMessage).build(update);
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
		result = prime * result + ((replyMessage == null) ? 0 : replyMessage.hashCode());
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
		MessageAutoReply other = (MessageAutoReply) obj;
		if (replyMessage == null) {
			if (other.replyMessage != null)
				return false;
		} else if (!replyMessage.equals(other.replyMessage))
			return false;
		return true;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see co.aurasphere.botmill.telegram.autoreply.AutoReply#toString()
	 */
	@Override
	public String toString() {
		return "MessageAutoReply [replyMessage=" + replyMessage + "]";
	}

}
