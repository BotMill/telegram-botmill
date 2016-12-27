package co.aurasphere.botmill.telegram.model.inline.cache;

import com.google.gson.annotations.SerializedName;

import co.aurasphere.botmill.telegram.model.inline.InlineQueryResultType;

/**
 * Represents a link to a video animation (H.264/MPEG-4 AVC video without sound)
 * stored on the Telegram servers. By default, this animated MPEG-4 file will be
 * sent by the user with an optional caption. Alternatively, you can use
 * input_message_content to send a message with the specified content instead of
 * the animation.
 * 
 * @author Donato Rimenti
 * @date Dec 27, 2016
 */
public class InlineQueryResultCachedMpeg4Gif extends InlineQueryResultCached {

	/**
	 * The serial version UID.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * A valid file identifier for the MP4 file.
	 */
	@SerializedName("mpeg4_file_id")
	private String mpeg4FileId;

	/**
	 * Optional. Title for the result.
	 */
	private String title;

	/**
	 * Optional. Caption of the MPEG-4 file to be sent, 0-200 characters.
	 */
	private String caption;

	/**
	 * Instantiates a new InlineQueryResultCachedMpeg4Gif.
	 */
	public InlineQueryResultCachedMpeg4Gif() {
		super(InlineQueryResultType.MPEG4_GIF);
	}

	/**
	 * Gets the {@link #mpeg4FileId}.
	 *
	 * @return the {@link #mpeg4FileId}.
	 */
	public String getMpeg4FileId() {
		return mpeg4FileId;
	}

	/**
	 * Sets the {@link #mpeg4FileId}.
	 *
	 * @param mpeg4FileId
	 *            the {@link #mpeg4FileId} to set.
	 */
	public void setMpeg4FileId(String mpeg4FileId) {
		this.mpeg4FileId = mpeg4FileId;
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
				+ ((mpeg4FileId == null) ? 0 : mpeg4FileId.hashCode());
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
		InlineQueryResultCachedMpeg4Gif other = (InlineQueryResultCachedMpeg4Gif) obj;
		if (caption == null) {
			if (other.caption != null)
				return false;
		} else if (!caption.equals(other.caption))
			return false;
		if (mpeg4FileId == null) {
			if (other.mpeg4FileId != null)
				return false;
		} else if (!mpeg4FileId.equals(other.mpeg4FileId))
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
		return "InlineQueryResultCachedMpeg4Gif [mpeg4FileId=" + mpeg4FileId
				+ ", title=" + title + ", caption=" + caption
				+ ", inputMessageContent=" + inputMessageContent + ", type="
				+ type + ", id=" + id + "]";
	}

}
