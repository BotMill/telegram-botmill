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
package co.aurasphere.botmill.telegram.model;

import java.io.Serializable;

import co.aurasphere.botmill.telegram.model.game.CallbackGame;

import com.google.gson.annotations.SerializedName;

/**
 * This object represents one button of an inline keyboard. You must use exactly
 * one of the optional fields.
 * 
 * @author Donato Rimenti
 * 
 */
public class InlineKeyboardButton implements Serializable {

	/**
	 * The serial version UID.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Label text on the button.
	 */
	private String text;

	/**
	 * Optional. HTTP url to be opened when button is pressed.
	 */
	private String url;

	/**
	 * Optional. Data to be sent in a {@link CallbackQuery} to the bot when
	 * button is pressed, 1-64 bytes.
	 */
	@SerializedName("callback_data")
	private String callbackData;

	/**
	 * Optional. If set, pressing the button will prompt the user to select one
	 * of their chats, open that chat and insert the bot‘s username and the
	 * specified inline query in the input field. Can be empty, in which case
	 * just the bot’s username will be inserted.<br/>
	 * <br/>
	 * Note: This offers an easy way for users to start using your bot in inline
	 * mode when they are currently in a private chat with it. Especially useful
	 * when combined with switch_pm… actions – in this case the user will be
	 * automatically returned to the chat they switched from, skipping the chat
	 * selection screen.
	 * 
	 * @see <a href="https://core.telegram.org/bots/inline">Inline Mode</a>.
	 */
	@SerializedName("switch_inline_query")
	private String switchInlineQuery;

	/**
	 * Optional. If set, pressing the button will insert the bot‘s username and
	 * the specified inline query in the current chat's input field. Can be
	 * empty, in which case only the bot’s username will be inserted.<br/>
	 * <br/>
	 * This offers a quick way for the user to open your bot in inline mode in
	 * the same chat – good for selecting something from multiple options.
	 */
	@SerializedName("switch_inline_query_current_chat")
	private String switchInlineQueryCurrentChat;

	/**
	 * Optional. Description of the game that will be launched when the user
	 * presses the button.<br/>
	 * <br/>
	 * NOTE: This type of button must always be the first button in the first
	 * row.
	 */
	@SerializedName("callback_game")
	private CallbackGame callbackGame;

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
	 * @param text the {@link #text} to set.
	 */
	public void setText(String text) {
		this.text = text;
	}

	/**
	 * Gets the {@link #url}.
	 *
	 * @return the {@link #url}.
	 */
	public String getUrl() {
		return url;
	}

	/**
	 * Sets the {@link #url}.
	 *
	 * @param url the {@link #url} to set.
	 */
	public void setUrl(String url) {
		this.url = url;
	}

	/**
	 * Gets the {@link #callbackData}.
	 *
	 * @return the {@link #callbackData}.
	 */
	public String getCallbackData() {
		return callbackData;
	}

	/**
	 * Sets the {@link #callbackData}.
	 *
	 * @param callbackData the {@link #callbackData} to set.
	 */
	public void setCallbackData(String callbackData) {
		this.callbackData = callbackData;
	}

	/**
	 * Gets the {@link #switchInlineQuery}.
	 *
	 * @return the {@link #switchInlineQuery}.
	 */
	public String getSwitchInlineQuery() {
		return switchInlineQuery;
	}

	/**
	 * Sets the {@link #switchInlineQuery}.
	 *
	 * @param switchInlineQuery the {@link #switchInlineQuery} to set.
	 */
	public void setSwitchInlineQuery(String switchInlineQuery) {
		this.switchInlineQuery = switchInlineQuery;
	}

	/**
	 * Gets the {@link #switchInlineQueryCurrentChat}.
	 *
	 * @return the {@link #switchInlineQueryCurrentChat}.
	 */
	public String getSwitchInlineQueryCurrentChat() {
		return switchInlineQueryCurrentChat;
	}

	/**
	 * Sets the {@link #switchInlineQueryCurrentChat}.
	 *
	 * @param switchInlineQueryCurrentChat the {@link #switchInlineQueryCurrentChat} to set.
	 */
	public void setSwitchInlineQueryCurrentChat(String switchInlineQueryCurrentChat) {
		this.switchInlineQueryCurrentChat = switchInlineQueryCurrentChat;
	}

	/**
	 * Gets the {@link #callbackGame}.
	 *
	 * @return the {@link #callbackGame}.
	 */
	public CallbackGame getCallbackGame() {
		return callbackGame;
	}

	/**
	 * Sets the {@link #callbackGame}.
	 *
	 * @param callbackGame the {@link #callbackGame} to set.
	 */
	public void setCallbackGame(CallbackGame callbackGame) {
		this.callbackGame = callbackGame;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((callbackData == null) ? 0 : callbackData.hashCode());
		result = prime
				* result
				+ ((switchInlineQuery == null) ? 0 : switchInlineQuery
						.hashCode());
		result = prime
				* result
				+ ((switchInlineQueryCurrentChat == null) ? 0
						: switchInlineQueryCurrentChat.hashCode());
		result = prime * result + ((text == null) ? 0 : text.hashCode());
		result = prime * result + ((url == null) ? 0 : url.hashCode());
		return result;
	}

	/* (non-Javadoc)
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
		InlineKeyboardButton other = (InlineKeyboardButton) obj;
		if (callbackData == null) {
			if (other.callbackData != null)
				return false;
		} else if (!callbackData.equals(other.callbackData))
			return false;
		if (switchInlineQuery == null) {
			if (other.switchInlineQuery != null)
				return false;
		} else if (!switchInlineQuery.equals(other.switchInlineQuery))
			return false;
		if (switchInlineQueryCurrentChat == null) {
			if (other.switchInlineQueryCurrentChat != null)
				return false;
		} else if (!switchInlineQueryCurrentChat
				.equals(other.switchInlineQueryCurrentChat))
			return false;
		if (text == null) {
			if (other.text != null)
				return false;
		} else if (!text.equals(other.text))
			return false;
		if (url == null) {
			if (other.url != null)
				return false;
		} else if (!url.equals(other.url))
			return false;
		return true;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "InlineKeyboardButton [text=" + text + ", url=" + url
				+ ", callbackData=" + callbackData + ", switchInlineQuery="
				+ switchInlineQuery + ", switchInlineQueryCurrentChat="
				+ switchInlineQueryCurrentChat + "]";
	}

}
