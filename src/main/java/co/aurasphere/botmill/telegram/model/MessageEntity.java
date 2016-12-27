package co.aurasphere.botmill.telegram.model;

import java.io.Serializable;

/**
 * This object represents one special entity in a text message. For example,
 * hashtags, usernames, URLs, etc.
 * 
 * @author Donato Rimenti
 * @date Dec 25, 2016
 */
public class MessageEntity implements Serializable {

	/**
	 * The serial version UID.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Type of the entity. Can be mention (@username), hashtag, bot_command,
	 * url, email, bold (bold text), italic (italic text), code (monowidth
	 * string), pre (monowidth block), text_link (for clickable text URLs),
	 * text_mention (for users without usernames).
	 */
	private MentionType type;

	/**
	 * Offset in UTF-16 code units to the start of the entity.
	 */
	private int offset;

	/**
	 * Length of the entity in UTF-16 code units.
	 */
	private int length;

	/**
	 * Optional. For “text_link” only, url that will be opened after user taps
	 * on the text.
	 */
	private String url;

	/**
	 * Optional. For “text_mention” only, the mentioned user.
	 */
	private User user;

	/**
	 * Gets the {@link #type}.
	 *
	 * @return the {@link #type}.
	 */
	public MentionType getType() {
		return type;
	}

	/**
	 * Sets the {@link #type}.
	 *
	 * @param type the {@link #type} to set.
	 */
	public void setType(MentionType type) {
		this.type = type;
	}

	/**
	 * Gets the {@link #offset}.
	 *
	 * @return the {@link #offset}.
	 */
	public int getOffset() {
		return offset;
	}

	/**
	 * Sets the {@link #offset}.
	 *
	 * @param offset the {@link #offset} to set.
	 */
	public void setOffset(int offset) {
		this.offset = offset;
	}

	/**
	 * Gets the {@link #length}.
	 *
	 * @return the {@link #length}.
	 */
	public int getLength() {
		return length;
	}

	/**
	 * Sets the {@link #length}.
	 *
	 * @param length the {@link #length} to set.
	 */
	public void setLength(int length) {
		this.length = length;
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

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + length;
		result = prime * result + offset;
		result = prime * result + ((url == null) ? 0 : url.hashCode());
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
		MessageEntity other = (MessageEntity) obj;
		if (length != other.length)
			return false;
		if (offset != other.offset)
			return false;
		if (url == null) {
			if (other.url != null)
				return false;
		} else if (!url.equals(other.url))
			return false;
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
		return "MessageEntity [offset=" + offset + ", length=" + length
				+ ", url=" + url + ", user=" + user + "]";
	}

}
