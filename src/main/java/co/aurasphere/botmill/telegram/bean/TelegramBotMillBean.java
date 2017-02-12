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
package co.aurasphere.botmill.telegram.bean;

import java.util.List;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import co.aurasphere.botmill.telegram.TelegramBotMillContext;
import co.aurasphere.botmill.telegram.event.TelegramBotMillEventType;
import co.aurasphere.botmill.telegram.model.Message;
import co.aurasphere.botmill.telegram.model.outcoming.TelegramBotMillResponse;
import co.aurasphere.botmill.telegram.model.update.Update;
import co.aurasphere.botmill.telegram.support.TelegramBotMillMonitor;

/**
 * Base Telegram bean which contains utility methods for handling an update.
 * 
 * @author Donato Rimenti
 * 
 */
public class TelegramBotMillBean {

	/**
	 * The logger.
	 */
	private final static Logger logger = LoggerFactory
			.getLogger(TelegramBotMillBean.class);

	/**
	 * Retrieves a text message from an Update. It never returns null.
	 * 
	 * @param update
	 *            the update.
	 * @return the text message if found or an empty String otherwise. It never
	 *         returns null.
	 */
	protected String safeGetMessage(Update update) {
		if (update != null && update.getMessage() != null
				&& update.getMessage().getText() != null) {
			return update.getMessage().getText();
		}
		return "";
	}

	/**
	 * Retrieves the chat ID from an update. It never returns null.
	 * 
	 * @param update
	 *            the Telegram update.
	 * @return the chat ID if found or an empty String otherwise. It never
	 *         returns null.
	 */
	protected String safeGetChatId(Update update) {
		if (update != null && update.getMessage() != null
				&& update.getMessage().getChat() != null
				&& update.getMessage().getChat().getId() != null) {
			return update.getMessage().getChat().getId();
		}
		return "";
	}

	/**
	 * Returns the kind of callback received for the current envelope.
	 * 
	 * @param update
	 *            the upfate to inspect.
	 * @return a {@link TelegramBotMillEventType} representing the current
	 *         callback type.
	 */
	protected TelegramBotMillEventType eventKind(Update update) {
		Message message = update.getMessage();
		if (message != null) {
			if (message.getText() != null) {
				return TelegramBotMillEventType.MESSAGE;
			}
			if (message.getAudio() != null) {
				return TelegramBotMillEventType.AUDIO;
			}
			if (message.getCaption() != null) {
				return TelegramBotMillEventType.CAPTION;
			}
			if (message.getContact() != null) {
				return TelegramBotMillEventType.CONTACT;
			}
			if (message.getDocument() != null) {
				return TelegramBotMillEventType.DOCUMENT;
			}
			if (message.getGame() != null) {
				return TelegramBotMillEventType.GAME;
			}
			if (message.getLeftChatMember() != null) {
				return TelegramBotMillEventType.CHAT_MEMBER_LEFT;
			}
			if (message.getLocation() != null) {
				return TelegramBotMillEventType.LOCATION;
			}
			if (message.getNewChatMember() != null) {
				return TelegramBotMillEventType.NEW_CHAT_MEMBER;
			}
			if (message.getNewChatPhoto() != null) {
				return TelegramBotMillEventType.NEW_CHAT_PHOTO;
			}
			if (message.getNewChatTitle() != null) {
				return TelegramBotMillEventType.NEW_CHAT_TITLE;
			}
			if (message.getPhoto() != null) {
				return TelegramBotMillEventType.PHOTO;
			}
			if (message.getPinnedMessage() != null) {
				return TelegramBotMillEventType.PINNED_MESSAGE;
			}
			if (message.getReplyToMessage() != null) {
				return TelegramBotMillEventType.REPLY_TO_MESSAGE;
			}
			if (message.getSticker() != null) {
				return TelegramBotMillEventType.STICKER;
			}
			if (message.getVenue() != null) {
				return TelegramBotMillEventType.VENUE;
			}
			if (message.getVideo() != null) {
				return TelegramBotMillEventType.VIDEO;
			}
			if (message.getVoice() != null) {
				return TelegramBotMillEventType.VOICE;
			}
		}
		return TelegramBotMillEventType.ANY;
	}

	/**
	 * Validates the {@link TelegramBotMillResponse}.
	 *
	 * @param response
	 *            the response
	 * @return true if the response is valid, false otherwise.
	 */
	protected boolean validate(TelegramBotMillResponse response) {
		// If validations are not enabled, returns true.
		if (!TelegramBotMillContext.getInstance().isValidationEnabled()) {
			return true;
		}

		boolean valid = true;
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator validator = factory.getValidator();
		Set<ConstraintViolation<TelegramBotMillResponse>> violations = validator
				.validate(response);
		for (ConstraintViolation<TelegramBotMillResponse> v : violations) {
			valid = false;
			logger.error(
					"TelegramBotMillResponse validation error. Message: [{}] Value: [{}], Class: [{}], Field: [{}]",
					v.getMessage(), v.getInvalidValue(), v.getRootBean(),
					v.getPropertyPath());
		}

		if (valid == false) {
			// Sends the constraint violations through the callback.
			List<TelegramBotMillMonitor> registeredMonitors = TelegramBotMillContext
					.getInstance().getRegisteredMonitors();
			for (TelegramBotMillMonitor monitor : registeredMonitors) {
				// TODO
				// monitor.onValidationError(response, violations);
			}
		}

		return valid;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "TelegramBotMillBean []";
	}

}
