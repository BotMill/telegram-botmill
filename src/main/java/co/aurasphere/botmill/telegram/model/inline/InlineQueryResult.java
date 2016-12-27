package co.aurasphere.botmill.telegram.model.inline;

import java.io.Serializable;

/**
 * This object represents one result of an inline query.
 * 
 * @author Donato Rimenti
 * @date Dec 26, 2016
 */
public class InlineQueryResult implements Serializable {

	/**
	 * The serial version UID.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Type of the result.
	 */
	protected InlineQueryResultType type;

	/**
	 * Unique identifier for this result, 1-64 Bytes.
	 */
	protected String id;

	/**
	 * Instantiates a new InlineQueryResult.
	 *
	 * @param type
	 *            the {@link #type}.
	 */
	public InlineQueryResult(InlineQueryResultType type) {
		this.type = type;
	}

	/**
	 * Gets the {@link #type}.
	 *
	 * @return the {@link #type}.
	 */
	public InlineQueryResultType getType() {
		return type;
	}

	/**
	 * Sets the {@link #type}.
	 *
	 * @param type
	 *            the {@link #type} to set.
	 */
	public void setType(InlineQueryResultType type) {
		this.type = type;
	}

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
	 * @param id
	 *            the {@link #id} to set.
	 */
	public void setId(String id) {
		this.id = id;
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
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
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
		InlineQueryResult other = (InlineQueryResult) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (type != other.type)
			return false;
		return true;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "InlineQueryResult [type=" + type + ", id=" + id + "]";
	}

}
