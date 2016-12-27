package co.aurasphere.botmill.telegram.model;

import java.io.Serializable;

import com.google.gson.annotations.SerializedName;

/**
 * This object represents a file ready to be downloaded. The file can be
 * downloaded via the link https://api.telegram.org/file/bot<token>/<file_path>.
 * It is guaranteed that the link will be valid for at least 1 hour. When the
 * link expires, a new one can be requested by calling getFile. Maximum file
 * size to download is 20 MB.
 * 
 * @author Donato Rimenti
 * @date Dec 25, 2016
 */
public class File implements Serializable {

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
	 * Optional. File size, if known.
	 */
	@SerializedName("file_size")
	private int fileSize;

	/**
	 * Optional. File path. Use
	 * https://api.telegram.org/file/bot<token>/<file_path> to get the file.
	 */
	@SerializedName("file_path")
	private String filePath;

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

	/**
	 * Gets the {@link #filePath}.
	 *
	 * @return the {@link #filePath}.
	 */
	public String getFilePath() {
		return filePath;
	}

	/**
	 * Sets the {@link #filePath}.
	 *
	 * @param filePath the {@link #filePath} to set.
	 */
	public void setFilePath(String filePath) {
		this.filePath = filePath;
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
				+ ((filePath == null) ? 0 : filePath.hashCode());
		result = prime * result + fileSize;
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
		File other = (File) obj;
		if (fileId == null) {
			if (other.fileId != null)
				return false;
		} else if (!fileId.equals(other.fileId))
			return false;
		if (filePath == null) {
			if (other.filePath != null)
				return false;
		} else if (!filePath.equals(other.filePath))
			return false;
		if (fileSize != other.fileSize)
			return false;
		return true;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "File [fileId=" + fileId + ", fileSize=" + fileSize
				+ ", filePath=" + filePath + "]";
	}

}
