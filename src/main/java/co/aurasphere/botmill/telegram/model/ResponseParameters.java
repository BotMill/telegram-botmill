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
 * Contains information about why a request was unsuccessfull.
 * 
 * @author Donato Rimenti
 * 
 */
public class ResponseParameters implements Serializable {

	/**
	 * The serial version UID.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Optional. The group has been migrated to a supergroup with the specified
	 * identifier. This number may be greater than 32 bits and some programming
	 * languages may have difficulty/silent defects in interpreting it. But it
	 * is smaller than 52 bits, so a signed 64 bit integer or double-precision
	 * float type are safe for storing this identifier.
	 */
	@SerializedName("migrate_to_chat_id")
	private String migrateToChatId;

	/**
	 * Optional. In case of exceeding flood control, the number of seconds left
	 * to wait before the request can be repeated.
	 */
	@SerializedName("retry_after")
	private int retryAfter;

	/**
	 * Gets the {@link #migrateToChatId}.
	 *
	 * @return the {@link #migrateToChatId}.
	 */
	public String getMigrateToChatId() {
		return migrateToChatId;
	}

	/**
	 * Sets the {@link #migrateToChatId}.
	 *
	 * @param migrateToChatId the {@link #migrateToChatId} to set.
	 */
	public void setMigrateToChatId(String migrateToChatId) {
		this.migrateToChatId = migrateToChatId;
	}

	/**
	 * Gets the {@link #retryAfter}.
	 *
	 * @return the {@link #retryAfter}.
	 */
	public int getRetryAfter() {
		return retryAfter;
	}

	/**
	 * Sets the {@link #retryAfter}.
	 *
	 * @param retryAfter the {@link #retryAfter} to set.
	 */
	public void setRetryAfter(int retryAfter) {
		this.retryAfter = retryAfter;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((migrateToChatId == null) ? 0 : migrateToChatId.hashCode());
		result = prime * result + retryAfter;
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
		ResponseParameters other = (ResponseParameters) obj;
		if (migrateToChatId == null) {
			if (other.migrateToChatId != null)
				return false;
		} else if (!migrateToChatId.equals(other.migrateToChatId))
			return false;
		if (retryAfter != other.retryAfter)
			return false;
		return true;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "ResponseParameters [migrateToChatId=" + migrateToChatId
				+ ", retryAfter=" + retryAfter + "]";
	}

}
