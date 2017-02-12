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

import java.io.Serializable;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import co.aurasphere.botmill.telegram.internal.util.network.TelegramMethod;

import com.google.gson.annotations.SerializedName;

/**
 * Object that represents a TelegramBotMill response.
 * 
 * @author Donato Rimenti
 */
public abstract class TelegramBotMillResponse implements Serializable {

	/**
	 * The serial version UID.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Unique identifier for the target chat or username of the target channel
	 * (in the format @channelusername).
	 */
	@Valid
	@NotNull
	@SerializedName("chat_id")
	protected String chatId;

	/**
	 * The Telegram method of this response.
	 */
	@NotNull
	protected transient TelegramMethod telegramMethod;

	/**
	 * Gets the {@link #chatId}.
	 *
	 * @return the {@link #chatId}.
	 */
	public String getChatId() {
		return chatId;
	}

	/**
	 * Sets the {@link #chatId}.
	 *
	 * @param chatId
	 *            the {@link #chatId} to set.
	 */
	public void setChatId(String chatId) {
		this.chatId = chatId;
	}

	/**
	 * Gets the {@link #telegramMethod}.
	 *
	 * @return the {@link #telegramMethod}.
	 */
	public TelegramMethod getTelegramMethod() {
		return telegramMethod;
	}

	/**
	 * Sets the {@link #telegramMethod}.
	 *
	 * @param telegramMethod
	 *            the {@link #telegramMethod} to set.
	 */
	public void setTelegramMethod(TelegramMethod telegramMethod) {
		this.telegramMethod = telegramMethod;
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
		result = prime * result + ((chatId == null) ? 0 : chatId.hashCode());
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
		TelegramBotMillResponse other = (TelegramBotMillResponse) obj;
		if (chatId == null) {
			if (other.chatId != null)
				return false;
		} else if (!chatId.equals(other.chatId))
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
		return "TelegramBotMillResponse [chatId=" + chatId + "]";
	}

}
