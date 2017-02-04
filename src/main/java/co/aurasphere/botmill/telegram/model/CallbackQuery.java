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

import com.google.gson.annotations.SerializedName;

//TODO: link the methods in the javadoc note
/**
 * This object represents an incoming callback query from a callback button in
 * an <a href=
 * "https://core.telegram.org/bots#inline-keyboards-and-on-the-fly-updating"
 * >inline keyboard</a>. If the button that originated the query was attached to
 * a message sent by the bot, the field message will be present. If the button
 * was attached to a message sent via the bot (in inline mode), the field
 * inline_message_id will be present. Exactly one of the fields data or
 * game_short_name will be present.<br/>
 *  <br/>
 * NOTE: After the user presses an inline button, Telegram clients will display
 * a progress bar until you call answerCallbackQuery. It is, therefore,
 * necessary to react by calling answerCallbackQuery even if no notification to
 * the user is needed (e.g., without specifying any of the optional parameters).
 * 
 * @see <a href="https://core.telegram.org/bots/inline">Inline Mode</a>.
 * 
 * @author Donato Rimenti
 * 
 */
public class CallbackQuery implements Serializable {

	/**
	 * The serial version UID.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Unique identifier for this query.
	 */
	private String id;

	/**
	 * Sender.
	 */
	private User from;

	/**
	 * Optional. Message with the callback button that originated the query.
	 * Note that message content and message date will not be available if the
	 * message is too old.
	 */
	private Message message;

	/**
	 * Optional. Identifier of the message sent via the bot in inline mode, that
	 * originated the query.
	 */
	@SerializedName("inline_message_id")
	private String inlineMessageId;

	/**
	 * Global identifier, uniquely corresponding to the chat to which the
	 * message with the callback button was sent. Useful for high scores in <a
	 * href="https://core.telegram.org/bots/api#games">games</a>.
	 */
	@SerializedName("chat_instance")
	private String chatInstance;

	/**
	 * Optional. Data associated with the callback button. Be aware that a bad
	 * client can send arbitrary data in this field.
	 */
	private String data;

	/**
	 * Optional. Short name of a <a
	 * href="https://core.telegram.org/bots/api#games">Game</a> to be returned,
	 * serves as the unique identifier for the game.
	 */
	@SerializedName("game_short_name")
	private String gameShortName;

	/**
	 * Gets the {@link #id}.
	 *
	 * @return the {@link #id}.
	 */
	public String getId() {
		return id;
	}

	/**
	 * Sets the {@link #id}.
	 *
	 * @param id the {@link #id} to set.
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * Gets the {@link #from}.
	 *
	 * @return the {@link #from}.
	 */
	public User getFrom() {
		return from;
	}

	/**
	 * Sets the {@link #from}.
	 *
	 * @param from the {@link #from} to set.
	 */
	public void setFrom(User from) {
		this.from = from;
	}

	/**
	 * Gets the {@link #message}.
	 *
	 * @return the {@link #message}.
	 */
	public Message getMessage() {
		return message;
	}

	/**
	 * Sets the {@link #message}.
	 *
	 * @param message the {@link #message} to set.
	 */
	public void setMessage(Message message) {
		this.message = message;
	}

	/**
	 * Gets the {@link #inlineMessageId}.
	 *
	 * @return the {@link #inlineMessageId}.
	 */
	public String getInlineMessageId() {
		return inlineMessageId;
	}

	/**
	 * Sets the {@link #inlineMessageId}.
	 *
	 * @param inlineMessageId the {@link #inlineMessageId} to set.
	 */
	public void setInlineMessageId(String inlineMessageId) {
		this.inlineMessageId = inlineMessageId;
	}

	/**
	 * Gets the {@link #chatInstance}.
	 *
	 * @return the {@link #chatInstance}.
	 */
	public String getChatInstance() {
		return chatInstance;
	}

	/**
	 * Sets the {@link #chatInstance}.
	 *
	 * @param chatInstance the {@link #chatInstance} to set.
	 */
	public void setChatInstance(String chatInstance) {
		this.chatInstance = chatInstance;
	}

	/**
	 * Gets the {@link #data}.
	 *
	 * @return the {@link #data}.
	 */
	public String getData() {
		return data;
	}

	/**
	 * Sets the {@link #data}.
	 *
	 * @param data the {@link #data} to set.
	 */
	public void setData(String data) {
		this.data = data;
	}

	/**
	 * Gets the {@link #gameShortName}.
	 *
	 * @return the {@link #gameShortName}.
	 */
	public String getGameShortName() {
		return gameShortName;
	}

	/**
	 * Sets the {@link #gameShortName}.
	 *
	 * @param gameShortName the {@link #gameShortName} to set.
	 */
	public void setGameShortName(String gameShortName) {
		this.gameShortName = gameShortName;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((chatInstance == null) ? 0 : chatInstance.hashCode());
		result = prime * result + ((data == null) ? 0 : data.hashCode());
		result = prime * result + ((from == null) ? 0 : from.hashCode());
		result = prime * result
				+ ((gameShortName == null) ? 0 : gameShortName.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result
				+ ((inlineMessageId == null) ? 0 : inlineMessageId.hashCode());
		result = prime * result + ((message == null) ? 0 : message.hashCode());
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
		CallbackQuery other = (CallbackQuery) obj;
		if (chatInstance == null) {
			if (other.chatInstance != null)
				return false;
		} else if (!chatInstance.equals(other.chatInstance))
			return false;
		if (data == null) {
			if (other.data != null)
				return false;
		} else if (!data.equals(other.data))
			return false;
		if (from == null) {
			if (other.from != null)
				return false;
		} else if (!from.equals(other.from))
			return false;
		if (gameShortName == null) {
			if (other.gameShortName != null)
				return false;
		} else if (!gameShortName.equals(other.gameShortName))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (inlineMessageId == null) {
			if (other.inlineMessageId != null)
				return false;
		} else if (!inlineMessageId.equals(other.inlineMessageId))
			return false;
		if (message == null) {
			if (other.message != null)
				return false;
		} else if (!message.equals(other.message))
			return false;
		return true;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "CallbackQuery [id=" + id + ", from=" + from + ", message="
				+ message + ", inlineMessageId=" + inlineMessageId
				+ ", chatInstance=" + chatInstance + ", data=" + data
				+ ", gameShortName=" + gameShortName + "]";
	}

}
