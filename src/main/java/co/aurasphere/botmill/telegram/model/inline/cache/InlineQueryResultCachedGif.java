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
package co.aurasphere.botmill.telegram.model.inline.cache;

import com.google.gson.annotations.SerializedName;

import co.aurasphere.botmill.telegram.model.inline.InlineQueryResultType;

/**
 * Represents a link to an animated GIF file stored on the Telegram servers. By
 * default, this animated GIF file will be sent by the user with an optional
 * caption. Alternatively, you can use input_message_content to send a message
 * with specified content instead of the animation.
 * 
 * @author Donato Rimenti
 * 
 */
public class InlineQueryResultCachedGif extends InlineQueryResultCached {

	/**
	 * The serial version UID.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * A valid file identifier for the GIF file.
	 */
	@SerializedName("gif_file_id")
	private String gifFileId;

	/**
	 * Optional. Title for the result.
	 */
	private String title;

	// TODO: validation?
	/**
	 * Optional. Caption of the GIF file to be sent, 0-200 characters.
	 */
	private String caption;

	/**
	 * Instantiates a new InlineQueryResultCachedGif.
	 */
	public InlineQueryResultCachedGif() {
		super(InlineQueryResultType.GIF);
	}

	/**
	 * Gets the {@link #gifFileId}.
	 *
	 * @return the {@link #gifFileId}.
	 */
	public String getGifFileId() {
		return gifFileId;
	}

	/**
	 * Sets the {@link #gifFileId}.
	 *
	 * @param gifFileId
	 *            the {@link #gifFileId} to set.
	 */
	public void setGifFileId(String gifFileId) {
		this.gifFileId = gifFileId;
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
				+ ((gifFileId == null) ? 0 : gifFileId.hashCode());
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
		InlineQueryResultCachedGif other = (InlineQueryResultCachedGif) obj;
		if (caption == null) {
			if (other.caption != null)
				return false;
		} else if (!caption.equals(other.caption))
			return false;
		if (gifFileId == null) {
			if (other.gifFileId != null)
				return false;
		} else if (!gifFileId.equals(other.gifFileId))
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
		return "InlineQueryResultCachedGif [gifFileId=" + gifFileId
				+ ", title=" + title + ", caption=" + caption
				+ ", inputMessageContent=" + inputMessageContent + ", type="
				+ type + ", id=" + id + "]";
	}

}
