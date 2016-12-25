/**
 * 
 */
package co.aurasphere.botmill.telegram.model;

import com.google.gson.annotations.SerializedName;

/**
 * Type of chat, can be either “private”, “group”, “supergroup” or “channel”.
 * 
 * @author Donato Rimenti
 * @date Dec 25, 2016
 */
public enum ChatType {

	/**
	 * The private.
	 */
	@SerializedName("private")
	PRIVATE,

	/**
	 * The group.
	 */
	@SerializedName("group")
	GROUP,

	/**
	 * The supergroup.
	 */
	@SerializedName("supergroup")
	SUPERGROUP,

	/**
	 * The channel.
	 */
	@SerializedName("channel")
	CHANNEL;

}
