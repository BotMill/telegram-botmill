package co.aurasphere.botmill.telegram.model;

import com.google.gson.annotations.SerializedName;

/**
 * Type of the entity. Can be mention (@username), hashtag, bot_command, url,
 * email, bold (bold text), italic (italic text), code (monowidth string), pre
 * (monowidth block), text_link (for clickable text URLs), text_mention (for
 * users without usernames).
 * 
 * @author Donato Rimenti
 * 
 */
public enum MentionType {
	
	/**
	 * The mention (@username).
	 */
	@SerializedName("mention")
	MENTION,
	
	/**
	 * The hashtag.
	 */
	@SerializedName("hashtag")
	HASHTAG,
	
	/**
	 * The bot command.
	 */
	@SerializedName("bot_command")
	BOT_COMMAND,
	
	/**
	 * The url.
	 */
	@SerializedName("url")
	URL,
	
	/**
	 * The email.
	 */
	@SerializedName("email")
	EMAIL,
	
	/**
	 * The bold (bold text).
	 */
	@SerializedName("bold")
	BOLD,
	
	/**
	 * The italic (italic text).
	 */
	@SerializedName("italic")
	ITALIC,
	
	/**
	 * The code (monowidth string).
	 */
	@SerializedName("code")
	CODE,
	
	/**
	 * The pre (monowidth block).
	 */
	@SerializedName("pre")
	PRE,
	
	/**
	 * The text link (for clickable text URLs).
	 */
	@SerializedName("text_link")
	TEXT_LINK,
	
	/**
	 * The text mention (for users without usernames).
	 */
	@SerializedName("text_mention")
	TEXT_MENTION;

}
