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
package co.aurasphere.botmill.telegram.model.outcoming;

import org.hibernate.validator.constraints.NotBlank;

import co.aurasphere.botmill.telegram.internal.util.network.TelegramMethod;
import co.aurasphere.botmill.telegram.model.ReplyMarkupOption;
import co.aurasphere.botmill.telegram.model.inline.input.ParseMode;

import com.google.gson.annotations.SerializedName;

/**
 * A message that contains text.
 * 
 * @author Donato Rimenti
 * 
 */
public class TextMessageResponse extends TelegramBotMillResponse {

	/**
	 * The serial version UID.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Text of the message to be sent.
	 */
	@NotBlank
	private String text;

	/**
	 * Send Markdown or HTML, if you want Telegram apps to show bold, italic,
	 * fixed-width text or inline URLs in your bot's message.
	 */
	@SerializedName("parse_mode")
	private ParseMode parseMode;

	/**
	 * Disables link previews for links in this message.
	 */
	@SerializedName("disable_web_page_preview")
	private boolean disableWebPagePreview;

	/**
	 * Sends the message silently. iOS users will not receive a notification,
	 * Android users will receive a notification with no sound.
	 */
	@SerializedName("disable_notification")
	private boolean disableNotification;

	/**
	 * If the message is a reply, ID of the original message.
	 */
	@SerializedName("reply_to_message_id")
	private int replyToMessageId;

	/**
	 * Additional interface options. A JSON-serialized object for an inline
	 * keyboard, custom reply keyboard, instructions to remove reply keyboard or
	 * to force a reply from the user.
	 */
	@SerializedName("reply_markup")
	private ReplyMarkupOption replyMarkup;
	
	/**
	 * Instantiates a new TextMessageResponse.
	 */
	public TextMessageResponse(){
		this.telegramMethod = TelegramMethod.SEND_MESSAGE;
	}

	/**
	 * Gets the {@link #text}.
	 *
	 * @return the {@link #text}.
	 */
	public String getText() {
		return text;
	}

	/**
	 * Sets the {@link #text}.
	 *
	 * @param text
	 *            the {@link #text} to set.
	 */
	public void setText(String text) {
		this.text = text;
	}

	/**
	 * Gets the {@link #parseMode}.
	 *
	 * @return the {@link #parseMode}.
	 */
	public ParseMode getParseMode() {
		return parseMode;
	}

	/**
	 * Sets the {@link #parseMode}.
	 *
	 * @param parseMode
	 *            the {@link #parseMode} to set.
	 */
	public void setParseMode(ParseMode parseMode) {
		this.parseMode = parseMode;
	}

	/**
	 * Gets the {@link #disableWebPagePreview}.
	 *
	 * @return the {@link #disableWebPagePreview}.
	 */
	public boolean isDisableWebPagePreview() {
		return disableWebPagePreview;
	}

	/**
	 * Sets the {@link #disableWebPagePreview}.
	 *
	 * @param disableWebPagePreview
	 *            the {@link #disableWebPagePreview} to set.
	 */
	public void setDisableWebPagePreview(boolean disableWebPagePreview) {
		this.disableWebPagePreview = disableWebPagePreview;
	}

	/**
	 * Gets the {@link #disableNotification}.
	 *
	 * @return the {@link #disableNotification}.
	 */
	public boolean isDisableNotification() {
		return disableNotification;
	}

	/**
	 * Sets the {@link #disableNotification}.
	 *
	 * @param disableNotification
	 *            the {@link #disableNotification} to set.
	 */
	public void setDisableNotification(boolean disableNotification) {
		this.disableNotification = disableNotification;
	}

	/**
	 * Gets the {@link #replyToMessageId}.
	 *
	 * @return the {@link #replyToMessageId}.
	 */
	public int getReplyToMessageId() {
		return replyToMessageId;
	}

	/**
	 * Sets the {@link #replyToMessageId}.
	 *
	 * @param replyToMessageId
	 *            the {@link #replyToMessageId} to set.
	 */
	public void setReplyToMessageId(int replyToMessageId) {
		this.replyToMessageId = replyToMessageId;
	}

	/**
	 * Gets the {@link #replyMarkup}.
	 *
	 * @return the {@link #replyMarkup}.
	 */
	public ReplyMarkupOption getReplyMarkup() {
		return replyMarkup;
	}

	/**
	 * Sets the {@link #replyMarkup}.
	 *
	 * @param replyMarkup
	 *            the {@link #replyMarkup} to set.
	 */
	public void setReplyMarkup(ReplyMarkupOption replyMarkup) {
		this.replyMarkup = replyMarkup;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * co.aurasphere.botmill.telegram.model.outcoming.TelegramBotMillResponse
	 * #hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + (disableNotification ? 1231 : 1237);
		result = prime * result + (disableWebPagePreview ? 1231 : 1237);
		result = prime * result
				+ ((parseMode == null) ? 0 : parseMode.hashCode());
		result = prime * result
				+ ((replyMarkup == null) ? 0 : replyMarkup.hashCode());
		result = prime * result + replyToMessageId;
		result = prime * result + ((text == null) ? 0 : text.hashCode());
		return result;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * co.aurasphere.botmill.telegram.model.outcoming.TelegramBotMillResponse
	 * #equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		TextMessageResponse other = (TextMessageResponse) obj;
		if (disableNotification != other.disableNotification)
			return false;
		if (disableWebPagePreview != other.disableWebPagePreview)
			return false;
		if (parseMode != other.parseMode)
			return false;
		if (replyMarkup == null) {
			if (other.replyMarkup != null)
				return false;
		} else if (!replyMarkup.equals(other.replyMarkup))
			return false;
		if (replyToMessageId != other.replyToMessageId)
			return false;
		if (text == null) {
			if (other.text != null)
				return false;
		} else if (!text.equals(other.text))
			return false;
		return true;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * co.aurasphere.botmill.telegram.model.outcoming.TelegramBotMillResponse
	 * #toString()
	 */
	@Override
	public String toString() {
		return "TextMessageResponse [text=" + text + ", parseMode=" + parseMode
				+ ", disableWebPagePreview=" + disableWebPagePreview
				+ ", disableNotification=" + disableNotification
				+ ", replyToMessageId=" + replyToMessageId + ", replyMarkup="
				+ replyMarkup + ", chatId=" + chatId + "]";
	}

}
