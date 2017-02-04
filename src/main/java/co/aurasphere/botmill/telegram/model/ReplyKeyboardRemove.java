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

/**
 * Upon receiving a message with this object, Telegram clients will remove the
 * current custom keyboard and display the default letter-keyboard. By default,
 * custom keyboards are displayed until a new keyboard is sent by a bot. An
 * exception is made for one-time keyboards that are hidden immediately after
 * the user presses a button (see {@link ReplyKeyboardMarkup}).
 * 
 * @author Donato Rimenti
 * 
 */
public class ReplyKeyboardRemove implements Serializable {

	/**
	 * The serial version UID.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Requests clients to remove the custom keyboard (user will not be able to
	 * summon this keyboard; if you want to hide the keyboard from sight but
	 * keep it accessible, use one_time_keyboard in {@link ReplyKeyboardMarkup}).
	 */
	@SerializedName("remove_keyboard")
	private boolean removeKeyboard;

	/**
	 * Optional. Use this parameter if you want to remove the keyboard for
	 * specific users only. Targets: 1) users that are @mentioned in the text of
	 * the Message object; 2) if the bot's message is a reply (has
	 * reply_to_message_id), sender of the original message.<br/>
	 * <br/>
	 * Example: A user votes in a poll, bot returns confirmation message in
	 * reply to the vote and removes the keyboard for that user, while still
	 * showing the keyboard with poll options to users who haven't voted yet.
	 */
	private boolean selective;

	/**
	 * Gets the {@link #removeKeyboard}.
	 *
	 * @return the {@link #removeKeyboard}.
	 */
	public boolean isRemoveKeyboard() {
		return removeKeyboard;
	}

	/**
	 * Sets the {@link #removeKeyboard}.
	 *
	 * @param removeKeyboard the {@link #removeKeyboard} to set.
	 */
	public void setRemoveKeyboard(boolean removeKeyboard) {
		this.removeKeyboard = removeKeyboard;
	}

	/**
	 * Gets the {@link #selective}.
	 *
	 * @return the {@link #selective}.
	 */
	public boolean isSelective() {
		return selective;
	}

	/**
	 * Sets the {@link #selective}.
	 *
	 * @param selective the {@link #selective} to set.
	 */
	public void setSelective(boolean selective) {
		this.selective = selective;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (removeKeyboard ? 1231 : 1237);
		result = prime * result + (selective ? 1231 : 1237);
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
		ReplyKeyboardRemove other = (ReplyKeyboardRemove) obj;
		if (removeKeyboard != other.removeKeyboard)
			return false;
		if (selective != other.selective)
			return false;
		return true;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "ReplyKeyboardRemove [removeKeyboard=" + removeKeyboard
				+ ", selective=" + selective + "]";
	}

}
