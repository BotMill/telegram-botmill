package co.aurasphere.botmill.telegram.model.inline.input;

import com.google.gson.annotations.SerializedName;

/**
 * Represents the content of a contact message to be sent as the result of an
 * inline query. <br/>
 * <br/>
 * Note: This will only work in Telegram versions released after 9 April, 2016.
 * Older clients will ignore them.
 * 
 * @author Donato Rimenti
 * @date Dec 27, 2016
 */
public class InputContactMessageContent extends InputMessageContent {

	/**
	 * The serial version UID.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Contact's phone number.
	 */
	@SerializedName("phone_number")
	private String phoneNumber;

	/**
	 * Contact's first name.
	 */
	@SerializedName("first_name")
	private String firstName;

	/**
	 * Optional. Contact's last name.
	 */
	@SerializedName("last_name")
	private String lastName;

	/**
	 * Gets the {@link #phoneNumber}.
	 *
	 * @return the {@link #phoneNumber}.
	 */
	public String getPhoneNumber() {
		return phoneNumber;
	}

	/**
	 * Sets the {@link #phoneNumber}.
	 *
	 * @param phoneNumber
	 *            the {@link #phoneNumber} to set.
	 */
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
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
	 * @param firstName
	 *            the {@link #firstName} to set.
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
	 * @param lastName
	 *            the {@link #lastName} to set.
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
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
		result = prime * result
				+ ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result
				+ ((lastName == null) ? 0 : lastName.hashCode());
		result = prime * result
				+ ((phoneNumber == null) ? 0 : phoneNumber.hashCode());
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
		InputContactMessageContent other = (InputContactMessageContent) obj;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		if (phoneNumber == null) {
			if (other.phoneNumber != null)
				return false;
		} else if (!phoneNumber.equals(other.phoneNumber))
			return false;
		return true;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * co.aurasphere.botmill.telegram.model.inline.input.InputMessageContent
	 * #toString()
	 */
	@Override
	public String toString() {
		return "InputContactMessageContent [phoneNumber=" + phoneNumber
				+ ", firstName=" + firstName + ", lastName=" + lastName + "]";
	}

}
