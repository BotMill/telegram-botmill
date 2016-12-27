package co.aurasphere.botmill.telegram.model.update;

import java.io.Serializable;

import co.aurasphere.botmill.telegram.model.CallbackQuery;
import co.aurasphere.botmill.telegram.model.Message;
import co.aurasphere.botmill.telegram.model.inline.ChosenInlineResult;
import co.aurasphere.botmill.telegram.model.inline.InlineQuery;

import com.google.gson.annotations.SerializedName;

/**
 * This object represents an incoming update. At most one of the optional
 * parameters can be present in any given update.
 * 
 * @author Donato Rimenti
 * @date Dec 25, 2016
 */
public class Update implements Serializable {

	/**
	 * The serial version UID.
	 */
	private static final long serialVersionUID = 1L;

	// TODO: link to setWebhook method once created
	/**
	 * The update‘s unique identifier. Update identifiers start from a certain
	 * positive number and increase sequentially. This ID becomes especially
	 * handy if you’re using Webhooks, since it allows you to ignore repeated
	 * updates or to restore the correct update sequence, should they get out of
	 * order.
	 */
	@SerializedName("update_id")
	private String updateId;

	/**
	 * Optional. New incoming message of any kind — text, photo, sticker, etc.
	 */
	private Message message;

	/**
	 * Optional. New version of a message that is known to the bot and was
	 * edited.
	 */
	@SerializedName("edited_message")
	private Message editedMessage;

	/**
	 * Optional. New incoming channel post of any kind — text, photo, sticker,
	 * etc.
	 */
	@SerializedName("channel_post")
	private Message channelPost;

	/**
	 * Optional. New version of a channel post that is known to the bot and was
	 * edited.
	 */
	@SerializedName("edited_channel_post")
	private Message editedChannelPost;

	/**
	 * Optional. New incoming inline query.
	 */
	@SerializedName("inline_query")
	private InlineQuery inlineQuery;

	/**
	 * Optional. The result of an inline query that was chosen by a user and
	 * sent to their chat partner.
	 */
	@SerializedName("chosen_inline_result")
	private ChosenInlineResult chosenInlineResult;
	
	/**
	 * Optional. New incoming callback query.
	 */
	@SerializedName("callback_query")
	private CallbackQuery callbackQuery;

	/**
	 * Gets the {@link #updateId}.
	 *
	 * @return the {@link #updateId}.
	 */
	public String getUpdateId() {
		return updateId;
	}

	/**
	 * Sets the {@link #updateId}.
	 *
	 * @param updateId the {@link #updateId} to set.
	 */
	public void setUpdateId(String updateId) {
		this.updateId = updateId;
	}

	/**
	 * Gets the {@link #message}.
	 *
	 * @return the {@link #message}.
	 */
	public Message getMessage() {
		return message;
	}

	/**
	 * Sets the {@link #message}.
	 *
	 * @param message the {@link #message} to set.
	 */
	public void setMessage(Message message) {
		this.message = message;
	}

	/**
	 * Gets the {@link #editedMessage}.
	 *
	 * @return the {@link #editedMessage}.
	 */
	public Message getEditedMessage() {
		return editedMessage;
	}

	/**
	 * Sets the {@link #editedMessage}.
	 *
	 * @param editedMessage the {@link #editedMessage} to set.
	 */
	public void setEditedMessage(Message editedMessage) {
		this.editedMessage = editedMessage;
	}

	/**
	 * Gets the {@link #channelPost}.
	 *
	 * @return the {@link #channelPost}.
	 */
	public Message getChannelPost() {
		return channelPost;
	}

	/**
	 * Sets the {@link #channelPost}.
	 *
	 * @param channelPost the {@link #channelPost} to set.
	 */
	public void setChannelPost(Message channelPost) {
		this.channelPost = channelPost;
	}

	/**
	 * Gets the {@link #editedChannelPost}.
	 *
	 * @return the {@link #editedChannelPost}.
	 */
	public Message getEditedChannelPost() {
		return editedChannelPost;
	}

	/**
	 * Sets the {@link #editedChannelPost}.
	 *
	 * @param editedChannelPost the {@link #editedChannelPost} to set.
	 */
	public void setEditedChannelPost(Message editedChannelPost) {
		this.editedChannelPost = editedChannelPost;
	}

	/**
	 * Gets the {@link #inlineQuery}.
	 *
	 * @return the {@link #inlineQuery}.
	 */
	public InlineQuery getInlineQuery() {
		return inlineQuery;
	}

	/**
	 * Sets the {@link #inlineQuery}.
	 *
	 * @param inlineQuery the {@link #inlineQuery} to set.
	 */
	public void setInlineQuery(InlineQuery inlineQuery) {
		this.inlineQuery = inlineQuery;
	}

	/**
	 * Gets the {@link #chosenInlineResult}.
	 *
	 * @return the {@link #chosenInlineResult}.
	 */
	public ChosenInlineResult getChosenInlineResult() {
		return chosenInlineResult;
	}

	/**
	 * Sets the {@link #chosenInlineResult}.
	 *
	 * @param chosenInlineResult the {@link #chosenInlineResult} to set.
	 */
	public void setChosenInlineResult(ChosenInlineResult chosenInlineResult) {
		this.chosenInlineResult = chosenInlineResult;
	}

	/**
	 * Gets the {@link #callbackQuery}.
	 *
	 * @return the {@link #callbackQuery}.
	 */
	public CallbackQuery getCallbackQuery() {
		return callbackQuery;
	}

	/**
	 * Sets the {@link #callbackQuery}.
	 *
	 * @param callbackQuery the {@link #callbackQuery} to set.
	 */
	public void setCallbackQuery(CallbackQuery callbackQuery) {
		this.callbackQuery = callbackQuery;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((channelPost == null) ? 0 : channelPost.hashCode());
		result = prime
				* result
				+ ((editedChannelPost == null) ? 0 : editedChannelPost
						.hashCode());
		result = prime * result
				+ ((editedMessage == null) ? 0 : editedMessage.hashCode());
		result = prime * result + ((message == null) ? 0 : message.hashCode());
		result = prime * result
				+ ((updateId == null) ? 0 : updateId.hashCode());
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
		Update other = (Update) obj;
		if (channelPost == null) {
			if (other.channelPost != null)
				return false;
		} else if (!channelPost.equals(other.channelPost))
			return false;
		if (editedChannelPost == null) {
			if (other.editedChannelPost != null)
				return false;
		} else if (!editedChannelPost.equals(other.editedChannelPost))
			return false;
		if (editedMessage == null) {
			if (other.editedMessage != null)
				return false;
		} else if (!editedMessage.equals(other.editedMessage))
			return false;
		if (message == null) {
			if (other.message != null)
				return false;
		} else if (!message.equals(other.message))
			return false;
		if (updateId == null) {
			if (other.updateId != null)
				return false;
		} else if (!updateId.equals(other.updateId))
			return false;
		return true;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Update [updateId=" + updateId + ", message=" + message
				+ ", editedMessage=" + editedMessage + ", channelPost="
				+ channelPost + ", editedChannelPost=" + editedChannelPost
				+ "]";
	}

}
