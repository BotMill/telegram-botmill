package co.aurasphere.botmill.telegram.model.inline;

import co.aurasphere.botmill.telegram.model.inline.input.InlineQueryInputMessageContentResult;

/**
 * Type of the {@link InlineQueryInputMessageContentResult}.
 * 
 * @author Donato Rimenti
 * @date Dec 25, 2016
 */
public enum InlineQueryResultType {
	
	/**
	 * The article.
	 */
	ARTICLE, 
	
	/**
	 * The photo.
	 */
	PHOTO, 
	
	/**
	 * The gif.
	 */
	GIF, 
	
	/**
	 * The mpeg4 gif.
	 */
	MPEG4_GIF, 
	
	/**
	 * The video.
	 */
	VIDEO, 
	
	/**
	 * The audio.
	 */
	AUDIO, 
	
	/**
	 * The voice.
	 */
	VOICE, 
	
	/**
	 * The document.
	 */
	DOCUMENT, 
	
	/**
	 * The location.
	 */
	LOCATION, 
	
	/**
	 * The venue.
	 */
	VENUE, 
	
	/**
	 * The contact.
	 */
	CONTACT, 
	
	/**
	 * The game.
	 */
	GAME, 
	
	/**
	 * The sticker.
	 */
	STICKER;

}
