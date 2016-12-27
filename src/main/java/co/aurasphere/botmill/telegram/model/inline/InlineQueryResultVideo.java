package co.aurasphere.botmill.telegram.model.inline;

import co.aurasphere.botmill.telegram.model.InlineKeyboardMarkup;
import co.aurasphere.botmill.telegram.model.inline.input.InlineQueryInputMessageContentResult;

import com.google.gson.annotations.SerializedName;

/**
 * Represents a link to a page containing an embedded video player or a video
 * file. By default, this video file will be sent by the user with an optional
 * caption. Alternatively, you can use input_message_content to send a message
 * with the specified content instead of the video.
 * 
 * @author Donato Rimenti
 * @date Dec 26, 2016
 */
public class InlineQueryResultVideo extends
		InlineQueryInputMessageContentResult {

	/**
	 * The serial version UID.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * A valid URL for the embedded video player or video file.
	 */
	@SerializedName("video_url")
	private String videoUrl;

	// TODO: enum? Check if only these
	/**
	 * Mime type of the content of video url, “text/html” or “video/mp4”.
	 */
	@SerializedName("mime_type")
	private String mimeType;

	// TODO: validation?
	/**
	 * Optional. Caption of the video to be sent, 0-200 characters.
	 */
	private String caption;

	/**
	 * Optional. Video width.
	 */
	@SerializedName("video_width")
	private int videoWidth;

	/**
	 * Optional. Video height.
	 */
	@SerializedName("video_height")
	private int videoHeight;

	/**
	 * Optional. Video duration in seconds.
	 */
	@SerializedName("video_duration")
	private int videoDuration;

	/**
	 * Optional. Short description of the result.
	 */
	private String description;

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
	 * Instantiates a new InlineQueryResultVideo.
	 */
	public InlineQueryResultVideo() {
		super(InlineQueryResultType.VIDEO);
	}

	/**
	 * Gets the {@link #videoUrl}.
	 *
	 * @return the {@link #videoUrl}.
	 */
	public String getVideoUrl() {
		return videoUrl;
	}

	/**
	 * Sets the {@link #videoUrl}.
	 *
	 * @param videoUrl
	 *            the {@link #videoUrl} to set.
	 */
	public void setVideoUrl(String videoUrl) {
		this.videoUrl = videoUrl;
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
	 * Gets the {@link #videoWidth}.
	 *
	 * @return the {@link #videoWidth}.
	 */
	public int getVideoWidth() {
		return videoWidth;
	}

	/**
	 * Sets the {@link #videoWidth}.
	 *
	 * @param videoWidth
	 *            the {@link #videoWidth} to set.
	 */
	public void setVideoWidth(int videoWidth) {
		this.videoWidth = videoWidth;
	}

	/**
	 * Gets the {@link #videoHeight}.
	 *
	 * @return the {@link #videoHeight}.
	 */
	public int getVideoHeight() {
		return videoHeight;
	}

	/**
	 * Sets the {@link #videoHeight}.
	 *
	 * @param videoHeight
	 *            the {@link #videoHeight} to set.
	 */
	public void setVideoHeight(int videoHeight) {
		this.videoHeight = videoHeight;
	}

	/**
	 * Gets the {@link #videoDuration}.
	 *
	 * @return the {@link #videoDuration}.
	 */
	public int getVideoDuration() {
		return videoDuration;
	}

	/**
	 * Sets the {@link #videoDuration}.
	 *
	 * @param videoDuration
	 *            the {@link #videoDuration} to set.
	 */
	public void setVideoDuration(int videoDuration) {
		this.videoDuration = videoDuration;
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
				+ ((mimeType == null) ? 0 : mimeType.hashCode());
		result = prime * result
				+ ((replyMarkup == null) ? 0 : replyMarkup.hashCode());
		result = prime * result
				+ ((thumbUrl == null) ? 0 : thumbUrl.hashCode());
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		result = prime * result + videoDuration;
		result = prime * result + videoHeight;
		result = prime * result
				+ ((videoUrl == null) ? 0 : videoUrl.hashCode());
		result = prime * result + videoWidth;
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
		InlineQueryResultVideo other = (InlineQueryResultVideo) obj;
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
		if (videoDuration != other.videoDuration)
			return false;
		if (videoHeight != other.videoHeight)
			return false;
		if (videoUrl == null) {
			if (other.videoUrl != null)
				return false;
		} else if (!videoUrl.equals(other.videoUrl))
			return false;
		if (videoWidth != other.videoWidth)
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
		return "InlineQueryResultVideo [videoUrl=" + videoUrl + ", mimeType="
				+ mimeType + ", caption=" + caption + ", videoWidth="
				+ videoWidth + ", videoHeight=" + videoHeight
				+ ", videoDuration=" + videoDuration + ", description="
				+ description + ", title=" + title + ", replyMarkup="
				+ replyMarkup + ", thumbUrl=" + thumbUrl + ", type=" + type
				+ ", id=" + id + ", inputMessageContent=" + inputMessageContent
				+ "]";
	}

}
