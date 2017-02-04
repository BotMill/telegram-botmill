package co.aurasphere.botmill.telegram.model;

import java.io.Serializable;
import java.util.Arrays;

import com.google.gson.annotations.SerializedName;

/**
 * This object represents an inline keyboard that appears right next to the
 * message it belongs to.<br/>
 * <br
 * / Note: This will only work in Telegram versions released after 9 April,
 * 2016. Older clients will display unsupported message.
 * 
 * @see <a
 *      href="https://core.telegram.org/bots#inline-keyboards-and-on-the-fly-updating">Inline
 *      Keyboard</a>.
 * 
 * @author Donato Rimenti
 * 
 */
public class InlineKeyboardMarkup implements Serializable {

	/**
	 * The serial version UID.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Array of button rows, each represented by an Array of
	 * InlineKeyboardButton objects.
	 */
	@SerializedName("inline_keyboard")
	private InlineKeyboardButton[][] inlineKeyboard;

	/**
	 * Gets the {@link #inlineKeyboard}.
	 *
	 * @return the {@link #inlineKeyboard}.
	 */
	public InlineKeyboardButton[][] getInlineKeyboard() {
		return inlineKeyboard;
	}

	/**
	 * Sets the {@link #inlineKeyboard}.
	 *
	 * @param inlineKeyboard
	 *            the {@link #inlineKeyboard} to set.
	 */
	public void setInlineKeyboard(InlineKeyboardButton[][] inlineKeyboard) {
		this.inlineKeyboard = inlineKeyboard;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(inlineKeyboard);
		return result;
	}

	/*
	 * (non-Javadoc)
	 * 
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
		InlineKeyboardMarkup other = (InlineKeyboardMarkup) obj;
		if (!Arrays.deepEquals(inlineKeyboard, other.inlineKeyboard))
			return false;
		return true;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "InlineKeyboardMarkup [inlineKeyboard="
				+ Arrays.toString(inlineKeyboard) + "]";
	}

}
