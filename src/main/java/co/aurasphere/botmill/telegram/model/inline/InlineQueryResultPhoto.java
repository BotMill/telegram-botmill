/**
 * 
 */
package co.aurasphere.botmill.telegram.model.inline;

import co.aurasphere.botmill.telegram.model.InlineKeyboardMarkup;
import co.aurasphere.botmill.telegram.model.inline.input.InlineQueryInputMessageContentResult;

import com.google.gson.annotations.SerializedName;

/**
 * Represents a link to a photo. By default, this photo will be sent by the user
 * with optional caption. Alternatively, you can use input_message_content to
 * send a message with the specified content instead of the photo.
 * 
 * @author Donato Rimenti
 * @date Dec 25, 2016
 */
public class InlineQueryResultPhoto extends
		InlineQueryInputMessageContentResult {

	/**
	 * The serial version UID.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * A valid URL of the photo. Photo must be in jpeg format. Photo size must
	 * not exceed 5MB.
	 */
	@SerializedName("photo_url")
	private String photoUrl;

	/**
	 * Optional. Width of the photo.
	 */
	@SerializedName("photo_width")
	private int photoWidth;

	/**
	 * Optional. Height of the photo.
	 */
	@SerializedName("photo_height")
	private int photoHeight;

	/**
	 * Optional. Short description of the result.
	 */
	private String description;

	/**
	 * Optional. Caption of the photo to be sent, 0-200 characters.
	 */
	private String caption;

	/**
	 * Title of the result.
	 */
	private String title;

	/**
	 * Optional. <a href=
	 * "https://core.telegram.org/bots#inline-keyboards-and-on-the-fly-updating"
	 * >Inline keyboard</a> attached to the message.
	 */
	@SerializedName("reply_markup")
	private InlineKeyboardMarkup replyMarkup;

	/**
	 * Optional. Url of the thumbnail for the result.
	 */
	@SerializedName("thumb_url")
	private String thumbUrl;

	/**
	 * Instantiates a new InlineQueryResultPhoto.
	 */
	public InlineQueryResultPhoto() {
		super(InlineQueryResultType.PHOTO);
	}

	/**
	 * Gets the {@link #photoUrl}.
	 *
	 * @return the {@link #photoUrl}.
	 */
	public String getPhotoUrl() {
		return photoUrl;
	}

	/**
	 * Sets the {@link #photoUrl}.
	 *
	 * @param photoUrl
	 *            the {@link #photoUrl} to set.
	 */
	public void setPhotoUrl(String photoUrl) {
		this.photoUrl = photoUrl;
	}

	/**
	 * Gets the {@link #photoWidth}.
	 *
	 * @return the {@link #photoWidth}.
	 */
	public int getPhotoWidth() {
		return photoWidth;
	}

	/**
	 * Sets the {@link #photoWidth}.
	 *
	 * @param photoWidth
	 *            the {@link #photoWidth} to set.
	 */
	public void setPhotoWidth(int photoWidth) {
		this.photoWidth = photoWidth;
	}

	/**
	 * Gets the {@link #photoHeight}.
	 *
	 * @return the {@link #photoHeight}.
	 */
	public int getPhotoHeight() {
		return photoHeight;
	}

	/**
	 * Sets the {@link #photoHeight}.
	 *
	 * @param photoHeight
	 *            the {@link #photoHeight} to set.
	 */
	public void setPhotoHeight(int photoHeight) {
		this.photoHeight = photoHeight;
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

	/**
	 * Gets the {@link #title}.
	 *
	 * @return the {@link #title}.
	 */
	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * co.aurasphere.botmill.telegram.model.inline.InlineQueryResult#getTitle()
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
	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * co.aurasphere.botmill.telegram.model.inline.InlineQueryResult#setTitle
	 * (java.lang.String)
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * Gets the {@link #replyMarkup}.
	 *
	 * @return the {@link #replyMarkup}.
	 */
	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * co.aurasphere.botmill.telegram.model.inline.InlineQueryResult#getReplyMarkup
	 * ()
	 */
	public InlineKeyboardMarkup getReplyMarkup() {
		return replyMarkup;
	}

	/**
	 * Sets the {@link #replyMarkup}.
	 *
	 * @param replyMarkup
	 *            the {@link #replyMarkup} to set.
	 */
	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * co.aurasphere.botmill.telegram.model.inline.InlineQueryResult#setReplyMarkup
	 * (co.aurasphere.botmill.telegram.model.core.InlineKeyboardMarkup)
	 */
	public void setReplyMarkup(InlineKeyboardMarkup replyMarkup) {
		this.replyMarkup = replyMarkup;
	}

	/**
	 * Gets the {@link #thumbUrl}.
	 *
	 * @return the {@link #thumbUrl}.
	 */
	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * co.aurasphere.botmill.telegram.model.inline.InlineQueryResult#getThumbUrl
	 * ()
	 */
	public String getThumbUrl() {
		return thumbUrl;
	}

	/**
	 * Sets the {@link #thumbUrl}.
	 *
	 * @param thumbUrl
	 *            the {@link #thumbUrl} to set.
	 */
	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * co.aurasphere.botmill.telegram.model.inline.InlineQueryResult#setThumbUrl
	 * (java.lang.String)
	 */
	public void setThumbUrl(String thumbUrl) {
		this.thumbUrl = thumbUrl;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * co.aurasphere.botmill.telegram.model.inline.InlineQueryResult#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((caption == null) ? 0 : caption.hashCode());
		result = prime * result
				+ ((description == null) ? 0 : description.hashCode());
		result = prime * result + photoHeight;
		result = prime * result
				+ ((photoUrl == null) ? 0 : photoUrl.hashCode());
		result = prime * result + photoWidth;
		result = prime * result
				+ ((replyMarkup == null) ? 0 : replyMarkup.hashCode());
		result = prime * result
				+ ((thumbUrl == null) ? 0 : thumbUrl.hashCode());
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		return result;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * co.aurasphere.botmill.telegram.model.inline.InlineQueryResult#equals(
	 * java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		InlineQueryResultPhoto other = (InlineQueryResultPhoto) obj;
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
		if (photoHeight != other.photoHeight)
			return false;
		if (photoUrl == null) {
			if (other.photoUrl != null)
				return false;
		} else if (!photoUrl.equals(other.photoUrl))
			return false;
		if (photoWidth != other.photoWidth)
			return false;
		if (replyMarkup == null) {
			if (other.replyMarkup != null)
				return false;
		} else if (!replyMarkup.equals(other.replyMarkup))
			return false;
		if (thumbUrl == null) {
			if (other.thumbUrl != null)
				return false;
		} else if (!thumbUrl.equals(other.thumbUrl))
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
	 * co.aurasphere.botmill.telegram.model.inline.InlineQueryResult#toString()
	 */
	@Override
	public String toString() {
		return "InlineQueryResultPhoto [photoUrl=" + photoUrl + ", photoWidth="
				+ photoWidth + ", photoHeight=" + photoHeight
				+ ", description=" + description + ", caption=" + caption
				+ ", title=" + title + ", replyMarkup=" + replyMarkup
				+ ", thumbUrl=" + thumbUrl + ", type=" + type + ", id=" + id
				+ ", inputMessageContent=" + inputMessageContent + "]";
	}

}
