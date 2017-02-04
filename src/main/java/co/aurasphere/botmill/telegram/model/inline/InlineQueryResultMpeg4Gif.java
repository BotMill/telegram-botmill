package co.aurasphere.botmill.telegram.model.inline;

import co.aurasphere.botmill.telegram.model.InlineKeyboardMarkup;
import co.aurasphere.botmill.telegram.model.inline.input.InlineQueryInputMessageContentResult;

import com.google.gson.annotations.SerializedName;

/**
 * Represents a link to a video animation (H.264/MPEG-4 AVC video without
 * sound). By default, this animated MPEG-4 file will be sent by the user with
 * optional caption. Alternatively, you can use input_message_content to send a
 * message with the specified content instead of the animation.
 * 
 * @author Donato Rimenti
 * 
 */
public class InlineQueryResultMpeg4Gif extends
		InlineQueryInputMessageContentResult {

	/**
	 * The serial version UID.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * A valid URL for the MP4 file. File size must not exceed 1MB.
	 */
	@SerializedName("mpeg4_url")
	private String mpeg4Url;

	/**
	 * Optional. Video width.
	 */
	@SerializedName("mpeg4_width")
	private int mpeg4Width;

	/**
	 * Optional. Video height.
	 */
	@SerializedName("mpeg4_height")
	private int mpeg4Height;

	// TODO: validation?
	/**
	 * Optional. Caption of the MPEG-4 file to be sent, 0-200 characters.
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
	 * Instantiates a new InlineQueryResultMpeg4Gif.
	 */
	public InlineQueryResultMpeg4Gif() {
		super(InlineQueryResultType.MPEG4_GIF);
	}

	/**
	 * Gets the {@link #mpeg4Url}.
	 *
	 * @return the {@link #mpeg4Url}.
	 */
	public String getMpeg4Url() {
		return mpeg4Url;
	}

	/**
	 * Sets the {@link #mpeg4Url}.
	 *
	 * @param mpeg4Url
	 *            the {@link #mpeg4Url} to set.
	 */
	public void setMpeg4Url(String mpeg4Url) {
		this.mpeg4Url = mpeg4Url;
	}

	/**
	 * Gets the {@link #mpeg4Width}.
	 *
	 * @return the {@link #mpeg4Width}.
	 */
	public int getMpeg4Width() {
		return mpeg4Width;
	}

	/**
	 * Sets the {@link #mpeg4Width}.
	 *
	 * @param mpeg4Width
	 *            the {@link #mpeg4Width} to set.
	 */
	public void setMpeg4Width(int mpeg4Width) {
		this.mpeg4Width = mpeg4Width;
	}

	/**
	 * Gets the {@link #mpeg4Height}.
	 *
	 * @return the {@link #mpeg4Height}.
	 */
	public int getMpeg4Height() {
		return mpeg4Height;
	}

	/**
	 * Sets the {@link #mpeg4Height}.
	 *
	 * @param mpeg4Height
	 *            the {@link #mpeg4Height} to set.
	 */
	public void setMpeg4Height(int mpeg4Height) {
		this.mpeg4Height = mpeg4Height;
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
		result = prime * result + mpeg4Height;
		result = prime * result
				+ ((mpeg4Url == null) ? 0 : mpeg4Url.hashCode());
		result = prime * result + mpeg4Width;
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
		InlineQueryResultMpeg4Gif other = (InlineQueryResultMpeg4Gif) obj;
		if (caption == null) {
			if (other.caption != null)
				return false;
		} else if (!caption.equals(other.caption))
			return false;
		if (mpeg4Height != other.mpeg4Height)
			return false;
		if (mpeg4Url == null) {
			if (other.mpeg4Url != null)
				return false;
		} else if (!mpeg4Url.equals(other.mpeg4Url))
			return false;
		if (mpeg4Width != other.mpeg4Width)
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
		return "InlineQueryResultMpeg4Gif [mpeg4Url=" + mpeg4Url
				+ ", mpeg4Width=" + mpeg4Width + ", mpeg4Height=" + mpeg4Height
				+ ", caption=" + caption + ", title=" + title
				+ ", replyMarkup=" + replyMarkup + ", thumbUrl=" + thumbUrl
				+ ", type=" + type + ", id=" + id + ", inputMessageContent="
				+ inputMessageContent + "]";
	}

}
