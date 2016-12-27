package co.aurasphere.botmill.telegram.model.inline.input;

import com.google.gson.annotations.SerializedName;

/**
 * The Bot API supports basic formatting for messages. You can use bold and
 * italic text, as well as inline links and pre-formatted code in your bots'
 * messages. Telegram clients will render them accordingly. You can use either
 * markdown-style or HTML-style formatting.
 * 
 * @see <a
 *      href="https://core.telegram.org/bots/api#formatting-options">Formatting
 *      options</a>.
 * 
 * @author Donato Rimenti
 * @date Dec 27, 2016
 */
public enum ParseMode {
	
	/**
	 * The html.
	 */
	HTML,
	
	/**
	 * The markdown.
	 */
	@SerializedName("Markdown")
	MARKDOWN;

}
