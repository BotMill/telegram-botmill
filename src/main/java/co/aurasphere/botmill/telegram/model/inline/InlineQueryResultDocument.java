package co.aurasphere.botmill.telegram.model.inline;

import co.aurasphere.botmill.telegram.model.InlineKeyboardMarkup;
import co.aurasphere.botmill.telegram.model.inline.input.InlineQueryInputMessageContentResult;

import com.google.gson.annotations.SerializedName;

/**
 * Represents a link to a file. By default, this file will be sent by the user
 * with an optional caption. Alternatively, you can use input_message_content to
 * send a message with the specified content instead of the file. Currently,
 * only .PDF and .ZIP files can be sent using this method. <br/>
 * <br/>
 * Note: This will only work in Telegram versions released after 9 April, 2016.
 * Older clients will ignore them.
 * 
 * @author Donato Rimenti
 * @date Dec 26, 2016
 */
public class InlineQueryResultDocument extends
		InlineQueryInputMessageContentResult {

	/**
	 * The serial version UID.
	 */
	private static final long serialVersionUID = 1L;

	// TODO: validation?
	/**
	 * Optional. Caption of the document to be sent, 0-200 characters.
	 */
	private String caption;

	/**
	 * A valid URL for the file.
	 */
	@SerializedName("document_url")
	private String documentUrl;

	// TODO: enum?
	/**
	 * Mime type of the content of the file, either “application/pdf” or
	 * “application/zip”.
	 */
	@SerializedName("mime_type")
	private String mimeType;

	/**
	 * Optional. Short description of the result.
	 */
	private String description;

	/**
	 * Optional. Thumbnail width.
	 */
	@SerializedName("thumb_width")
	private int thumbWidth;

	/**
	 * Optional. Thumbnail height.
	 */
	@SerializedName("thumb_height")
	private int thumbHeight;

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
	 * Instantiates a new InlineQueryResultDocument.
	 */
	public InlineQueryResultDocument() {
		super(InlineQueryResultType.DOCUMENT);
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
	 * Gets the {@link #documentUrl}.
	 *
	 * @return the {@link #documentUrl}.
	 */
	public String getDocumentUrl() {
		return documentUrl;
	}

	/**
	 * Sets the {@link #documentUrl}.
	 *
	 * @param documentUrl
	 *            the {@link #documentUrl} to set.
	 */
	public void setDocumentUrl(String documentUrl) {
		this.documentUrl = documentUrl;
	}

	/**
	 * Gets the {@link #mimeType}.
	 *
	 * @return the {@link #mimeType}.
	 */
	public String getMimeType() {
		return mimeType;
	}

	/**
	 * Sets the {@link #mimeType}.
	 *
	 * @param mimeType
	 *            the {@link #mimeType} to set.
	 */
	public void setMimeType(String mimeType) {
		this.mimeType = mimeType;
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
	 * Gets the {@link #thumbWidth}.
	 *
	 * @return the {@link #thumbWidth}.
	 */
	public int getThumbWidth() {
		return thumbWidth;
	}

	/**
	 * Sets the {@link #thumbWidth}.
	 *
	 * @param thumbWidth
	 *            the {@link #thumbWidth} to set.
	 */
	public void setThumbWidth(int thumbWidth) {
		this.thumbWidth = thumbWidth;
	}

	/**
	 * Gets the {@link #thumbHeight}.
	 *
	 * @return the {@link #thumbHeight}.
	 */
	public int getThumbHeight() {
		return thumbHeight;
	}

	/**
	 * Sets the {@link #thumbHeight}.
	 *
	 * @param thumbHeight
	 *            the {@link #thumbHeight} to set.
	 */
	public void setThumbHeight(int thumbHeight) {
		this.thumbHeight = thumbHeight;
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
		result = prime * result
				+ ((documentUrl == null) ? 0 : documentUrl.hashCode());
		result = prime * result
				+ ((mimeType == null) ? 0 : mimeType.hashCode());
		result = prime * result
				+ ((replyMarkup == null) ? 0 : replyMarkup.hashCode());
		result = prime * result + thumbHeight;
		result = prime * result
				+ ((thumbUrl == null) ? 0 : thumbUrl.hashCode());
		result = prime * result + thumbWidth;
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
		InlineQueryResultDocument other = (InlineQueryResultDocument) obj;
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
		if (documentUrl == null) {
			if (other.documentUrl != null)
				return false;
		} else if (!documentUrl.equals(other.documentUrl))
			return false;
		if (mimeType == null) {
			if (other.mimeType != null)
				return false;
		} else if (!mimeType.equals(other.mimeType))
			return false;
		if (replyMarkup == null) {
			if (other.replyMarkup != null)
				return false;
		} else if (!replyMarkup.equals(other.replyMarkup))
			return false;
		if (thumbHeight != other.thumbHeight)
			return false;
		if (thumbUrl == null) {
			if (other.thumbUrl != null)
				return false;
		} else if (!thumbUrl.equals(other.thumbUrl))
			return false;
		if (thumbWidth != other.thumbWidth)
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
		return "InlineQueryResultDocument [caption=" + caption
				+ ", documentUrl=" + documentUrl + ", mimeType=" + mimeType
				+ ", description=" + description + ", thumbWidth=" + thumbWidth
				+ ", thumbHeight=" + thumbHeight + ", title=" + title
				+ ", replyMarkup=" + replyMarkup + ", thumbUrl=" + thumbUrl
				+ ", type=" + type + ", id=" + id + ", inputMessageContent="
				+ inputMessageContent + "]";
	}

}
