package co.aurasphere.botmill.telegram.model.game;

import java.io.Serializable;

import co.aurasphere.botmill.telegram.model.User;

/**
 * This object represents one row of the high scores table for a game.
 * 
 * @author Donato Rimenti
 * 
 */
public class GameHighScore implements Serializable {

	/**
	 * The serial version UID.
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * Position in high score table for the game.
	 */
	private int position;
	
	/**
	 * User.
	 */
	private User user;
	
	/**
	 * Score.
	 */
	private int score;

	/**
	 * Gets the {@link #position}.
	 *
	 * @return the {@link #position}.
	 */
	public int getPosition() {
		return position;
	}

	/**
	 * Sets the {@link #position}.
	 *
	 * @param position the {@link #position} to set.
	 */
	public void setPosition(int position) {
		this.position = position;
	}

	/**
	 * Gets the {@link #user}.
	 *
	 * @return the {@link #user}.
	 */
	public User getUser() {
		return user;
	}

	/**
	 * Sets the {@link #user}.
	 *
	 * @param user the {@link #user} to set.
	 */
	public void setUser(User user) {
		this.user = user;
	}

	/**
	 * Gets the {@link #score}.
	 *
	 * @return the {@link #score}.
	 */
	public int getScore() {
		return score;
	}

	/**
	 * Sets the {@link #score}.
	 *
	 * @param score the {@link #score} to set.
	 */
	public void setScore(int score) {
		this.score = score;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + position;
		result = prime * result + score;
		result = prime * result + ((user == null) ? 0 : user.hashCode());
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
		GameHighScore other = (GameHighScore) obj;
		if (position != other.position)
			return false;
		if (score != other.score)
			return false;
		if (user == null) {
			if (other.user != null)
				return false;
		} else if (!user.equals(other.user))
			return false;
		return true;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "GameHighScore [position=" + position + ", user=" + user
				+ ", score=" + score + "]";
	}
}
