package co.aurasphere.botmill.telegram.model.inline.cache;

import com.google.gson.annotations.SerializedName;

import co.aurasphere.botmill.telegram.model.inline.InlineQueryResultType;

/**
 * Represents a link to a sticker stored on the Telegram servers. By default,
 * this sticker will be sent by the user. Alternatively, you can use
 * input_message_content to send a message with the specified content instead of
 * the sticker.<br/>
 * <br/>
 * Note: This will only work in Telegram versions released after 9 April, 2016.
 * Older clients will ignore them.
 * 
 * @author Donato Rimenti
 * @date Dec 27, 2016
 */
public class InlineQueryResultCachedSticker extends InlineQueryResultCached {

	/**
	 * The serial version UID.
	 */
	private static final long serialVersionUID = 1L;

	@SerializedName("sticker_file_id")
	private String stickerFileId;

	/**
	 * Instantiates a new InlineQueryResultCachedSticker.
	 */
	public InlineQueryResultCachedSticker() {
		super(InlineQueryResultType.STICKER);
	}

	/**
	 * Gets the {@link #stickerFileId}.
	 *
	 * @return the {@link #stickerFileId}.
	 */
	public String getStickerFileId() {
		return stickerFileId;
	}

	/**
	 * Sets the {@link #stickerFileId}.
	 *
	 * @param stickerFileId
	 *            the {@link #stickerFileId} to set.
	 */
	public void setStickerFileId(String stickerFileId) {
		this.stickerFileId = stickerFileId;
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
				+ ((stickerFileId == null) ? 0 : stickerFileId.hashCode());
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
		InlineQueryResultCachedSticker other = (InlineQueryResultCachedSticker) obj;
		if (stickerFileId == null) {
			if (other.stickerFileId != null)
				return false;
		} else if (!stickerFileId.equals(other.stickerFileId))
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
		return "InlineQueryResultCachedSticker [stickerFileId=" + stickerFileId
				+ ", inputMessageContent=" + inputMessageContent + ", type="
				+ type + ", id=" + id + "]";
	}

}
