package co.aurasphere.botmill.telegram.model;

import com.google.gson.annotations.SerializedName;

/**
 * The member's status in the chat. Can be “creator”, “administrator”, “member”,
 * “left” or “kicked”.
 * 
 * @author Donato Rimenti
 * 
 */
public enum ChatMemberStatus {
	
	/**
	 * The creator.
	 */
	@SerializedName("creator")
	CREATOR,
	
	/**
	 * The administrator.
	 */
	@SerializedName("administrator")
	ADMINISTRATOR,
	
	/**
	 * The member.
	 */
	@SerializedName("member")
	MEMBER,
	
	/**
	 * The left.
	 */
	@SerializedName("left")
	LEFT,
	
	/**
	 * The kicked.
	 */
	@SerializedName("kicked")
	KICKED;

}
