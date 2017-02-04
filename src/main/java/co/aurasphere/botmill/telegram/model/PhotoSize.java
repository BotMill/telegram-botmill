package co.aurasphere.botmill.telegram.model;

import java.io.Serializable;

import com.google.gson.annotations.SerializedName;

/**
 * 
 * This object represents one size of a photo or a file / sticker thumbnail.
 * 
 * @author Donato Rimenti
 * 
 */
public class PhotoSize implements Serializable {

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
	 * Photo width.
	 */
	private int width;
	
	/**
	 * Photo height.
	 */
	private int height;
	
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
		result = prime * result + fileSize;
		result = prime * result + height;
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
		PhotoSize other = (PhotoSize) obj;
		if (fileId == null) {
			if (other.fileId != null)
				return false;
		} else if (!fileId.equals(other.fileId))
			return false;
		if (fileSize != other.fileSize)
			return false;
		if (height != other.height)
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
		return "PhotoSize [fileId=" + fileId + ", width=" + width + ", height="
				+ height + ", fileSize=" + fileSize + "]";
	}
	
}
