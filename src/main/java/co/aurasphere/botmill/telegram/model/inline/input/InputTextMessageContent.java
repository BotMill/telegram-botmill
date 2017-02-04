package co.aurasphere.botmill.telegram.model.inline.input;

import com.google.gson.annotations.SerializedName;

/**
 * Represents the content of a text message to be sent as the result of an
 * inline query.
 * 
 * @author Donato Rimenti
 * 
 */
public class InputTextMessageContent extends InputMessageContent {

	/**
	 * The serial version UID.
	 */
	private static final long serialVersionUID = 1L;

	// TODO: validation?
	/**
	 * Text of the message to be sent, 1-4096 characters.
	 */
	@SerializedName("message_text")
	private String messageText;

	/**
	 * Optional. Send {@link ParseMode#MARKDOWN} or {@link ParseMode#HTML}, if
	 * you want Telegram apps to show <a
	 * href="https://core.telegram.org/bots/api#formatting-options"> bold,
	 * italic, fixed-width text or inline URLs</a> in your bot's message.
	 */
	@SerializedName("parse_mode")
	private ParseMode parseMode;

	/**
	 * Optional. Disables link previews for links in the sent message.
	 */
	@SerializedName("disable_web_page_preview")
	private boolean disableWebPagePreview;

	/**
	 * Gets the {@link #messageText}.
	 *
	 * @return the {@link #messageText}.
	 */
	public String getMessageText() {
		return messageText;
	}

	/**
	 * Sets the {@link #messageText}.
	 *
	 * @param messageText
	 *            the {@link #messageText} to set.
	 */
	public void setMessageText(String messageText) {
		this.messageText = messageText;
	}

	/**
	 * Gets the {@link #parseMode}.
	 *
	 * @return the {@link #parseMode}.
	 */
	public ParseMode getParseMode() {
		return parseMode;
	}

	/**
	 * Sets the {@link #parseMode}.
	 *
	 * @param parseMode
	 *            the {@link #parseMode} to set.
	 */
	public void setParseMode(ParseMode parseMode) {
		this.parseMode = parseMode;
	}

	/**
	 * Gets the {@link #disableWebPagePreview}.
	 *
	 * @return the {@link #disableWebPagePreview}.
	 */
	public boolean isDisableWebPagePreview() {
		return disableWebPagePreview;
	}

	/**
	 * Sets the {@link #disableWebPagePreview}.
	 *
	 * @param disableWebPagePreview
	 *            the {@link #disableWebPagePreview} to set.
	 */
	public void setDisableWebPagePreview(boolean disableWebPagePreview) {
		this.disableWebPagePreview = disableWebPagePreview;
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
		result = prime * result + (disableWebPagePreview ? 1231 : 1237);
		result = prime * result
				+ ((messageText == null) ? 0 : messageText.hashCode());
		result = prime * result
				+ ((parseMode == null) ? 0 : parseMode.hashCode());
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
		InputTextMessageContent other = (InputTextMessageContent) obj;
		if (disableWebPagePreview != other.disableWebPagePreview)
			return false;
		if (messageText == null) {
			if (other.messageText != null)
				return false;
		} else if (!messageText.equals(other.messageText))
			return false;
		if (parseMode != other.parseMode)
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
		return "InputTextMessageContent [messageText=" + messageText
				+ ", parseMode=" + parseMode + ", disableWebPagePreview="
				+ disableWebPagePreview + "]";
	}

}
