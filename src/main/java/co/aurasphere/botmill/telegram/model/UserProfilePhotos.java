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
import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

import com.google.gson.annotations.SerializedName;

/**
 * This object represent a user's profile pictures.
 * 
 * @author Donato Rimenti
 * 
 */
public class UserProfilePhotos implements Serializable {

	/**
	 * The serial version UID.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Total number of profile pictures the target user has.
	 */
	@NotNull
	@SerializedName("total_count")
	private int totalCount;

	/**
	 * Requested profile pictures (in up to 4 sizes each).
	 */
	@Valid
	@NotEmpty
	private List<PhotoSize> photos;

	/**
	 * Gets the {@link #totalCount}.
	 *
	 * @return the {@link #totalCount}.
	 */
	public int getTotalCount() {
		return totalCount;
	}

	/**
	 * Sets the {@link #totalCount}.
	 *
	 * @param totalCount the {@link #totalCount} to set.
	 */
	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}

	/**
	 * Gets the {@link #photos}.
	 *
	 * @return the {@link #photos}.
	 */
	public List<PhotoSize> getPhotos() {
		return photos;
	}

	/**
	 * Sets the {@link #photos}.
	 *
	 * @param photos the {@link #photos} to set.
	 */
	public void setPhotos(List<PhotoSize> photos) {
		this.photos = photos;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((photos == null) ? 0 : photos.hashCode());
		result = prime * result + totalCount;
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
		UserProfilePhotos other = (UserProfilePhotos) obj;
		if (photos == null) {
			if (other.photos != null)
				return false;
		} else if (!photos.equals(other.photos))
			return false;
		if (totalCount != other.totalCount)
			return false;
		return true;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "UserProfilePhotos [totalCount=" + totalCount + ", photos="
				+ photos + "]";
	}

}
