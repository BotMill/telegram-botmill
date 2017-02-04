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
package co.aurasphere.botmill.telegram.model.game;

import java.io.Serializable;
import java.util.List;

import co.aurasphere.botmill.telegram.model.MessageEntity;
import co.aurasphere.botmill.telegram.model.PhotoSize;

import com.google.gson.annotations.SerializedName;

/**
 * This object represents a game. Use BotFather to create and edit games, their
 * short names will act as unique identifiers.
 * 
 * @author Donato Rimenti
 * 
 */
public class Game implements Serializable {

	/**
	 * The serial version UID.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Title of the game.
	 */
	private String title;

	/**
	 * Description of the game.
	 */
	private String description;

	/**
	 * Photo that will be displayed in the game message in chats.
	 */
	private List<PhotoSize> photo;

	// TODO: link these javadoc methods
	/**
	 * Optional. Brief description of the game or high scores included in the
	 * game message. Can be automatically edited to include current high scores
	 * for the game when the bot calls setGameScore, or manually edited using
	 * editMessageText. 0-4096 characters.
	 */
	private String text;

	/**
	 * Optional. Special entities that appear in text, such as usernames, URLs,
	 * bot commands, etc.
	 */
	@SerializedName("text_entities")
	private List<MessageEntity> textEntities;

	/**
	 * Optional. Animation that will be displayed in the game message in chats.
	 * Upload via BotFather.
	 */
	private Animation animation;

	/**
	 * Gets the {@link #title}.
	 *
	 * @return the {@link #title}.
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * Sets the {@link #title}.
	 *
	 * @param title the {@link #title} to set.
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * Gets the {@link #description}.
	 *
	 * @return the {@link #description}.
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * Sets the {@link #description}.
	 *
	 * @param description the {@link #description} to set.
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * Gets the {@link #photo}.
	 *
	 * @return the {@link #photo}.
	 */
	public List<PhotoSize> getPhoto() {
		return photo;
	}

	/**
	 * Sets the {@link #photo}.
	 *
	 * @param photo the {@link #photo} to set.
	 */
	public void setPhoto(List<PhotoSize> photo) {
		this.photo = photo;
	}

	/**
	 * Gets the {@link #text}.
	 *
	 * @return the {@link #text}.
	 */
	public String getText() {
		return text;
	}

	/**
	 * Sets the {@link #text}.
	 *
	 * @param text the {@link #text} to set.
	 */
	public void setText(String text) {
		this.text = text;
	}

	/**
	 * Gets the {@link #textEntities}.
	 *
	 * @return the {@link #textEntities}.
	 */
	public List<MessageEntity> getTextEntities() {
		return textEntities;
	}

	/**
	 * Sets the {@link #textEntities}.
	 *
	 * @param textEntities the {@link #textEntities} to set.
	 */
	public void setTextEntities(List<MessageEntity> textEntities) {
		this.textEntities = textEntities;
	}

	/**
	 * Gets the {@link #animation}.
	 *
	 * @return the {@link #animation}.
	 */
	public Animation getAnimation() {
		return animation;
	}

	/**
	 * Sets the {@link #animation}.
	 *
	 * @param animation the {@link #animation} to set.
	 */
	public void setAnimation(Animation animation) {
		this.animation = animation;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((description == null) ? 0 : description.hashCode());
		result = prime * result + ((photo == null) ? 0 : photo.hashCode());
		result = prime * result + ((text == null) ? 0 : text.hashCode());
		result = prime * result
				+ ((textEntities == null) ? 0 : textEntities.hashCode());
		result = prime * result + ((title == null) ? 0 : title.hashCode());
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
		Game other = (Game) obj;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (photo == null) {
			if (other.photo != null)
				return false;
		} else if (!photo.equals(other.photo))
			return false;
		if (text == null) {
			if (other.text != null)
				return false;
		} else if (!text.equals(other.text))
			return false;
		if (textEntities == null) {
			if (other.textEntities != null)
				return false;
		} else if (!textEntities.equals(other.textEntities))
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Game [title=" + title + ", description=" + description
				+ ", photo=" + photo + ", text=" + text + ", textEntities="
				+ textEntities + "]";
	}

}
