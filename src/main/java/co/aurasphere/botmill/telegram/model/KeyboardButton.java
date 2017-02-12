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

import org.hibernate.validator.constraints.NotBlank;

import com.google.gson.annotations.SerializedName;

/**
 * This object represents one button of the reply keyboard. For simple text
 * buttons String can be used instead of this object to specify text of the
 * button. Optional fields are mutually exclusive.
 * 
 * @author Donato Rimenti
 * 
 */
public class KeyboardButton implements Serializable {

	/**
	 * The serial version UID.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Text of the button. If none of the optional fields are used, it will be
	 * sent to the bot as a message when the button is pressed.
	 */
	@NotBlank
	private String text;

	/**
	 * Optional. If True, the user's phone number will be sent as a contact when
	 * the button is pressed. Available in private chats only.<br/>
	 * <br/>
	 * Note: request_contact and request_location options will only work in
	 * Telegram versions released after 9 April, 2016. Older clients will ignore
	 * them.
	 */
	@SerializedName("request_contact")
	private boolean requestContact;

	/**
	 * Optional. If True, the user's current location will be sent when the
	 * button is pressed. Available in private chats only.<br/>
	 * <br/>
	 * Note: request_contact and request_location options will only work in
	 * Telegram versions released after 9 April, 2016. Older clients will ignore
	 * them.
	 */
	@SerializedName("request_location")
	private boolean requestLocation;

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
	 * Gets the {@link #requestContact}.
	 *
	 * @return the {@link #requestContact}.
	 */
	public boolean isRequestContact() {
		return requestContact;
	}

	/**
	 * Sets the {@link #requestContact}.
	 *
	 * @param requestContact the {@link #requestContact} to set.
	 */
	public void setRequestContact(boolean requestContact) {
		this.requestContact = requestContact;
	}

	/**
	 * Gets the {@link #requestLocation}.
	 *
	 * @return the {@link #requestLocation}.
	 */
	public boolean isRequestLocation() {
		return requestLocation;
	}

	/**
	 * Sets the {@link #requestLocation}.
	 *
	 * @param requestLocation the {@link #requestLocation} to set.
	 */
	public void setRequestLocation(boolean requestLocation) {
		this.requestLocation = requestLocation;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (requestContact ? 1231 : 1237);
		result = prime * result + (requestLocation ? 1231 : 1237);
		result = prime * result + ((text == null) ? 0 : text.hashCode());
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
		KeyboardButton other = (KeyboardButton) obj;
		if (requestContact != other.requestContact)
			return false;
		if (requestLocation != other.requestLocation)
			return false;
		if (text == null) {
			if (other.text != null)
				return false;
		} else if (!text.equals(other.text))
			return false;
		return true;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "KeyboardButton [text=" + text + ", requestContact="
				+ requestContact + ", requestLocation=" + requestLocation + "]";
	}

}
