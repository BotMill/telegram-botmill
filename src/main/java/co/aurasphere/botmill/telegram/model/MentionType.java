/*
 * MIT License
 *
 * Copyright (c) 2016 BotMill.io
 * 
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
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
