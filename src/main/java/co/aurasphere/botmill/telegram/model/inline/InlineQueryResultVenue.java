package co.aurasphere.botmill.telegram.model.inline;

import co.aurasphere.botmill.telegram.model.InlineKeyboardMarkup;
import co.aurasphere.botmill.telegram.model.inline.input.InlineQueryInputMessageContentResult;

import com.google.gson.annotations.SerializedName;

/**
 * Represents a venue. By default, the venue will be sent by the user.
 * Alternatively, you can use input_message_content to send a message with the
 * specified content instead of the venue. <br/>
 * <br/>
 * Note: This will only work in Telegram versions released after 9 April, 2016.
 * Older clients will ignore them.
 * 
 * @author Donato Rimenti
 * @date Dec 26, 2016
 */
public class InlineQueryResultVenue extends
		InlineQueryInputMessageContentResult {

	/**
	 * The serial version UID.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Latitude of the venue location in degrees.
	 */
	private double latitude;

	/**
	 * Longitude of the venue location in degrees.
	 */
	private double longitude;

	/**
	 * Address of the venue.
	 */
	private String address;

	/**
	 * Optional. Foursquare identifier of the venue if known.
	 */
	@SerializedName("foursquare_id")
	private String foursquareId;

	/**
	 * Optional. Thumbnail width.
	 */
	@SerializedName("thumb_width")
	private int thumbWidth;

	/**
	 * Optional. Thumbnail height.
	 */
	@SerializedName("thumb_height")
	private int thumbHeight;

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
	 * Instantiates a new InlineQueryResultVenue.
	 */
	public InlineQueryResultVenue() {
		super(InlineQueryResultType.VENUE);
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
	 * @param address
	 *            the {@link #address} to set.
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
	 * @param foursquareId
	 *            the {@link #foursquareId} to set.
	 */
	public void setFoursquareId(String foursquareId) {
		this.foursquareId = foursquareId;
	}

	/**
	 * Gets the {@link #thumbWidth}.
	 *
	 * @return the {@link #thumbWidth}.
	 */
	public int getThumbWidth() {
		return thumbWidth;
	}

	/**
	 * Sets the {@link #thumbWidth}.
	 *
	 * @param thumbWidth
	 *            the {@link #thumbWidth} to set.
	 */
	public void setThumbWidth(int thumbWidth) {
		this.thumbWidth = thumbWidth;
	}

	/**
	 * Gets the {@link #thumbHeight}.
	 *
	 * @return the {@link #thumbHeight}.
	 */
	public int getThumbHeight() {
		return thumbHeight;
	}

	/**
	 * Sets the {@link #thumbHeight}.
	 *
	 * @param thumbHeight
	 *            the {@link #thumbHeight} to set.
	 */
	public void setThumbHeight(int thumbHeight) {
		this.thumbHeight = thumbHeight;
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
	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * co.aurasphere.botmill.telegram.model.inline.InlineQueryResult#setTitle
	 * (java.lang.String)
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
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result
				+ ((foursquareId == null) ? 0 : foursquareId.hashCode());
		long temp;
		temp = Double.doubleToLongBits(latitude);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(longitude);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result
				+ ((replyMarkup == null) ? 0 : replyMarkup.hashCode());
		result = prime * result + thumbHeight;
		result = prime * result
				+ ((thumbUrl == null) ? 0 : thumbUrl.hashCode());
		result = prime * result + thumbWidth;
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
		InlineQueryResultVenue other = (InlineQueryResultVenue) obj;
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
		if (Double.doubleToLongBits(latitude) != Double
				.doubleToLongBits(other.latitude))
			return false;
		if (Double.doubleToLongBits(longitude) != Double
				.doubleToLongBits(other.longitude))
			return false;
		if (replyMarkup == null) {
			if (other.replyMarkup != null)
				return false;
		} else if (!replyMarkup.equals(other.replyMarkup))
			return false;
		if (thumbHeight != other.thumbHeight)
			return false;
		if (thumbUrl == null) {
			if (other.thumbUrl != null)
				return false;
		} else if (!thumbUrl.equals(other.thumbUrl))
			return false;
		if (thumbWidth != other.thumbWidth)
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
		return "InlineQueryResultVenue [latitude=" + latitude + ", longitude="
				+ longitude + ", address=" + address + ", foursquareId="
				+ foursquareId + ", thumbWidth=" + thumbWidth
				+ ", thumbHeight=" + thumbHeight + ", title=" + title
				+ ", replyMarkup=" + replyMarkup + ", thumbUrl=" + thumbUrl
				+ ", type=" + type + ", id=" + id + ", inputMessageContent="
				+ inputMessageContent + "]";
	}

}
