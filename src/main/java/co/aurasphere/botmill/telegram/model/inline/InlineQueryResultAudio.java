package co.aurasphere.botmill.telegram.model.inline;

import co.aurasphere.botmill.telegram.model.InlineKeyboardMarkup;
import co.aurasphere.botmill.telegram.model.inline.input.InlineQueryInputMessageContentResult;

import com.google.gson.annotations.SerializedName;

/**
 * Represents a link to an mp3 audio file. By default, this audio file will be
 * sent by the user. Alternatively, you can use input_message_content to send a
 * message with the specified content instead of the audio. <br/>
 * <br/>
 * Note: This will only work in Telegram versions released after 9 April, 2016.
 * Older clients will ignore them.
 * 
 * @author Donato Rimenti
 * @date Dec 26, 2016
 */
public class InlineQueryResultAudio extends InlineQueryInputMessageContentResult {

	/**
	 * The serial version UID.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * A valid URL for the audio file.
	 */
	@SerializedName("audio_url")
	private String audioUrl;

	// TODO: validation?
	/**
	 * Optional. Caption, 0-200 characters.
	 */
	private String caption;

	/**
	 * Optional. Performer.
	 */
	private String performer;

	/**
	 * Optional. Audio duration in seconds.
	 */
	@SerializedName("audio_duration")
	private int audioDuration;
	
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
	 * Instantiates a new InlineQueryResultAudio.
	 */
	public InlineQueryResultAudio() {
		super(InlineQueryResultType.AUDIO);
	}

	/**
	 * Gets the {@link #audioUrl}.
	 *
	 * @return the {@link #audioUrl}.
	 */
	public String getAudioUrl() {
		return audioUrl;
	}

	/**
	 * Sets the {@link #audioUrl}.
	 *
	 * @param audioUrl the {@link #audioUrl} to set.
	 */
	public void setAudioUrl(String audioUrl) {
		this.audioUrl = audioUrl;
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
	 * @param caption the {@link #caption} to set.
	 */
	public void setCaption(String caption) {
		this.caption = caption;
	}

	/**
	 * Gets the {@link #performer}.
	 *
	 * @return the {@link #performer}.
	 */
	public String getPerformer() {
		return performer;
	}

	/**
	 * Sets the {@link #performer}.
	 *
	 * @param performer the {@link #performer} to set.
	 */
	public void setPerformer(String performer) {
		this.performer = performer;
	}

	/**
	 * Gets the {@link #audioDuration}.
	 *
	 * @return the {@link #audioDuration}.
	 */
	public int getAudioDuration() {
		return audioDuration;
	}

	/**
	 * Sets the {@link #audioDuration}.
	 *
	 * @param audioDuration the {@link #audioDuration} to set.
	 */
	public void setAudioDuration(int audioDuration) {
		this.audioDuration = audioDuration;
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
	 * @param title the {@link #title} to set.
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * Gets the {@link #replyMarkup}.
	 *
	 * @return the {@link #replyMarkup}.
	 */
	public InlineKeyboardMarkup getReplyMarkup() {
		return replyMarkup;
	}

	/**
	 * Sets the {@link #replyMarkup}.
	 *
	 * @param replyMarkup the {@link #replyMarkup} to set.
	 */
	public void setReplyMarkup(InlineKeyboardMarkup replyMarkup) {
		this.replyMarkup = replyMarkup;
	}

	/**
	 * Gets the {@link #thumbUrl}.
	 *
	 * @return the {@link #thumbUrl}.
	 */
	public String getThumbUrl() {
		return thumbUrl;
	}

	/**
	 * Sets the {@link #thumbUrl}.
	 *
	 * @param thumbUrl the {@link #thumbUrl} to set.
	 */
	public void setThumbUrl(String thumbUrl) {
		this.thumbUrl = thumbUrl;
	}

	/* (non-Javadoc)
	 * @see co.aurasphere.botmill.telegram.model.inline.input.InlineQueryInputMessageContentResult#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + audioDuration;
		result = prime * result
				+ ((audioUrl == null) ? 0 : audioUrl.hashCode());
		result = prime * result + ((caption == null) ? 0 : caption.hashCode());
		result = prime * result
				+ ((performer == null) ? 0 : performer.hashCode());
		result = prime * result
				+ ((replyMarkup == null) ? 0 : replyMarkup.hashCode());
		result = prime * result
				+ ((thumbUrl == null) ? 0 : thumbUrl.hashCode());
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		return result;
	}

	/* (non-Javadoc)
	 * @see co.aurasphere.botmill.telegram.model.inline.InlineQueryResult#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		InlineQueryResultAudio other = (InlineQueryResultAudio) obj;
		if (audioDuration != other.audioDuration)
			return false;
		if (audioUrl == null) {
			if (other.audioUrl != null)
				return false;
		} else if (!audioUrl.equals(other.audioUrl))
			return false;
		if (caption == null) {
			if (other.caption != null)
				return false;
		} else if (!caption.equals(other.caption))
			return false;
		if (performer == null) {
			if (other.performer != null)
				return false;
		} else if (!performer.equals(other.performer))
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

	/* (non-Javadoc)
	 * @see co.aurasphere.botmill.telegram.model.inline.InlineQueryResult#toString()
	 */
	@Override
	public String toString() {
		return "InlineQueryResultAudio [audioUrl=" + audioUrl + ", caption="
				+ caption + ", performer=" + performer + ", audioDuration="
				+ audioDuration + ", title=" + title + ", replyMarkup="
				+ replyMarkup + ", thumbUrl=" + thumbUrl + ", type=" + type
				+ ", id=" + id + ", inputMessageContent=" + inputMessageContent
				+ "]";
	}
}
