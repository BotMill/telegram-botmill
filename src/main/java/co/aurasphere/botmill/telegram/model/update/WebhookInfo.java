package co.aurasphere.botmill.telegram.model.update;

import java.io.Serializable;
import java.util.Calendar;
import java.util.List;

import com.google.gson.annotations.SerializedName;

/**
 * Contains information about the current status of a webhook.
 * 
 * @author Donato Rimenti
 * 
 */
public class WebhookInfo implements Serializable {

	/**
	 * The serial version UID.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Webhook URL, may be empty if webhook is not set up.
	 */
	private String url;

	/**
	 * True, if a custom certificate was provided for webhook certificate
	 * checks.
	 */
	@SerializedName("has_custom_certificate")
	private boolean hasCustomCertificate;

	/**
	 * Number of updates awaiting delivery.
	 */
	@SerializedName("pending_update_count")
	private int pendingUpdateCount;

	// TODO: check if this works
	/**
	 * Optional. Unix time for the most recent error that happened when trying
	 * to deliver an update via webhook.
	 */
	@SerializedName("last_error_date")
	private Calendar lastErrorDate;

	/**
	 * Optional. Error message in human-readable format for the most recent
	 * error that happened when trying to deliver an update via webhook.
	 */
	@SerializedName("last_error_message")
	private String lastErrorMessage;

	/**
	 * Optional. Maximum allowed number of simultaneous HTTPS connections to the
	 * webhook for update delivery.
	 */
	@SerializedName("max_connections")
	private int maxConnections;

	/**
	 * Optional. A list of update types the bot is subscribed to. Defaults to
	 * all update types.
	 */
	@SerializedName("allowed_updates")
	private List<String> allowedUpdates;

	/**
	 * Gets the {@link #url}.
	 *
	 * @return the {@link #url}.
	 */
	public String getUrl() {
		return url;
	}

	/**
	 * Sets the {@link #url}.
	 *
	 * @param url the {@link #url} to set.
	 */
	public void setUrl(String url) {
		this.url = url;
	}

	/**
	 * Gets the {@link #hasCustomCertificate}.
	 *
	 * @return the {@link #hasCustomCertificate}.
	 */
	public boolean isHasCustomCertificate() {
		return hasCustomCertificate;
	}

	/**
	 * Sets the {@link #hasCustomCertificate}.
	 *
	 * @param hasCustomCertificate the {@link #hasCustomCertificate} to set.
	 */
	public void setHasCustomCertificate(boolean hasCustomCertificate) {
		this.hasCustomCertificate = hasCustomCertificate;
	}

	/**
	 * Gets the {@link #pendingUpdateCount}.
	 *
	 * @return the {@link #pendingUpdateCount}.
	 */
	public int getPendingUpdateCount() {
		return pendingUpdateCount;
	}

	/**
	 * Sets the {@link #pendingUpdateCount}.
	 *
	 * @param pendingUpdateCount the {@link #pendingUpdateCount} to set.
	 */
	public void setPendingUpdateCount(int pendingUpdateCount) {
		this.pendingUpdateCount = pendingUpdateCount;
	}

	/**
	 * Gets the {@link #lastErrorDate}.
	 *
	 * @return the {@link #lastErrorDate}.
	 */
	public Calendar getLastErrorDate() {
		return lastErrorDate;
	}

	/**
	 * Sets the {@link #lastErrorDate}.
	 *
	 * @param lastErrorDate the {@link #lastErrorDate} to set.
	 */
	public void setLastErrorDate(Calendar lastErrorDate) {
		this.lastErrorDate = lastErrorDate;
	}

	/**
	 * Gets the {@link #lastErrorMessage}.
	 *
	 * @return the {@link #lastErrorMessage}.
	 */
	public String getLastErrorMessage() {
		return lastErrorMessage;
	}

	/**
	 * Sets the {@link #lastErrorMessage}.
	 *
	 * @param lastErrorMessage the {@link #lastErrorMessage} to set.
	 */
	public void setLastErrorMessage(String lastErrorMessage) {
		this.lastErrorMessage = lastErrorMessage;
	}

	/**
	 * Gets the {@link #maxConnections}.
	 *
	 * @return the {@link #maxConnections}.
	 */
	public int getMaxConnections() {
		return maxConnections;
	}

	/**
	 * Sets the {@link #maxConnections}.
	 *
	 * @param maxConnections the {@link #maxConnections} to set.
	 */
	public void setMaxConnections(int maxConnections) {
		this.maxConnections = maxConnections;
	}

	/**
	 * Gets the {@link #allowedUpdates}.
	 *
	 * @return the {@link #allowedUpdates}.
	 */
	public List<String> getAllowedUpdates() {
		return allowedUpdates;
	}

	/**
	 * Sets the {@link #allowedUpdates}.
	 *
	 * @param allowedUpdates the {@link #allowedUpdates} to set.
	 */
	public void setAllowedUpdates(List<String> allowedUpdates) {
		this.allowedUpdates = allowedUpdates;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (hasCustomCertificate ? 1231 : 1237);
		result = prime * result
				+ ((lastErrorDate == null) ? 0 : lastErrorDate.hashCode());
		result = prime
				* result
				+ ((lastErrorMessage == null) ? 0 : lastErrorMessage.hashCode());
		result = prime * result + maxConnections;
		result = prime * result + pendingUpdateCount;
		result = prime * result + ((url == null) ? 0 : url.hashCode());
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
		WebhookInfo other = (WebhookInfo) obj;
		if (hasCustomCertificate != other.hasCustomCertificate)
			return false;
		if (lastErrorDate == null) {
			if (other.lastErrorDate != null)
				return false;
		} else if (!lastErrorDate.equals(other.lastErrorDate))
			return false;
		if (lastErrorMessage == null) {
			if (other.lastErrorMessage != null)
				return false;
		} else if (!lastErrorMessage.equals(other.lastErrorMessage))
			return false;
		if (maxConnections != other.maxConnections)
			return false;
		if (pendingUpdateCount != other.pendingUpdateCount)
			return false;
		if (url == null) {
			if (other.url != null)
				return false;
		} else if (!url.equals(other.url))
			return false;
		return true;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "WebhookInfo [url=" + url + ", hasCustomCertificate="
				+ hasCustomCertificate + ", pendingUpdateCount="
				+ pendingUpdateCount + ", lastErrorDate=" + lastErrorDate
				+ ", lastErrorMessage=" + lastErrorMessage
				+ ", maxConnections=" + maxConnections + "]";
	}
}
