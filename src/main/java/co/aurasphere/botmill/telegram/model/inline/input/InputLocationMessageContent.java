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
package co.aurasphere.botmill.telegram.model.inline.input;

/**
 * Represents the content of a location message to be sent as the result of an
 * inline query.<br/>
 * <br/>
 * Note: This will only work in Telegram versions released after 9 April, 2016.
 * Older clients will ignore them.
 * 
 * @author Donato Rimenti
 * 
 */
public class InputLocationMessageContent extends InputMessageContent {

	/**
	 * The serial version UID.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Latitude of the location in degrees.
	 */
	protected double latitude;

	/**
	 * Longitude of the location in degrees.
	 */
	protected double longitude;

	/**
	 * Gets the {@link #latitude}.
	 *
	 * @return the {@link #latitude}.
	 */
	public double getLatitude() {
		return latitude;
	}

	/**
	 * Sets the {@link #latitude}.
	 *
	 * @param latitude
	 *            the {@link #latitude} to set.
	 */
	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}

	/**
	 * Gets the {@link #longitude}.
	 *
	 * @return the {@link #longitude}.
	 */
	public double getLongitude() {
		return longitude;
	}

	/**
	 * Sets the {@link #longitude}.
	 *
	 * @param longitude
	 *            the {@link #longitude} to set.
	 */
	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(latitude);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(longitude);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	/*
	 * (non-Javadoc)
	 * 
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
		InputLocationMessageContent other = (InputLocationMessageContent) obj;
		if (Double.doubleToLongBits(latitude) != Double
				.doubleToLongBits(other.latitude))
			return false;
		if (Double.doubleToLongBits(longitude) != Double
				.doubleToLongBits(other.longitude))
			return false;
		return true;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * co.aurasphere.botmill.telegram.model.inline.input.InputMessageContent
	 * #toString()
	 */
	@Override
	public String toString() {
		return "InputLocationMessageContent [latitude=" + latitude
				+ ", longitude=" + longitude + "]";
	}

}
