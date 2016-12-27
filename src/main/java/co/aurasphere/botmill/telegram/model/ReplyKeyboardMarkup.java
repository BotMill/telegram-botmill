package co.aurasphere.botmill.telegram.model;

import java.io.Serializable;

import com.google.gson.annotations.SerializedName;

/**
 * This object represents a custom keyboard with reply options.
 * 
 * @see <a href="https://core.telegram.org/bots#keyboards">Introduction to bots
 *      with details and examples</a>.
 * 
 * @author Donato Rimenti
 * @date Dec 25, 2016
 */
public class ReplyKeyboardMarkup implements Serializable {

	/**
	 * The serial version UID.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Array of button rows, each represented by an Array of KeyboardButton
	 * objects.
	 */
	private KeyboardButton[][] keyboard;

	/**
	 * Optional. Requests clients to resize the keyboard vertically for optimal
	 * fit (e.g., make the keyboard smaller if there are just two rows of
	 * buttons). Defaults to false, in which case the custom keyboard is always
	 * of the same height as the app's standard keyboard.
	 */
	@SerializedName("resize_keyboard")
	private boolean resizeKeyboard;

	/**
	 * Optional. Requests clients to hide the keyboard as soon as it's been
	 * used. The keyboard will still be available, but clients will
	 * automatically display the usual letter-keyboard in the chat – the user
	 * can press a special button in the input field to see the custom keyboard
	 * again. Defaults to false.
	 */
	@SerializedName("one_time_keyboard")
	private boolean oneTimeKeyboard;

	/**
	 * Optional. Use this parameter if you want to show the keyboard to specific
	 * users only. Targets: 1) users that are @mentioned in the text of the
	 * Message object; 2) if the bot's message is a reply (has
	 * reply_to_message_id), sender of the original message. <br/>
	 * <br/>
	 * Example: A user requests to change the bot‘s language, bot replies to the
	 * request with a keyboard to select the new language. Other users in the
	 * group don’t see the keyboard.
	 */
	private boolean selective;

	/**
	 * Gets the {@link #keyboard}.
	 *
	 * @return the {@link #keyboard}.
	 */
	public KeyboardButton[][] getKeyboard() {
		return keyboard;
	}

	/**
	 * Sets the {@link #keyboard}.
	 *
	 * @param keyboard the {@link #keyboard} to set.
	 */
	public void setKeyboard(KeyboardButton[][] keyboard) {
		this.keyboard = keyboard;
	}

	/**
	 * Gets the {@link #resizeKeyboard}.
	 *
	 * @return the {@link #resizeKeyboard}.
	 */
	public boolean isResizeKeyboard() {
		return resizeKeyboard;
	}

	/**
	 * Sets the {@link #resizeKeyboard}.
	 *
	 * @param resizeKeyboard the {@link #resizeKeyboard} to set.
	 */
	public void setResizeKeyboard(boolean resizeKeyboard) {
		this.resizeKeyboard = resizeKeyboard;
	}

	/**
	 * Gets the {@link #oneTimeKeyboard}.
	 *
	 * @return the {@link #oneTimeKeyboard}.
	 */
	public boolean isOneTimeKeyboard() {
		return oneTimeKeyboard;
	}

	/**
	 * Sets the {@link #oneTimeKeyboard}.
	 *
	 * @param oneTimeKeyboard the {@link #oneTimeKeyboard} to set.
	 */
	public void setOneTimeKeyboard(boolean oneTimeKeyboard) {
		this.oneTimeKeyboard = oneTimeKeyboard;
	}

	/**
	 * Gets the {@link #selective}.
	 *
	 * @return the {@link #selective}.
	 */
	public boolean isSelective() {
		return selective;
	}

	/**
	 * Sets the {@link #selective}.
	 *
	 * @param selective the {@link #selective} to set.
	 */
	public void setSelective(boolean selective) {
		this.selective = selective;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (oneTimeKeyboard ? 1231 : 1237);
		result = prime * result + (resizeKeyboard ? 1231 : 1237);
		result = prime * result + (selective ? 1231 : 1237);
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
		ReplyKeyboardMarkup other = (ReplyKeyboardMarkup) obj;
		if (oneTimeKeyboard != other.oneTimeKeyboard)
			return false;
		if (resizeKeyboard != other.resizeKeyboard)
			return false;
		if (selective != other.selective)
			return false;
		return true;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "ReplyKeyboardMarkup [resizeKeyboard=" + resizeKeyboard
				+ ", oneTimeKeyboard=" + oneTimeKeyboard + ", selective="
				+ selective + "]";
	}

}
