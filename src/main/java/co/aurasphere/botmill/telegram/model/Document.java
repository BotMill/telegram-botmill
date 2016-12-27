package co.aurasphere.botmill.telegram.model;

import java.io.Serializable;

import com.google.gson.annotations.SerializedName;

/**
 * This object represents a general file (as opposed to photos, voice messages
 * and audio files).
 * 
 * @author Donato Rimenti
 * @date Dec 25, 2016
 */
public class Document implements Serializable {

	/**
	 * The serial version UID.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Unique file identifier.
	 */
	@SerializedName("file_id")
	private String fileId;

	/**
	 * Optional. Document thumbnail as defined by sender.
	 */
	private PhotoSize thumb;

	/**
	 * Optional. Original filename as defined by sender.
	 */
	@SerializedName("file_name")
	private String fileName;

	/**
	 * Optional. MIME type of the file as defined by sender.
	 */
	@SerializedName("mime_type")
	private String mimeType;

	/**
	 * Optional. File size.
	 */
	@SerializedName("file_type")
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
	 * Gets the {@link #fileName}.
	 *
	 * @return the {@link #fileName}.
	 */
	public String getFileName() {
		return fileName;
	}

	/**
	 * Sets the {@link #fileName}.
	 *
	 * @param fileName the {@link #fileName} to set.
	 */
	public void setFileName(String fileName) {
		this.fileName = fileName;
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
		result = prime * result + ((fileId == null) ? 0 : fileId.hashCode());
		result = prime * result
				+ ((fileName == null) ? 0 : fileName.hashCode());
		result = prime * result + fileSize;
		result = prime * result
				+ ((mimeType == null) ? 0 : mimeType.hashCode());
		result = prime * result + ((thumb == null) ? 0 : thumb.hashCode());
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
		Document other = (Document) obj;
		if (fileId == null) {
			if (other.fileId != null)
				return false;
		} else if (!fileId.equals(other.fileId))
			return false;
		if (fileName == null) {
			if (other.fileName != null)
				return false;
		} else if (!fileName.equals(other.fileName))
			return false;
		if (fileSize != other.fileSize)
			return false;
		if (mimeType == null) {
			if (other.mimeType != null)
				return false;
		} else if (!mimeType.equals(other.mimeType))
			return false;
		if (thumb == null) {
			if (other.thumb != null)
				return false;
		} else if (!thumb.equals(other.thumb))
			return false;
		return true;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Document [fileId=" + fileId + ", thumb=" + thumb
				+ ", fileName=" + fileName + ", mimeType=" + mimeType
				+ ", fileSize=" + fileSize + "]";
	}

}
