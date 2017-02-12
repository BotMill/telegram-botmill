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
package co.aurasphere.botmill.telegram.model.inline;

import com.google.gson.annotations.SerializedName;

/**
 * Represents a <a href="https://core.telegram.org/bots/api#games">Game</a>.<br/>
 * <br/>
 * Note: This will only work in Telegram versions released after October 1,
 * 2016. Older clients will not display any inline results if a game result is
 * among them.
 * 
 * @author Donato Rimenti
 * 
 */
public class InlineQueryResultGame extends InlineQueryResult {

	/**
	 * The serial version UID.
	 */
	private static final long serialVersionUID = 1L;

	// TODO: javadoc
	@SerializedName("game_short_name")
	private String gameShortName;

	/**
	 * Instantiates a new InlineQueryResultGame.
	 *
	 * @param type
	 *            the {@link #type}.
	 */
	public InlineQueryResultGame(InlineQueryResultType type) {
		super(InlineQueryResultType.GAME);
	}

	/**
	 * Gets the {@link #gameShortName}.
	 *
	 * @return the {@link #gameShortName}.
	 */
	public String getGameShortName() {
		return gameShortName;
	}

	/**
	 * Sets the {@link #gameShortName}.
	 *
	 * @param gameShortName
	 *            the {@link #gameShortName} to set.
	 */
	public void setGameShortName(String gameShortName) {
		this.gameShortName = gameShortName;
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
		result = prime * result
				+ ((gameShortName == null) ? 0 : gameShortName.hashCode());
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
		InlineQueryResultGame other = (InlineQueryResultGame) obj;
		if (gameShortName == null) {
			if (other.gameShortName != null)
				return false;
		} else if (!gameShortName.equals(other.gameShortName))
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
		return "InlineQueryResultGame [gameShortName=" + gameShortName
				+ ", type=" + type + ", id=" + id + "]";
	}

}
