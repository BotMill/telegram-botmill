package co.aurasphere.botmill.telegram.model.inline.cache;

import com.google.gson.annotations.SerializedName;

import co.aurasphere.botmill.telegram.model.inline.InlineQueryResultType;

/**
 * Represents a link to a voice message stored on the Telegram servers. By
 * default, this voice message will be sent by the user. Alternatively, you can
 * use input_message_content to send a message with the specified content
 * instead of the voice message. <br/>
 * <br/>
 * Note: This will only work in Telegram versions released after 9 April, 2016.
 * Older clients will ignore them.
 * 
 * @author Donato Rimenti
 * 
 */
public class InlineQueryResultCachedVoice extends InlineQueryResultCached {

	/**
	 * The serial version UID.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * A valid file identifier for the voice message.
	 */
	@SerializedName("voice_file_id")
	private String voiceFileId;

	/**
	 * Voice message title.
	 */
	private String title;

	// TODO: validation?
	/**
	 * Optional. Caption, 0-200 characters.
	 */
	private String caption;

	/**
	 * Instantiates a new InlineQueryResultCachedVoice.
	 */
	public InlineQueryResultCachedVoice() {
		super(InlineQueryResultType.VOICE);
	}

	/**
	 * Gets the {@link #voiceFileId}.
	 *
	 * @return the {@link #voiceFileId}.
	 */
	public String getVoiceFileId() {
		return voiceFileId;
	}

	/**
	 * Sets the {@link #voiceFileId}.
	 *
	 * @param voiceFileId
	 *            the {@link #voiceFileId} to set.
	 */
	public void setVoiceFileId(String voiceFileId) {
		this.voiceFileId = voiceFileId;
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
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		result = prime * result
				+ ((voiceFileId == null) ? 0 : voiceFileId.hashCode());
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
		InlineQueryResultCachedVoice other = (InlineQueryResultCachedVoice) obj;
		if (caption == null) {
			if (other.caption != null)
				return false;
		} else if (!caption.equals(other.caption))
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		if (voiceFileId == null) {
			if (other.voiceFileId != null)
				return false;
		} else if (!voiceFileId.equals(other.voiceFileId))
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
		return "InlineQueryResultCachedVoice [voiceFileId=" + voiceFileId
				+ ", title=" + title + ", caption=" + caption
				+ ", inputMessageContent=" + inputMessageContent + ", type="
				+ type + ", id=" + id + "]";
	}

}
