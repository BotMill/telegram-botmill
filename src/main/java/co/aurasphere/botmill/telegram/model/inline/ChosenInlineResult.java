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
package co.aurasphere.botmill.telegram.model.inline;

import java.io.Serializable;

import co.aurasphere.botmill.telegram.model.CallbackQuery;
import co.aurasphere.botmill.telegram.model.InlineKeyboardMarkup;
import co.aurasphere.botmill.telegram.model.Location;
import co.aurasphere.botmill.telegram.model.User;

import com.google.gson.annotations.SerializedName;

/**
 * Represents a result of an inline query that was chosen by the user and sent
 * to their chat partner.
 * 
 * @author Donato Rimenti
 * 
 */
public class ChosenInlineResult implements Serializable {

	/**
	 * The serial version UID.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The unique identifier for the result that was chosen.
	 */
	@SerializedName("result_id")
	private String resultId;

	/**
	 * The user that chose the result.
	 */
	private User from;

	/**
	 * Optional. Sender location, only for bots that require user location.
	 */
	private Location location;

	// TODO: link below javadoc to edit message when implemented.
	/**
	 * Optional. Identifier of the sent inline message. Available only if there
	 * is an {@link InlineKeyboardMarkup} attached to the message. Will be also
	 * received in @link {@link CallbackQuery} and can be used to edit the
	 * message.
	 */
	@SerializedName("inline_message_id")
	private String inlineMessageId;

	/**
	 * The query that was used to obtain the result.
	 */
	private String query;

	/**
	 * Gets the {@link #resultId}.
	 *
	 * @return the {@link #resultId}.
	 */
	public String getResultId() {
		return resultId;
	}

	/**
	 * Sets the {@link #resultId}.
	 *
	 * @param resultId the {@link #resultId} to set.
	 */
	public void setResultId(String resultId) {
		this.resultId = resultId;
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
	 * Gets the {@link #location}.
	 *
	 * @return the {@link #location}.
	 */
	public Location getLocation() {
		return location;
	}

	/**
	 * Sets the {@link #location}.
	 *
	 * @param location the {@link #location} to set.
	 */
	public void setLocation(Location location) {
		this.location = location;
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
	 * Gets the {@link #query}.
	 *
	 * @return the {@link #query}.
	 */
	public String getQuery() {
		return query;
	}

	/**
	 * Sets the {@link #query}.
	 *
	 * @param query the {@link #query} to set.
	 */
	public void setQuery(String query) {
		this.query = query;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((inlineMessageId == null) ? 0 : inlineMessageId.hashCode());
		result = prime * result + ((query == null) ? 0 : query.hashCode());
		result = prime * result
				+ ((resultId == null) ? 0 : resultId.hashCode());
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
		ChosenInlineResult other = (ChosenInlineResult) obj;
		if (inlineMessageId == null) {
			if (other.inlineMessageId != null)
				return false;
		} else if (!inlineMessageId.equals(other.inlineMessageId))
			return false;
		if (query == null) {
			if (other.query != null)
				return false;
		} else if (!query.equals(other.query))
			return false;
		if (resultId == null) {
			if (other.resultId != null)
				return false;
		} else if (!resultId.equals(other.resultId))
			return false;
		return true;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "ChosenInlineResult [resultId=" + resultId
				+ ", inlineMessageId=" + inlineMessageId + ", query=" + query
				+ "]";
	}
}
