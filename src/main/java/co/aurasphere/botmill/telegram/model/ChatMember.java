package co.aurasphere.botmill.telegram.model;

import java.io.Serializable;

/**
 * This object contains information about one member of the chat.
 * 
 * @author Donato Rimenti
 * 
 */
public class ChatMember implements Serializable {

	/**
	 * The serial version UID.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Information about the user.
	 */
	private User user;

	/**
	 * The member's status in the chat. Can be “creator”, “administrator”,
	 * “member”, “left” or “kicked”.
	 */
	private ChatMemberStatus status;

	/**
	 * Gets the {@link #user}.
	 *
	 * @return the {@link #user}.
	 */
	public User getUser() {
		return user;
	}

	/**
	 * Sets the {@link #user}.
	 *
	 * @param user the {@link #user} to set.
	 */
	public void setUser(User user) {
		this.user = user;
	}

	/**
	 * Gets the {@link #status}.
	 *
	 * @return the {@link #status}.
	 */
	public ChatMemberStatus getStatus() {
		return status;
	}

	/**
	 * Sets the {@link #status}.
	 *
	 * @param status the {@link #status} to set.
	 */
	public void setStatus(ChatMemberStatus status) {
		this.status = status;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((user == null) ? 0 : user.hashCode());
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
		ChatMember other = (ChatMember) obj;
		if (user == null) {
			if (other.user != null)
				return false;
		} else if (!user.equals(other.user))
			return false;
		return true;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "ChatMember [user=" + user + "]";
	}

}
