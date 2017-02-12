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
package co.aurasphere.botmill.telegram.model.outcoming.factory;

import co.aurasphere.botmill.telegram.model.outcoming.TelegramBotMillResponse;


/**
 * Static class that allows the creation of a {@link TelegramBotMillResponse}.
 * 
 * @author Donato Rimenti
 */
// TODO: javadoc
public class ReplyFactory {

	/**
	 * Instantiates a new ReplyFactory.
	 */
	private ReplyFactory() {
	}
//
//	/**
//	 * Adds a {@link TypingAction} to the response.
//	 *
//	 * @param action
//	 *            the action to add. Can't be null.
//	 * @return a builder for that action.
//	 * @see <a href=
//	 *      "https://developers.facebook.com/docs/messenger-platform/send-api-reference/sender-actions"
//	 *      > Facebook's Messenger Platform Sender Actions Documentation</a>
//	 */
//	public static ActionResponseBuilder addTypingAction(TypingAction action) {
//		return new ActionResponseBuilder(action);
//	}
//
//	/**
//	 * Adds a Button Template to the response.
//	 *
//	 * @param message
//	 *            the message of the Button Template.
//	 * @return a builder for the template.
//	 * @see <a href=
//	 *      "https://developers.facebook.com/docs/messenger-platform/send-api-reference/button-template"
//	 *      > Facebook's Messenger Platform Button Template Documentation</a>
//	 */
//	public static ButtonTemplateBuilder addButtonTemplate(String message) {
//		return new ButtonTemplateBuilder(message);
//	}
//
//	/**
//	 * Adds a Generic Template to the response.
//	 *
//	 * @return a builder for the template.
//	 * @see <a href=
//	 *      "https://developers.facebook.com/docs/messenger-platform/send-api-reference/generic-template"
//	 *      > Facebook's Messenger Platform Generic Template Documentation</a>
//	 */
//	public static GenericTemplateBuilder addGenericTemplate() {
//		return new GenericTemplateBuilder();
//	}
//
//	/**
//	 * Adds a List Template to the response.
//	 *
//	 * @return a builder for the template.
//	 * @see <a href=
//	 *      "https://developers.facebook.com/docs/messenger-platform/send-api-reference/list-template"
//	 *      > Facebook's Messenger Platform List Template Documentation</a>
//	 */
//	public static ListTemplateBuilder addListTemplate() {
//		return new ListTemplateBuilder();
//	}
//
	/**
	 * Creates a response which contains only a text message.
	 *
	 * @param message
	 *            the message to create.
	 * @return a builder for the response.
	 */
	public static TextMessageResponseBuilder addTextMessageOnly(String message) {
		return new TextMessageResponseBuilder(message);
	}
//
//	/**
//	 * Adds an image attachment to the response.
//	 *
//	 * @param url
//	 *            the url of the image to attach.
//	 * @return a builder for the response.
//	 * @see <a href=
//	 *      "https://developers.facebook.com/docs/messenger-platform/send-api-reference/image-attachment"
//	 *      > Facebook's Messenger Platform Image Attachment Documentation</a>
//	 */
//	public static AttachmentMessageBuilder addImageAttachment(String url) {
//		return new AttachmentMessageBuilder(AttachmentType.IMAGE, url);
//	}
//
//	/**
//	 * Adds an audio attachment to the response.
//	 *
//	 * @param url
//	 *            the url of the audio to attach.
//	 * @return a builder for the response.
//	 * @see <a href=
//	 *      "https://developers.facebook.com/docs/messenger-platform/send-api-reference/audio-attachment"
//	 *      > Facebook's Messenger Platform Audio Attachment Documentation</a>
//	 */
//	public static AttachmentMessageBuilder addAudioAttachment(String url) {
//		return new AttachmentMessageBuilder(AttachmentType.AUDIO, url);
//	}
//
//	/**
//	 * Adds a video attachment to the response.
//	 *
//	 * @param url
//	 *            the url of the video to attach.
//	 * @return a builder for the response.
//	 * @see <a href=
//	 *      "https://developers.facebook.com/docs/messenger-platform/send-api-reference/video-attachment"
//	 *      > Facebook's Messenger Platform Video Attachment Documentation</a>
//	 */
//	public static AttachmentMessageBuilder addVideoAttachment(String url) {
//		return new AttachmentMessageBuilder(AttachmentType.VIDEO, url);
//	}
//
//	/**
//	 * Adds a file attachment to the response.
//	 *
//	 * @param url
//	 *            the url of the file to attach.
//	 * @return a builder for the response.
//	 * @see <a href=
//	 *      "https://developers.facebook.com/docs/messenger-platform/send-api-reference/file-attachment"
//	 *      > Facebook's Messenger Platform File Attachment Documentation</a>
//	 */
//	public static AttachmentMessageBuilder addFileAttachment(String url) {
//		return new AttachmentMessageBuilder(AttachmentType.FILE, url);
//	}
//
	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "ReplyFactory []";
	}

}
