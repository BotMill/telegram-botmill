package co.aurasphere.botmill.telegram.model.inline.input;

import java.io.Serializable;

/**
 * This object represents the content of a message to be sent as a result of an
 * inline query.
 * 
 * @author Donato Rimenti
 * 
 */
public abstract class InputMessageContent implements Serializable {

	/**
	 * The serial version UID.
	 */
	private static final long serialVersionUID = 1L;

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "InputMessageContent []";
	}

}
