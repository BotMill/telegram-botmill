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

import com.google.gson.annotations.SerializedName;

/**
 * This object represents a venue.
 * 
 * @author Donato Rimenti
 * 
 */
public class Venue implements Serializable {

	/**
	 * The serial version UID.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Venue location.
	 */
	private Location location;

	/**
	 * Name of the venue.
	 */
	private String title;

	/**
	 * Address of the venue.
	 */
	private String address;

	/**
	 * Optional. Foursquare identifier of the venue.
	 */
	@SerializedName("foursquare_id")
	private String foursquareId;

	/**
	 * Gets the {@link #location}.
	 *
	 * @return the {@link #location}.
	 */
	public Location getLocation() {
		return location;
	}

	/**
	 * Sets the {@link #location}.
	 *
	 * @param location the {@link #location} to set.
	 */
	public void setLocation(Location location) {
		this.location = location;
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
	 * Gets the {@link #address}.
	 *
	 * @return the {@link #address}.
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * Sets the {@link #address}.
	 *
	 * @param address the {@link #address} to set.
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * Gets the {@link #foursquareId}.
	 *
	 * @return the {@link #foursquareId}.
	 */
	public String getFoursquareId() {
		return foursquareId;
	}

	/**
	 * Sets the {@link #foursquareId}.
	 *
	 * @param foursquareId the {@link #foursquareId} to set.
	 */
	public void setFoursquareId(String foursquareId) {
		this.foursquareId = foursquareId;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result
				+ ((foursquareId == null) ? 0 : foursquareId.hashCode());
		result = prime * result
				+ ((location == null) ? 0 : location.hashCode());
		result = prime * result + ((title == null) ? 0 : title.hashCode());
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
		Venue other = (Venue) obj;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (foursquareId == null) {
			if (other.foursquareId != null)
				return false;
		} else if (!foursquareId.equals(other.foursquareId))
			return false;
		if (location == null) {
			if (other.location != null)
				return false;
		} else if (!location.equals(other.location))
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Venue [location=" + location + ", title=" + title
				+ ", address=" + address + ", foursquareId=" + foursquareId
				+ "]";
	}

}
