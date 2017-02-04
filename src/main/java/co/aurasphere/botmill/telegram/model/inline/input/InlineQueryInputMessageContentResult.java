package co.aurasphere.botmill.telegram.model.inline.input;

import co.aurasphere.botmill.telegram.model.inline.InlineQueryResult;
import co.aurasphere.botmill.telegram.model.inline.InlineQueryResultType;

import com.google.gson.annotations.SerializedName;

/**
 * This object represents one result of an inline query.
 * 
 * @author Donato Rimenti
 * 
 */
public abstract class InlineQueryInputMessageContentResult extends
		InlineQueryResult {

	/**
	 * The serial version UID.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Content of the message to be sent.
	 */
	@SerializedName("input_message_content")
	protected InputMessageContent inputMessageContent;

	/**
	 * Instantiates a new InlineQueryInputMessageContentResult.
	 *
	 * @param type
	 *            the {@link InlineQueryResult#type}.
	 */
	public InlineQueryInputMessageContentResult(InlineQueryResultType type) {
		super(type);
	}

	/**
	 * Gets the {@link #inputMessageContent}.
	 *
	 * @return the {@link #inputMessageContent}.
	 */
	public InputMessageContent getInputMessageContent() {
		return inputMessageContent;
	}

	/**
	 * Sets the {@link #inputMessageContent}.
	 *
	 * @param inputMessageContent
	 *            the {@link #inputMessageContent} to set.
	 */
	public void setInputMessageContent(InputMessageContent inputMessageContent) {
		this.inputMessageContent = inputMessageContent;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * co.aurasphere.botmill.telegram.model.inline.InlineQueryResult#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime
				* result
				+ ((inputMessageContent == null) ? 0 : inputMessageContent
						.hashCode());
		return result;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * co.aurasphere.botmill.telegram.model.inline.InlineQueryResult#equals(
	 * java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		InlineQueryInputMessageContentResult other = (InlineQueryInputMessageContentResult) obj;
		if (inputMessageContent != other.inputMessageContent)
			return false;
		return true;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * co.aurasphere.botmill.telegram.model.inline.InlineQueryResult#toString()
	 */
	@Override
	public String toString() {
		return "InlineQueryInputMessageContentResult [inputMessageContent="
				+ inputMessageContent + ", type=" + type + ", id=" + id + "]";
	}

}
