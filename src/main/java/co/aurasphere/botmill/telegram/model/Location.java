package co.aurasphere.botmill.telegram.model;

import java.io.Serializable;

/**
 * This object represents a point on the map.
 * 
 * @author Donato Rimenti
 * @date Dec 25, 2016
 */
public class Location implements Serializable {

	/**
	 * The serial version UID.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Longitude as defined by sender.
	 */
	private double longitude;

	/**
	 * Latitude as defined by sender.
	 */
	private double latitude;

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
	 * @param longitude the {@link #longitude} to set.
	 */
	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}

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
	 * @param latitude the {@link #latitude} to set.
	 */
	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}

	/* (non-Javadoc)
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
		Location other = (Location) obj;
		if (Double.doubleToLongBits(latitude) != Double
				.doubleToLongBits(other.latitude))
			return false;
		if (Double.doubleToLongBits(longitude) != Double
				.doubleToLongBits(other.longitude))
			return false;
		return true;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Location [longitude=" + longitude + ", latitude=" + latitude
				+ "]";
	}
}
