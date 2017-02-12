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
package co.aurasphere.botmill.telegram.model;

import java.io.Serializable;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;

import com.google.gson.annotations.SerializedName;

/**
 * This object represents a sticker.
 * 
 * @author Donato Rimenti
 * 
 */
public class Sticker implements Serializable {

	/**
	 * The serial version UID.
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * Unique identifier for this file.
	 */
	@NotBlank
	@SerializedName("file_id")
	private String fileId;
	
	/**
	 * Sticker width.
	 */
	@NotNull
	private int width;
	
	/**
	 * Sticker height.
	 */
	@NotNull
	private int height;
	
	/**
	 * Optional. Sticker thumbnail in .webp or .jpg format.
	 */
	@Valid
	private PhotoSize thumb;
	
	/**
	 * Optional. Emoji associated with the sticker.
	 */
	private String emoji;
	
	/**
	 * Optional. File size.
	 */
	@SerializedName("file_size")
	private int fileSize;

	/**
	 * Gets the {@link #fileId}.
	 *
	 * @return the {@link #fileId}.
	 */
	public String getFileId() {
		return fileId;
	}

	/**
	 * Sets the {@link #fileId}.
	 *
	 * @param fileId the {@link #fileId} to set.
	 */
	public void setFileId(String fileId) {
		this.fileId = fileId;
	}

	/**
	 * Gets the {@link #width}.
	 *
	 * @return the {@link #width}.
	 */
	public int getWidth() {
		return width;
	}

	/**
	 * Sets the {@link #width}.
	 *
	 * @param width the {@link #width} to set.
	 */
	public void setWidth(int width) {
		this.width = width;
	}

	/**
	 * Gets the {@link #height}.
	 *
	 * @return the {@link #height}.
	 */
	public int getHeight() {
		return height;
	}

	/**
	 * Sets the {@link #height}.
	 *
	 * @param height the {@link #height} to set.
	 */
	public void setHeight(int height) {
		this.height = height;
	}

	/**
	 * Gets the {@link #thumb}.
	 *
	 * @return the {@link #thumb}.
	 */
	public PhotoSize getThumb() {
		return thumb;
	}

	/**
	 * Sets the {@link #thumb}.
	 *
	 * @param thumb the {@link #thumb} to set.
	 */
	public void setThumb(PhotoSize thumb) {
		this.thumb = thumb;
	}

	/**
	 * Gets the {@link #emoji}.
	 *
	 * @return the {@link #emoji}.
	 */
	public String getEmoji() {
		return emoji;
	}

	/**
	 * Sets the {@link #emoji}.
	 *
	 * @param emoji the {@link #emoji} to set.
	 */
	public void setEmoji(String emoji) {
		this.emoji = emoji;
	}

	/**
	 * Gets the {@link #fileSize}.
	 *
	 * @return the {@link #fileSize}.
	 */
	public int getFileSize() {
		return fileSize;
	}

	/**
	 * Sets the {@link #fileSize}.
	 *
	 * @param fileSize the {@link #fileSize} to set.
	 */
	public void setFileSize(int fileSize) {
		this.fileSize = fileSize;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((emoji == null) ? 0 : emoji.hashCode());
		result = prime * result + ((fileId == null) ? 0 : fileId.hashCode());
		result = prime * result + fileSize;
		result = prime * result + height;
		result = prime * result + ((thumb == null) ? 0 : thumb.hashCode());
		result = prime * result + width;
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Sticker other = (Sticker) obj;
		if (emoji == null) {
			if (other.emoji != null)
				return false;
		} else if (!emoji.equals(other.emoji))
			return false;
		if (fileId == null) {
			if (other.fileId != null)
				return false;
		} else if (!fileId.equals(other.fileId))
			return false;
		if (fileSize != other.fileSize)
			return false;
		if (height != other.height)
			return false;
		if (thumb == null) {
			if (other.thumb != null)
				return false;
		} else if (!thumb.equals(other.thumb))
			return false;
		if (width != other.width)
			return false;
		return true;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Sticker [fileId=" + fileId + ", width=" + width + ", height="
				+ height + ", thumb=" + thumb + ", emoji=" + emoji
				+ ", fileSize=" + fileSize + "]";
	}

}
