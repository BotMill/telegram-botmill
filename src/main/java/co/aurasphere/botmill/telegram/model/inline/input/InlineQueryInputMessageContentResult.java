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
