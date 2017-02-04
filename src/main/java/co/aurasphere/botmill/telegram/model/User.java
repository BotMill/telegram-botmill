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
 * This object represents a Telegram user or bot.
 * 
 * @author Donato Rimenti
 * 
 */
public class User implements Serializable {
	
	/**
	 * The serial version UID.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Unique identifier for this user or bot.
	 */
	private String id;
	
	/**
	 * User‘s or bot’s first name.
	 */
	@SerializedName("first_name")
	private String firstName;
	
	/**
	 * Optional. User‘s or bot’s last name.
	 */
	@SerializedName("last_name")
	private String lastName;
	
	/**
	 * Optional. User‘s or bot’s username.
	 */
	private String userName;

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
	 * Gets the {@link #firstName}.
	 *
	 * @return the {@link #firstName}.
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * Sets the {@link #firstName}.
	 *
	 * @param firstName the {@link #firstName} to set.
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * Gets the {@link #lastName}.
	 *
	 * @return the {@link #lastName}.
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * Sets the {@link #lastName}.
	 *
	 * @param lastName the {@link #lastName} to set.
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * Gets the {@link #userName}.
	 *
	 * @return the {@link #userName}.
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * Sets the {@link #userName}.
	 *
	 * @param userName the {@link #userName} to set.
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result
				+ ((lastName == null) ? 0 : lastName.hashCode());
		result = prime * result
				+ ((userName == null) ? 0 : userName.hashCode());
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
		User other = (User) obj;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		if (userName == null) {
			if (other.userName != null)
				return false;
		} else if (!userName.equals(other.userName))
			return false;
		return true;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "User [id=" + id + ", firstName=" + firstName + ", lastName="
				+ lastName + ", userName=" + userName + "]";
	}

}
