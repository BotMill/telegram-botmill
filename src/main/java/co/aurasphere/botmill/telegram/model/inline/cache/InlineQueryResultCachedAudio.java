package co.aurasphere.botmill.telegram.model.inline.cache;

import com.google.gson.annotations.SerializedName;

import co.aurasphere.botmill.telegram.model.inline.InlineQueryResultType;

/**
 * Represents a link to an mp3 audio file stored on the Telegram servers. By
 * default, this audio file will be sent by the user. Alternatively, you can use
 * input_message_content to send a message with the specified content instead of
 * the audio. <br/>
 * <br/>
 * Note: This will only work in Telegram versions released after 9 April, 2016.
 * Older clients will ignore them.
 * 
 * @author Donato Rimenti
 * 
 */
public class InlineQueryResultCachedAudio extends InlineQueryResultCached {

	/**
	 * The serial version UID.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * A valid file identifier for the audio file.
	 */
	@SerializedName("audio_file_id")
	private String audioFileId;

	// TODO: validation?
	/**
	 * Optional. Caption, 0-200 characters.
	 */
	private String caption;

	/**
	 * Instantiates a new InlineQueryResultCachedAudio.
	 */
	public InlineQueryResultCachedAudio() {
		super(InlineQueryResultType.AUDIO);
	}

	/**
	 * Gets the {@link #audioFileId}.
	 *
	 * @return the {@link #audioFileId}.
	 */
	public String getAudioFileId() {
		return audioFileId;
	}

	/**
	 * Sets the {@link #audioFileId}.
	 *
	 * @param audioFileId
	 *            the {@link #audioFileId} to set.
	 */
	public void setAudioFileId(String audioFileId) {
		this.audioFileId = audioFileId;
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
		result = prime * result
				+ ((audioFileId == null) ? 0 : audioFileId.hashCode());
		result = prime * result + ((caption == null) ? 0 : caption.hashCode());
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
		InlineQueryResultCachedAudio other = (InlineQueryResultCachedAudio) obj;
		if (audioFileId == null) {
			if (other.audioFileId != null)
				return false;
		} else if (!audioFileId.equals(other.audioFileId))
			return false;
		if (caption == null) {
			if (other.caption != null)
				return false;
		} else if (!caption.equals(other.caption))
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
		return "InlineQueryResultCachedAudio [audioFileId=" + audioFileId
				+ ", caption=" + caption + ", inputMessageContent="
				+ inputMessageContent + ", type=" + type + ", id=" + id + "]";
	}

}
