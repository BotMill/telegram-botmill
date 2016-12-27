package co.aurasphere.botmill.telegram.model;

import java.io.Serializable;

import com.google.gson.annotations.SerializedName;

/**
 * This object represents a voice note.
 * 
 * @author Donato Rimenti
 * @date Dec 25, 2016
 */
public class Voice implements Serializable {

	/**
	 * The serial version UID.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Unique identifier for this file.
	 */
	@SerializedName("file_id")
	private String fileId;

	/**
	 * Duration of the audio in seconds as defined by sender.
	 */
	private int duration;

	/**
	 * Optional. MIME type of the file as defined by sender.
	 */
	@SerializedName("mime_type")
	private String mimeType;

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
	 * Gets the {@link #duration}.
	 *
	 * @return the {@link #duration}.
	 */
	public int getDuration() {
		return duration;
	}

	/**
	 * Sets the {@link #duration}.
	 *
	 * @param duration the {@link #duration} to set.
	 */
	public void setDuration(int duration) {
		this.duration = duration;
	}

	/**
	 * Gets the {@link #mimeType}.
	 *
	 * @return the {@link #mimeType}.
	 */
	public String getMimeType() {
		return mimeType;
	}

	/**
	 * Sets the {@link #mimeType}.
	 *
	 * @param mimeType the {@link #mimeType} to set.
	 */
	public void setMimeType(String mimeType) {
		this.mimeType = mimeType;
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
		result = prime * result + duration;
		result = prime * result + ((fileId == null) ? 0 : fileId.hashCode());
		result = prime * result + fileSize;
		result = prime * result
				+ ((mimeType == null) ? 0 : mimeType.hashCode());
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
		Voice other = (Voice) obj;
		if (duration != other.duration)
			return false;
		if (fileId == null) {
			if (other.fileId != null)
				return false;
		} else if (!fileId.equals(other.fileId))
			return false;
		if (fileSize != other.fileSize)
			return false;
		if (mimeType == null) {
			if (other.mimeType != null)
				return false;
		} else if (!mimeType.equals(other.mimeType))
			return false;
		return true;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Voice [fileId=" + fileId + ", duration=" + duration
				+ ", mimeType=" + mimeType + ", fileSize=" + fileSize + "]";
	}
}
