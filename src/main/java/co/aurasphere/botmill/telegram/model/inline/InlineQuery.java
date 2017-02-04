package co.aurasphere.botmill.telegram.model.inline;

import java.io.Serializable;

import co.aurasphere.botmill.telegram.model.Location;
import co.aurasphere.botmill.telegram.model.User;

/**
 * This object represents an incoming inline query. When the user sends an empty
 * query, your bot could return some default or trending results.
 * 
 * @author Donato Rimenti
 * 
 */
public class InlineQuery implements Serializable {

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
	 * Optional. Sender location, only for bots that request user location.
	 */
	private Location location;
	
	// TODO: validation?
	/**
	 * Text of the query (up to 512 characters).
	 */
	private String query;
	
	/**
	 * Offset of the results to be returned, can be controlled by the bot.
	 */
	private String offset;

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

	/**
	 * Gets the {@link #offset}.
	 *
	 * @return the {@link #offset}.
	 */
	public String getOffset() {
		return offset;
	}

	/**
	 * Sets the {@link #offset}.
	 *
	 * @param offset the {@link #offset} to set.
	 */
	public void setOffset(String offset) {
		this.offset = offset;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((from == null) ? 0 : from.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result
				+ ((location == null) ? 0 : location.hashCode());
		result = prime * result + ((offset == null) ? 0 : offset.hashCode());
		result = prime * result + ((query == null) ? 0 : query.hashCode());
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
		InlineQuery other = (InlineQuery) obj;
		if (from == null) {
			if (other.from != null)
				return false;
		} else if (!from.equals(other.from))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (location == null) {
			if (other.location != null)
				return false;
		} else if (!location.equals(other.location))
			return false;
		if (offset == null) {
			if (other.offset != null)
				return false;
		} else if (!offset.equals(other.offset))
			return false;
		if (query == null) {
			if (other.query != null)
				return false;
		} else if (!query.equals(other.query))
			return false;
		return true;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "InlineQuery [id=" + id + ", from=" + from + ", location="
				+ location + ", query=" + query + ", offset=" + offset + "]";
	}

}	
