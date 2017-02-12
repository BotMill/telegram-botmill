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

import co.aurasphere.botmill.telegram.model.ReplyMarkupOption;
import co.aurasphere.botmill.telegram.model.inline.input.ParseMode;
import co.aurasphere.botmill.telegram.model.outcoming.TelegramBotMillResponse;
import co.aurasphere.botmill.telegram.model.outcoming.TextMessageResponse;
import co.aurasphere.botmill.telegram.model.update.Update;

/**
 * A builder for a message that contains only a plain text message.
 * 
 * @author Donato Rimenti
 */
public class TextMessageResponseBuilder extends TelegramBotMillResponseBuilder {

	/**
	 * The response of this builder.
	 */
	private TextMessageResponse response;

	/**
	 * Default constructor. Creates a builder for a message that contains only a
	 * plain text message.
	 * 
	 * @param text
	 *            the text of the message.
	 */
	TextMessageResponseBuilder(String text) {
		this.response = new TextMessageResponse();
		this.response.setText(text);
	}

	/**
	 * Sets the parse mode.
	 *
	 * @param parseMode
	 *            the {@link TextMessageResponse#parseMode}.
	 * @return this builder.
	 */
	public TextMessageResponseBuilder setParseMode(ParseMode parseMode) {
		this.response.setParseMode(parseMode);
		return this;
	}

	/**
	 * Disables web page preview. See
	 * {@link TextMessageResponse#disableWebPagePreview}.
	 *
	 * @return this builder.
	 */
	public TextMessageResponseBuilder disableWebPagePreview() {
		this.response.setDisableWebPagePreview(true);
		return this;
	}

	/**
	 * Disables notification for this message. See
	 * {@link TextMessageResponse#disableNotification}.
	 *
	 * @return this builder.
	 */
	public TextMessageResponseBuilder disableNotification() {
		this.response.setDisableNotification(true);
		return this;
	}

	/**
	 * Makes this response a reply of the message with ID passed.
	 *
	 * @param messageId
	 *            the {@link TextMessageResponse#messageId}.
	 * @return this builder.
	 */
	public TextMessageResponseBuilder replyToMessageId(int messageId) {
		this.response.setReplyToMessageId(messageId);
		return this;
	}

	/**
	 * Sets the reply markup.
	 *
	 * @param replyMarkup
	 *            the {@link TextMessageResponse#replyMarkup}.
	 * @return this builder.
	 */
	public TextMessageResponseBuilder setReplyMarkup(
			ReplyMarkupOption replyMarkup) {
		this.response.setReplyMarkup(replyMarkup);
		return this;
	}

	/**
	 * {@inheritDoc} Returns a response containing a plain text message.
	 */
	public TelegramBotMillResponse build(Update update) {
		String chatId = safeGetChatId(update);
		this.response.setChatId(chatId);
		return response;
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
				+ ((response == null) ? 0 : response.hashCode());
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
		TextMessageResponseBuilder other = (TextMessageResponseBuilder) obj;
		if (response == null) {
			if (other.response != null)
				return false;
		} else if (!response.equals(other.response))
			return false;
		return true;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see co.aurasphere.botmill.telegram.model.outcoming.factory.
	 * TelegramBotMillResponseBuilder#toString()
	 */
	@Override
	public String toString() {
		return "TextMessageResponseBuilder [response=" + response + "]";
	}

}