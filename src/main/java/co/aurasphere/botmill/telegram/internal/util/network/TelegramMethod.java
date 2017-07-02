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
package co.aurasphere.botmill.telegram.internal.util.network;

/**
 * Enum that represents all Telegram supported methods.
 * 
 * @author Donato Rimenti
 */
public enum TelegramMethod {

	// Sending methods.
	/**
	 * The send message.
	 */
	SEND_MESSAGE("sendMessage"),
	
	/**
	 * The send photo.
	 */
	SEND_PHOTO("sendPhoto"),
	
	/**
	 * The send audio.
	 */
	SEND_AUDIO("sendAudio"),
	
	/**
	 * The send document.
	 */
	SEND_DOCUMENT("sendDocument"),
	
	/**
	 * The send sticker.
	 */
	SEND_STICKER("sendSticker"),
	
	/**
	 * The send video.
	 */
	SEND_VIDEO("sendVideo"),
	
	/**
	 * The send voice.
	 */
	SEND_VOICE("sendVoice"),
	
	/**
	 * The send location.
	 */
	SEND_LOCATION("sendLocation"),
	
	/**
	 * The send venue.
	 */
	SEND_VENUE("sendVenue"),
	
	/**
	 * The send contact.
	 */
	SEND_CONTACT("sendContact"),
	
	/**
	 * The send chat action.
	 */
	SEND_CHAT_ACTION("sendChatAction"),
	
	// Updating messages methods.
	/**
	 * The edit message text.
	 */
	EDIT_MESSAGE_TEXT("editMessageText"),
	
	/**
	 * The edit message caption.
	 */
	EDIT_MESSAGE_CAPTION("editMessageCaption"),
	
	/**
	 * The edit message reply markup.
	 */
	EDIT_MESSAGE_REPLY_MARKUP("editMessageReplyMarkup"),
	
	// Query methods.
	/**
	 * The get me.
	 */
	GET_ME("getMe"),
	
	/**
	 * The get user profile photos.
	 */
	GET_USER_PROFILE_PHOTOS("getUserProfilePhotos"),
	
	/**
	 * The get file.
	 */
	GET_FILE("getFile"),
	
	/**
	 * The get chat.
	 */
	GET_CHAT("getChat"),
	
	/**
	 * The get chat administrators.
	 */
	GET_CHAT_ADMINISTRATORS("getChatAdministrators"),
	
	/**
	 * The get chat members count.
	 */
	GET_CHAT_MEMBERS_COUNT("getChatMembersCount"),
	
	/**
	 * The get chat member.
	 */
	GET_CHAT_MEMBER("getChatMember"),
	
	// Updates methods.
	/**
	 * The get updates.
	 */
	GET_UPDATES("getUpdates"),

	/**
	 * The set webhook.
	 */
	SET_WEBHOOK("setWebhook"),
	
	/**
	 * The delete webhook.
	 */
	DELETE_WEBHOOK("deleteWebhook"),
	
	/**
	 * The get webhook info.
	 */
	GET_WEBHOOK_INFO("getWebhookInfo"), 

	// Administration methods.
	/**
	 * The forward message.
	 */
	FORWARD_MESSAGE("forwardMessage"),
	
	/**
	 * The kick chat member.
	 */
	KICK_CHAT_MEMBER("kickChatMember"),
	
	/**
	 * The leave chat.
	 */
	LEAVE_CHAT("leaveChat"),
	
	/**
	 * The unban chat member.
	 */
	UNBAN_CHAT_MEMBER("unbanChatMember"),
	
	/**
	 * The answer callback query.
	 */
	// Answer query methods.
	ANSWER_CALLBACK_QUERY("answerCallbackQuery"),
	
	/**
	 * The answer inline query.
	 */
	ANSWER_INLINE_QUERY("answerInlineQuery"),

	// Games methods.
	/**
	 * The send game.
	 */
	SEND_GAME("sendGame"),
	
	/**
	 * The set game score.
	 */
	SET_GAME_SCORE("setGameScore"),
	
	/**
	 * The get game high score.
	 */
	GET_GAME_HIGH_SCORE("getGameHighScore")
	;

	/**
	 * The name of this Telegram method.
	 */
	private String methodName;

	/**
	 * Instantiates a new TelegramMethod.
	 *
	 * @param methodName
	 *            the {@link #methodName}.
	 */
	private TelegramMethod(String methodName) {
		this.methodName = methodName;
	}

	/**
	 * Gets the {@link #methodName}.
	 *
	 * @return the {@link #methodName}.
	 */
	public String getMethodName() {
		return methodName;
	}

	/**
	 * Sets the {@link #methodName}.
	 *
	 * @param methodName
	 *            the {@link #methodName} to set.
	 */
	public void setMethodName(String methodName) {
		this.methodName = methodName;
	}

}
