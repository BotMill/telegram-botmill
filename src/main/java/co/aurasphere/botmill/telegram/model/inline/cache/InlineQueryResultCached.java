package co.aurasphere.botmill.telegram.model.inline.cache;

import co.aurasphere.botmill.telegram.model.inline.InlineQueryResult;
import co.aurasphere.botmill.telegram.model.inline.InlineQueryResultType;
import co.aurasphere.botmill.telegram.model.inline.input.InlineQueryInputMessageContentResult;

/**
 * Represents a link to something stored on the Telegram servers.
 * 
 * @author Donato Rimenti
 * 
 */
public class InlineQueryResultCached extends
		InlineQueryInputMessageContentResult {

	/**
	 * The serial version UID.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Instantiates a new InlineQueryResultCached.
	 *
	 * @param type
	 *            the {@link InlineQueryResult#type}.
	 */
	public InlineQueryResultCached(InlineQueryResultType type) {
		super(type);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see co.aurasphere.botmill.telegram.model.inline.
	 * InlineQueryInputMessageContentResult#toString()
	 */
	@Override
	public String toString() {
		return "InlineQueryResultCached [inputMessageContent="
				+ inputMessageContent + ", type=" + type + ", id=" + id + "]";
	}

}
