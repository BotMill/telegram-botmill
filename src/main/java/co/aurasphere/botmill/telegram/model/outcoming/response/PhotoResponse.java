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
package co.aurasphere.botmill.telegram.model.outcoming.response;

import javax.validation.constraints.NotNull;

import co.aurasphere.botmill.telegram.internal.util.network.TelegramMethod;

/**
 * A message that contains a photo.
 * 
 * @author Donato Rimenti
 */
public class PhotoResponse extends TelegramBaseSendDataResponse {

	/**
	 * The serial version UID.
	 */
	private static final long serialVersionUID = 1L;

	// TODO: String or Input file. better way to do this? actually there's a
	// builder in front of it...
	/**
	 * Photo to send. Pass a file_id as String to send a photo that exists on
	 * the Telegram servers (recommended), pass an HTTP URL as a String for
	 * Telegram to get a photo from the Internet, or upload a new photo using
	 * multipart/form-data.
	 * 
	 * @see <a href="https://core.telegram.org/bots/api#sending-files"> More
	 *      info on Sending Files </a>
	 */
	@NotNull
	private Object photo;

	/**
	 * Photo caption (may also be used when resending photos by file_id), 0-200
	 * characters.
	 */
	// TODO: validation?
	private String caption;

	public PhotoResponse() {
		this.telegramMethod = TelegramMethod.SEND_PHOTO;
	}

	/**
	 * Gets the {@link #photo}.
	 *
	 * @return the {@link #photo}.
	 */
	public Object getPhoto() {
		return photo;
	}

	/**
	 * Sets the {@link #photo}.
	 *
	 * @param photo
	 *            the {@link #photo} to set.
	 */
	public void setPhoto(Object photo) {
		this.photo = photo;
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
	 * @see co.aurasphere.botmill.telegram.model.outcoming.response.
	 * TelegramBaseSendDataResponse#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((caption == null) ? 0 : caption.hashCode());
		result = prime * result + ((photo == null) ? 0 : photo.hashCode());
		return result;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see co.aurasphere.botmill.telegram.model.outcoming.response.
	 * TelegramBaseSendDataResponse#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		PhotoResponse other = (PhotoResponse) obj;
		if (caption == null) {
			if (other.caption != null)
				return false;
		} else if (!caption.equals(other.caption))
			return false;
		if (photo == null) {
			if (other.photo != null)
				return false;
		} else if (!photo.equals(other.photo))
			return false;
		return true;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see co.aurasphere.botmill.telegram.model.outcoming.response.
	 * TelegramBaseSendDataResponse#toString()
	 */
	@Override
	public String toString() {
		return "PhotoResponse [photo=" + photo + ", caption=" + caption
				+ ", disableNotification=" + disableNotification
				+ ", replyToMessageId=" + replyToMessageId + ", replyMarkup="
				+ replyMarkup + ", chatId=" + chatId + ", telegramMethod="
				+ telegramMethod + "]";
	}

}
