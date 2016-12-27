package co.aurasphere.botmill.telegram.model;

import java.io.Serializable;

import com.google.gson.annotations.SerializedName;

/**
 * This object represents a chat.
 * 
 * @author Donato Rimenti
 * @date Dec 25, 2016
 */
public class Chat implements Serializable {

	/**
	 * The serial version UID.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Unique identifier for this chat. This number may be greater than 32 bits
	 * and some programming languages may have difficulty/silent defects in
	 * interpreting it. But it smaller than 52 bits, so a signed 64 bit integer
	 * or double-precision float type are safe for storing this identifier.
	 */
	private String id;

	/**
	 * Type of chat, can be either “private”, “group”, “supergroup” or
	 * “channel”.
	 */
	private ChatType type;

	/**
	 * Type of chat, can be either “private”, “group”, “supergroup” or “channel”.
	 */
	private String title;

	/**
	 * Optional. Username, for private chats, supergroups and channels if available.
	 */
	private String username;

	/**
	 * Optional. First name of the other party in a private chat.
	 */
	@SerializedName("first_name")
	private String firstName;

	/**
	 * Optional. Last name of the other party in a private chat.
	 */
	@SerializedName("last_name")
	private String lastName;

	/**
	 * Optional. True if a group has ‘All Members Are Admins’ enabled.
	 */
	@SerializedName("all_members_are_administrators")
	private boolean allMembersAreAdministrators;

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
	 * Gets the {@link #type}.
	 *
	 * @return the {@link #type}.
	 */
	public ChatType getType() {
		return type;
	}

	/**
	 * Sets the {@link #type}.
	 *
	 * @param type the {@link #type} to set.
	 */
	public void setType(ChatType type) {
		this.type = type;
	}

	/**
	 * Gets the {@link #title}.
	 *
	 * @return the {@link #title}.
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * Sets the {@link #title}.
	 *
	 * @param title the {@link #title} to set.
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * Gets the {@link #username}.
	 *
	 * @return the {@link #username}.
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * Sets the {@link #username}.
	 *
	 * @param username the {@link #username} to set.
	 */
	public void setUsername(String username) {
		this.username = username;
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
	 * Gets the {@link #allMembersAreAdministrators}.
	 *
	 * @return the {@link #allMembersAreAdministrators}.
	 */
	public boolean isAllMembersAreAdministrators() {
		return allMembersAreAdministrators;
	}

	/**
	 * Sets the {@link #allMembersAreAdministrators}.
	 *
	 * @param allMembersAreAdministrators the {@link #allMembersAreAdministrators} to set.
	 */
	public void setAllMembersAreAdministrators(boolean allMembersAreAdministrators) {
		this.allMembersAreAdministrators = allMembersAreAdministrators;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (allMembersAreAdministrators ? 1231 : 1237);
		result = prime * result
				+ ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result
				+ ((lastName == null) ? 0 : lastName.hashCode());
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		result = prime * result
				+ ((username == null) ? 0 : username.hashCode());
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
		Chat other = (Chat) obj;
		if (allMembersAreAdministrators != other.allMembersAreAdministrators)
			return false;
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
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		if (username == null) {
			if (other.username != null)
				return false;
		} else if (!username.equals(other.username))
			return false;
		return true;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Chat [id=" + id + ", title=" + title + ", username=" + username
				+ ", firstName=" + firstName + ", lastName=" + lastName
				+ ", allMembersAreAdministrators="
				+ allMembersAreAdministrators + "]";
	}

}
