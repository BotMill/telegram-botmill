/*
 * MIT License
 *
 * Copyright (c) 2016 BotMill.io
 * 
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package co.aurasphere.botmill.telegram.model.inline;

import co.aurasphere.botmill.telegram.model.InlineKeyboardMarkup;
import co.aurasphere.botmill.telegram.model.inline.input.InlineQueryInputMessageContentResult;

import com.google.gson.annotations.SerializedName;

/**
 * Represents a link to a voice recording in an .ogg container encoded with
 * OPUS. By default, this voice recording will be sent by the user.
 * Alternatively, you can use input_message_content to send a message with the
 * specified content instead of the the voice message.<br/>
 * <br/>
 * Note: This will only work in Telegram versions released after 9 April, 2016.
 * Older clients will ignore them.
 * 
 * @author Donato Rimenti
 * 
 */
public class InlineQueryResultVoice extends
		InlineQueryInputMessageContentResult {

	/**
	 * The serial version UID.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * A valid URL for the voice recording.
	 */
	@SerializedName("voice_url")
	private String voiceUrl;

	/**
	 * Optional. Caption, 0-200 characters.
	 */
	private String caption;

	/**
	 * Optional. Recording duration in seconds.
	 */
	@SerializedName("voice_duration")
	private int voiceDuration;

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
	 * Instantiates a new InlineQueryResultVoice.
	 */
	public InlineQueryResultVoice() {
		super(InlineQueryResultType.VOICE);
	}

	/**
	 * Gets the {@link #voiceUrl}.
	 *
	 * @return the {@link #voiceUrl}.
	 */
	public String getVoiceUrl() {
		return voiceUrl;
	}

	/**
	 * Sets the {@link #voiceUrl}.
	 *
	 * @param voiceUrl
	 *            the {@link #voiceUrl} to set.
	 */
	public void setVoiceUrl(String voiceUrl) {
		this.voiceUrl = voiceUrl;
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
	 * Gets the {@link #voiceDuration}.
	 *
	 * @return the {@link #voiceDuration}.
	 */
	public int getVoiceDuration() {
		return voiceDuration;
	}

	/**
	 * Sets the {@link #voiceDuration}.
	 *
	 * @param voiceDuration
	 *            the {@link #voiceDuration} to set.
	 */
	public void setVoiceDuration(int voiceDuration) {
		this.voiceDuration = voiceDuration;
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
				+ ((replyMarkup == null) ? 0 : replyMarkup.hashCode());
		result = prime * result
				+ ((thumbUrl == null) ? 0 : thumbUrl.hashCode());
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		result = prime * result + voiceDuration;
		result = prime * result
				+ ((voiceUrl == null) ? 0 : voiceUrl.hashCode());
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
		InlineQueryResultVoice other = (InlineQueryResultVoice) obj;
		if (caption == null) {
			if (other.caption != null)
				return false;
		} else if (!caption.equals(other.caption))
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
		if (voiceDuration != other.voiceDuration)
			return false;
		if (voiceUrl == null) {
			if (other.voiceUrl != null)
				return false;
		} else if (!voiceUrl.equals(other.voiceUrl))
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
		return "InlineQueryResultVoice [voiceUrl=" + voiceUrl + ", caption="
				+ caption + ", voiceDuration=" + voiceDuration + ", title="
				+ title + ", replyMarkup=" + replyMarkup + ", thumbUrl="
				+ thumbUrl + ", type=" + type + ", id=" + id
				+ ", inputMessageContent=" + inputMessageContent + "]";
	}

}
