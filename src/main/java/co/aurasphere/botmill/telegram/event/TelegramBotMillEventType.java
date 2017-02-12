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
package co.aurasphere.botmill.telegram.event;

/**
 * Enum that represents all the possible callbacks from Telegram Platform.
 *
 * @author Donato Rimenti
 */
public enum TelegramBotMillEventType {

	/**
	 * The message.
	 */
	MESSAGE,

	/**
	 * The audio.
	 */
	AUDIO,

	/**
	 * The caption.
	 */
	CAPTION,

	/**
	 * The contact.
	 */
	CONTACT,

	/**
	 * The document.
	 */
	DOCUMENT,

	/**
	 * The game.
	 */
	GAME,

	/**
	 * The chat member left.
	 */
	CHAT_MEMBER_LEFT,

	/**
	 * The location.
	 */
	LOCATION,

	/**
	 * The new chat member.
	 */
	NEW_CHAT_MEMBER,

	/**
	 * The new chat photo.
	 */
	NEW_CHAT_PHOTO,

	/**
	 * The new chat title.
	 */
	NEW_CHAT_TITLE,

	/**
	 * The photo.
	 */
	PHOTO,

	/**
	 * The pinned message.
	 */
	PINNED_MESSAGE,

	/**
	 * The reply to message.
	 */
	REPLY_TO_MESSAGE,

	/**
	 * The sticker.
	 */
	STICKER,

	/**
	 * The venue.
	 */
	VENUE,

	/**
	 * The video.
	 */
	VIDEO,

	/**
	 * The voice.
	 */
	VOICE,

	/**
	 * Any of the previous callback. Used as a placeholder.
	 */
	ANY;

}
