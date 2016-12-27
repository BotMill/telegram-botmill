/**
 * 
 */
package co.aurasphere.botmill.telegram.model.inline.cache;

import com.google.gson.annotations.SerializedName;

import co.aurasphere.botmill.telegram.model.inline.InlineQueryResultType;

/**
 * Represents a link to a photo stored on the Telegram servers. By default, this
 * photo will be sent by the user with an optional caption. Alternatively, you
 * can use input_message_content to send a message with the specified content
 * instead of the photo.
 * 
 * @author Donato Rimenti
 * @date Dec 26, 2016
 */
public class InlineQueryResultCachedPhoto extends InlineQueryResultCached {

	/**
	 * The serial version UID.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * A valid file identifier of the photo.
	 */
	@SerializedName("photo_file_id")
	private String photoFileId;

	/**
	 * Optional. Title for the result.
	 */
	private String title;

	/**
	 * Optional. Short description of the result.
	 */
	private String description;

	// TODO: validation?
	/**
	 * Optional. Caption of the photo to be sent, 0-200 characters.
	 */
	private String caption;

	/**
	 * Instantiates a new InlineQueryResultCachedPhoto.
	 */
	public InlineQueryResultCachedPhoto() {
		super(InlineQueryResultType.PHOTO);
	}

	/**
	 * Gets the {@link #photoFileId}.
	 *
	 * @return the {@link #photoFileId}.
	 */
	public String getPhotoFileId() {
		return photoFileId;
	}

	/**
	 * Sets the {@link #photoFileId}.
	 *
	 * @param photoFileId
	 *            the {@link #photoFileId} to set.
	 */
	public void setPhotoFileId(String photoFileId) {
		this.photoFileId = photoFileId;
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
	 * @param title
	 *            the {@link #title} to set.
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * Gets the {@link #description}.
	 *
	 * @return the {@link #description}.
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * Sets the {@link #description}.
	 *
	 * @param description
	 *            the {@link #description} to set.
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * Gets the {@link #caption}.
	 *
	 * @return the {@link #caption}.
	 */
	public String getCaption() {
		return caption;
	}

	/**
	 * Sets the {@link #caption}.
	 *
	 * @param caption
	 *            the {@link #caption} to set.
	 */
	public void setCaption(String caption) {
		this.caption = caption;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see co.aurasphere.botmill.telegram.model.inline.
	 * InlineQueryInputMessageContentResult#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((caption == null) ? 0 : caption.hashCode());
		result = prime * result
				+ ((description == null) ? 0 : description.hashCode());
		result = prime * result
				+ ((photoFileId == null) ? 0 : photoFileId.hashCode());
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		return result;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see co.aurasphere.botmill.telegram.model.inline.
	 * InlineQueryInputMessageContentResult#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		InlineQueryResultCachedPhoto other = (InlineQueryResultCachedPhoto) obj;
		if (caption == null) {
			if (other.caption != null)
				return false;
		} else if (!caption.equals(other.caption))
			return false;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (photoFileId == null) {
			if (other.photoFileId != null)
				return false;
		} else if (!photoFileId.equals(other.photoFileId))
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * co.aurasphere.botmill.telegram.model.inline.cache.InlineQueryResultCached
	 * #toString()
	 */
	@Override
	public String toString() {
		return "InlineQueryResultCachedPhoto [photoFileId=" + photoFileId
				+ ", title=" + title + ", description=" + description
				+ ", caption=" + caption + ", inputMessageContent="
				+ inputMessageContent + ", type=" + type + ", id=" + id + "]";
	}

}
