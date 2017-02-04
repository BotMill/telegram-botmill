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
 * Represents a link to an animated GIF file. By default, this animated GIF file
 * will be sent by the user with optional caption. Alternatively, you can use
 * input_message_content to send a message with the specified content instead of
 * the animation.
 * 
 * @author Donato Rimenti
 * 
 */
public class InlineQueryResultGif extends InlineQueryInputMessageContentResult {

	/**
	 * The serial version UID.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * A valid URL for the GIF file. File size must not exceed 1MB.
	 */
	@SerializedName("gif_url")
	private String gifUrl;

	/**
	 * Optional. Width of the GIF.
	 */
	@SerializedName("gif_width")
	private int gifWidth;

	/**
	 * Optional. Height of the GIF.
	 */
	@SerializedName("gif_height")
	private int gifHeight;

	/**
	 * Represents a link to an animated GIF file. By default, this animated GIF
	 * file will be sent by the user with optional caption. Alternatively, you
	 * can use input_message_content to send a message with the specified
	 * content instead of the animation.
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
	 * Instantiates a new InlineQueryResultGif.
	 */
	public InlineQueryResultGif() {
		super(InlineQueryResultType.GIF);
	}

	/**
	 * Gets the {@link #gifUrl}.
	 *
	 * @return the {@link #gifUrl}.
	 */
	public String getGifUrl() {
		return gifUrl;
	}

	/**
	 * Sets the {@link #gifUrl}.
	 *
	 * @param gifUrl
	 *            the {@link #gifUrl} to set.
	 */
	public void setGifUrl(String gifUrl) {
		this.gifUrl = gifUrl;
	}

	/**
	 * Gets the {@link #gifWidth}.
	 *
	 * @return the {@link #gifWidth}.
	 */
	public int getGifWidth() {
		return gifWidth;
	}

	/**
	 * Sets the {@link #gifWidth}.
	 *
	 * @param gifWidth
	 *            the {@link #gifWidth} to set.
	 */
	public void setGifWidth(int gifWidth) {
		this.gifWidth = gifWidth;
	}

	/**
	 * Gets the {@link #gifHeight}.
	 *
	 * @return the {@link #gifHeight}.
	 */
	public int getGifHeight() {
		return gifHeight;
	}

	/**
	 * Sets the {@link #gifHeight}.
	 *
	 * @param gifHeight
	 *            the {@link #gifHeight} to set.
	 */
	public void setGifHeight(int gifHeight) {
		this.gifHeight = gifHeight;
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
		result = prime * result + gifHeight;
		result = prime * result + ((gifUrl == null) ? 0 : gifUrl.hashCode());
		result = prime * result + gifWidth;
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
		InlineQueryResultGif other = (InlineQueryResultGif) obj;
		if (caption == null) {
			if (other.caption != null)
				return false;
		} else if (!caption.equals(other.caption))
			return false;
		if (gifHeight != other.gifHeight)
			return false;
		if (gifUrl == null) {
			if (other.gifUrl != null)
				return false;
		} else if (!gifUrl.equals(other.gifUrl))
			return false;
		if (gifWidth != other.gifWidth)
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
		return "InlineQueryResultGif [gifUrl=" + gifUrl + ", gifWidth="
				+ gifWidth + ", gifHeight=" + gifHeight + ", caption="
				+ caption + ", title=" + title + ", replyMarkup=" + replyMarkup
				+ ", thumbUrl=" + thumbUrl + ", type=" + type + ", id=" + id
				+ ", inputMessageContent=" + inputMessageContent + "]";
	}

}
