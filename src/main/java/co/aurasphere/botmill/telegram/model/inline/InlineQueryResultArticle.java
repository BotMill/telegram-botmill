package co.aurasphere.botmill.telegram.model.inline;

import co.aurasphere.botmill.telegram.model.InlineKeyboardMarkup;
import co.aurasphere.botmill.telegram.model.inline.input.InlineQueryInputMessageContentResult;

import com.google.gson.annotations.SerializedName;

/**
 * Represents a link to an article or web page.
 * 
 * @author Donato Rimenti
 * @date Dec 25, 2016
 */
public class InlineQueryResultArticle extends
		InlineQueryInputMessageContentResult {

	/**
	 * The serial version UID.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Optional. URL of the result.
	 */
	private String url;

	/**
	 * Optional. Pass True, if you don't want the URL to be shown in the
	 * message.
	 */
	@SerializedName("hide_url")
	private boolean hideUrl;

	/**
	 * Optional. Short description of the result.
	 */
	private String description;

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
	 * Instantiates a new InlineQueryResultArticle.
	 */
	public InlineQueryResultArticle() {
		super(InlineQueryResultType.ARTICLE);
	}

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
	 * @param url
	 *            the {@link #url} to set.
	 */
	public void setUrl(String url) {
		this.url = url;
	}

	/**
	 * Gets the {@link #hideUrl}.
	 *
	 * @return the {@link #hideUrl}.
	 */
	public boolean isHideUrl() {
		return hideUrl;
	}

	/**
	 * Sets the {@link #hideUrl}.
	 *
	 * @param hideUrl
	 *            the {@link #hideUrl} to set.
	 */
	public void setHideUrl(boolean hideUrl) {
		this.hideUrl = hideUrl;
	}

	/**
	 * Gets the {@link #description}.
	 *
	 * @return the {@link #description}.
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * Sets the {@link #description}.
	 *
	 * @param description
	 *            the {@link #description} to set.
	 */
	public void setDescription(String description) {
		this.description = description;
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
	public String getTitle() {
		return title;
	}

	/**
	 * Sets the {@link #title}.
	 *
	 * @param title
	 *            the {@link #title} to set.
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * Gets the {@link #replyMarkup}.
	 *
	 * @return the {@link #replyMarkup}.
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
	public void setReplyMarkup(InlineKeyboardMarkup replyMarkup) {
		this.replyMarkup = replyMarkup;
	}

	/**
	 * Gets the {@link #thumbUrl}.
	 *
	 * @return the {@link #thumbUrl}.
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
	public void setThumbUrl(String thumbUrl) {
		this.thumbUrl = thumbUrl;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see co.aurasphere.botmill.telegram.model.inline.input.
	 * InlineQueryInputMessageContentResult#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result
				+ ((description == null) ? 0 : description.hashCode());
		result = prime * result + (hideUrl ? 1231 : 1237);
		result = prime * result
				+ ((replyMarkup == null) ? 0 : replyMarkup.hashCode());
		result = prime * result + thumbHeight;
		result = prime * result
				+ ((thumbUrl == null) ? 0 : thumbUrl.hashCode());
		result = prime * result + thumbWidth;
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		result = prime * result + ((url == null) ? 0 : url.hashCode());
		return result;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see co.aurasphere.botmill.telegram.model.inline.input.
	 * InlineQueryInputMessageContentResult#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		InlineQueryResultArticle other = (InlineQueryResultArticle) obj;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (hideUrl != other.hideUrl)
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
		if (url == null) {
			if (other.url != null)
				return false;
		} else if (!url.equals(other.url))
			return false;
		return true;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see co.aurasphere.botmill.telegram.model.inline.input.
	 * InlineQueryInputMessageContentResult#toString()
	 */
	@Override
	public String toString() {
		return "InlineQueryResultArticle [url=" + url + ", hideUrl=" + hideUrl
				+ ", description=" + description + ", thumbWidth=" + thumbWidth
				+ ", thumbHeight=" + thumbHeight + ", title=" + title
				+ ", replyMarkup=" + replyMarkup + ", thumbUrl=" + thumbUrl
				+ ", type=" + type + ", id=" + id + ", inputMessageContent="
				+ inputMessageContent + "]";
	}

}
