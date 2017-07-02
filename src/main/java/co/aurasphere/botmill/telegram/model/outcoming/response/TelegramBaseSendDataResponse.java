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
package co.aurasphere.botmill.telegram.model.outcoming.response;

import co.aurasphere.botmill.telegram.model.ReplyMarkupOption;
import co.aurasphere.botmill.telegram.model.outcoming.TelegramBotMillResponse;

import com.google.gson.annotations.SerializedName;

/**
 * Base Telegram class for responses that sends messages in chats.
 * 
 * @author Donato Rimenti
 */
public class TelegramBaseSendDataResponse extends TelegramBotMillResponse {

	/**
	 * The serial version UID.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Sends the message silently. iOS users will not receive a notification,
	 * Android users will receive a notification with no sound.
	 */
	@SerializedName("disable_notification")
	protected boolean disableNotification;

	/**
	 * If the message is a reply, ID of the original message.
	 */
	@SerializedName("reply_to_message_id")
	protected int replyToMessageId;

	/**
	 * Additional interface options. A JSON-serialized object for an inline
	 * keyboard, custom reply keyboard, instructions to remove reply keyboard or
	 * to force a reply from the user.
	 */
	@SerializedName("reply_markup")
	protected ReplyMarkupOption replyMarkup;

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
		result = prime * result
				+ ((replyMarkup == null) ? 0 : replyMarkup.hashCode());
		result = prime * result + replyToMessageId;
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
		TelegramBaseSendDataResponse other = (TelegramBaseSendDataResponse) obj;
		if (disableNotification != other.disableNotification)
			return false;
		if (replyMarkup == null) {
			if (other.replyMarkup != null)
				return false;
		} else if (!replyMarkup.equals(other.replyMarkup))
			return false;
		if (replyToMessageId != other.replyToMessageId)
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
		return "TelegramBaseSendDataResponse [disableNotification="
				+ disableNotification + ", replyToMessageId="
				+ replyToMessageId + ", replyMarkup=" + replyMarkup
				+ ", chatId=" + chatId + ", telegramMethod=" + telegramMethod
				+ "]";
	}

}
