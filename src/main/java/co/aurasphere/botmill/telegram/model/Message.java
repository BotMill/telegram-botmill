/**
 * 
 */
package co.aurasphere.botmill.telegram.model;

import java.io.Serializable;
import java.util.Calendar;
import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;

import co.aurasphere.botmill.telegram.model.game.Game;

import com.google.gson.annotations.SerializedName;

/**
 * This object represents a message.
 * 
 * @author Donato Rimenti
 * 
 */
public class Message implements Serializable {

	/**
	 * The serial version UID.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Unique message identifier inside this chat.
	 */
	@NotBlank
	@SerializedName("message_id")
	private String messageId;

	/**
	 * Optional. Sender, can be empty for messages sent to channels.
	 */
	@Valid
	private User from;

	/**
	 * Date the message was sent in Unix time.
	 */
	// TODO: Check deserialization from integer (use facebot deserializer).
	@NotNull
	private Calendar date;

	/**
	 * Conversation the message belongs to.
	 */
	@Valid
	@NotBlank
	private Chat chat;

	/**
	 * Optional. For forwarded messages, sender of the original message.
	 */
	@Valid
	@SerializedName("forward_from")
	private User forwardFrom;

	/**
	 * Optional. For messages forwarded from a channel, information about the
	 * original channel.
	 */
	@Valid
	@SerializedName("forward_from_chat")
	private Chat forwardFromChat;

	/**
	 * Optional. For forwarded channel posts, identifier of the original message
	 * in the channel.
	 */
	@SerializedName("forward_from_message_id")
	private String forwardFromMessageId;

	/**
	 * Optional. For forwarded messages, date the original message was sent in
	 * Unix time.
	 */
	// TODO: Check deserialization from integer (use facebot deserializer).
	@SerializedName("forward_date")
	private Calendar forwardDate;

	/**
	 * Optional. For replies, the original message. Note that the Message object
	 * in this field will not contain further reply_to_message fields even if it
	 * itself is a reply.
	 */
	@Valid
	@SerializedName("reply_to_message")
	private Message replyToMessage;

	/**
	 * Optional. Date the message was last edited in Unix time.
	 */
	// TODO: Check deserialization from integer (use facebot deserializer).
	@SerializedName("edit_date")
	private Calendar editDate;

	/**
	 * Optional. For text messages, the actual UTF-8 text of the message, 0-4096
	 * characters.
	 */
	private String text;

	/**
	 * Optional. For text messages, special entities like usernames, URLs, bot
	 * commands, etc. that appear in the text.
	 */
	@Valid
	private List<MessageEntity> entities;

	/**
	 * Optional. Message is an audio file, information about the file.
	 */
	@Valid
	private Audio audio;

	/**
	 * Optional. Message is a general file, information about the file.
	 */
	@Valid
	private Document document;

	/**
	 * Optional. Message is a game, information about the game.
	 * 
	 * @see <a href="https://core.telegram.org/bots/api#games">More about
	 *      games</a>
	 */
	@Valid
	private Game game;

	/**
	 * Optional. Message is a photo, available sizes of the photo.
	 */
	@Valid
	private List<PhotoSize> photo;

	/**
	 * Optional. Message is a sticker, information about the sticker.
	 */
	@Valid
	private Sticker sticker;

	/**
	 * Optional. Message is a video, information about the video.
	 */
	@Valid
	private Video video;

	/**
	 * Optional. Message is a voice message, information about the file.
	 */
	@Valid
	private Voice voice;

	/**
	 * Optional. Caption for the document, photo or video, 0-200 characters.
	 */
	private String caption;

	/**
	 * Optional. Message is a shared contact, information about the contact.
	 */
	@Valid
	private Contact contact;

	/**
	 * Optional. Message is a shared location, information about the location.
	 */
	@Valid
	private Location location;

	/**
	 * Optional. Message is a venue, information about the venue.
	 */
	@Valid
	private Venue venue;

	/**
	 * Optional. A new member was added to the group, information about them
	 * (this member may be the bot itself).
	 */
	@Valid
	@SerializedName("new_chat_member")
	private User newChatMember;

	/**
	 * Optional. A new member was added to the group, information about them
	 * (this member may be the bot itself).
	 */
	@Valid
	@SerializedName("left_chat_member")
	private User leftChatMember;

	/**
	 * Optional. A chat title was changed to this value.
	 */
	@SerializedName("new_chat_title")
	private String newChatTitle;

	/**
	 * Optional. A chat photo was change to this value.
	 */
	@Valid
	@SerializedName("new_chat_photo")
	private List<PhotoSize> newChatPhoto;

	/**
	 * Optional. A chat photo was change to this value.
	 */
	@SerializedName("delete_chat_photo")
	private boolean deleteChatPhoto;

	/**
	 * Optional. Service message: the group has been created.
	 */
	@SerializedName("group_chat_created")
	private boolean groupChatCreated;

	/**
	 * Optional. Service message: the supergroup has been created. This field
	 * can‘t be received in a message coming through updates, because bot can’t
	 * be a member of a supergroup when it is created. It can only be found in
	 * reply_to_message if someone replies to a very first message in a directly
	 * created supergroup.
	 */
	@SerializedName("supergroup_chat_created")
	private boolean supergroupChatCreated;

	/**
	 * Optional. Service message: the channel has been created. This field can‘t
	 * be received in a message coming through updates, because bot can’t be a
	 * member of a channel when it is created. It can only be found in
	 * reply_to_message if someone replies to a very first message in a channel.
	 */
	@SerializedName("channel_chat_created")
	private boolean channelChatCreated;

	/**
	 * Optional. The group has been migrated to a supergroup with the specified
	 * identifier. This number may be greater than 32 bits and some programming
	 * languages may have difficulty/silent defects in interpreting it. But it
	 * smaller than 52 bits, so a signed 64 bit integer or double-precision
	 * float type are safe for storing this identifier.
	 */
	@SerializedName("migrate_to_chat_id")
	private String migrateToChatId;

	/**
	 * Optional. The supergroup has been migrated from a group with the
	 * specified identifier. This number may be greater than 32 bits and some
	 * programming languages may have difficulty/silent defects in interpreting
	 * it. But it smaller than 52 bits, so a signed 64 bit integer or
	 * double-precision float type are safe for storing this identifier.
	 */
	@SerializedName("migrate_from_chat_id")
	private String migrateFromChatId;

	/**
	 * Optional. The supergroup has been migrated from a group with the
	 * specified identifier. This number may be greater than 32 bits and some
	 * programming languages may have difficulty/silent defects in interpreting
	 * it. But it smaller than 52 bits, so a signed 64 bit integer or
	 * double-precision float type are safe for storing this identifier.
	 */
	// TODO: this javadoc is wrong. fix it
	@Valid
	@SerializedName("pinned_message")
	private Message pinnedMessage;

	/**
	 * Gets the {@link #messageId}.
	 *
	 * @return the {@link #messageId}.
	 */
	public String getMessageId() {
		return messageId;
	}

	/**
	 * Sets the {@link #messageId}.
	 *
	 * @param messageId the {@link #messageId} to set.
	 */
	public void setMessageId(String messageId) {
		this.messageId = messageId;
	}

	/**
	 * Gets the {@link #from}.
	 *
	 * @return the {@link #from}.
	 */
	public User getFrom() {
		return from;
	}

	/**
	 * Sets the {@link #from}.
	 *
	 * @param from the {@link #from} to set.
	 */
	public void setFrom(User from) {
		this.from = from;
	}

	/**
	 * Gets the {@link #date}.
	 *
	 * @return the {@link #date}.
	 */
	public Calendar getDate() {
		return date;
	}

	/**
	 * Sets the {@link #date}.
	 *
	 * @param date the {@link #date} to set.
	 */
	public void setDate(Calendar date) {
		this.date = date;
	}

	/**
	 * Gets the {@link #chat}.
	 *
	 * @return the {@link #chat}.
	 */
	public Chat getChat() {
		return chat;
	}

	/**
	 * Sets the {@link #chat}.
	 *
	 * @param chat the {@link #chat} to set.
	 */
	public void setChat(Chat chat) {
		this.chat = chat;
	}

	/**
	 * Gets the {@link #forwardFrom}.
	 *
	 * @return the {@link #forwardFrom}.
	 */
	public User getForwardFrom() {
		return forwardFrom;
	}

	/**
	 * Sets the {@link #forwardFrom}.
	 *
	 * @param forwardFrom the {@link #forwardFrom} to set.
	 */
	public void setForwardFrom(User forwardFrom) {
		this.forwardFrom = forwardFrom;
	}

	/**
	 * Gets the {@link #forwardFromChat}.
	 *
	 * @return the {@link #forwardFromChat}.
	 */
	public Chat getForwardFromChat() {
		return forwardFromChat;
	}

	/**
	 * Sets the {@link #forwardFromChat}.
	 *
	 * @param forwardFromChat the {@link #forwardFromChat} to set.
	 */
	public void setForwardFromChat(Chat forwardFromChat) {
		this.forwardFromChat = forwardFromChat;
	}

	/**
	 * Gets the {@link #forwardFromMessageId}.
	 *
	 * @return the {@link #forwardFromMessageId}.
	 */
	public String getForwardFromMessageId() {
		return forwardFromMessageId;
	}

	/**
	 * Sets the {@link #forwardFromMessageId}.
	 *
	 * @param forwardFromMessageId the {@link #forwardFromMessageId} to set.
	 */
	public void setForwardFromMessageId(String forwardFromMessageId) {
		this.forwardFromMessageId = forwardFromMessageId;
	}

	/**
	 * Gets the {@link #forwardDate}.
	 *
	 * @return the {@link #forwardDate}.
	 */
	public Calendar getForwardDate() {
		return forwardDate;
	}

	/**
	 * Sets the {@link #forwardDate}.
	 *
	 * @param forwardDate the {@link #forwardDate} to set.
	 */
	public void setForwardDate(Calendar forwardDate) {
		this.forwardDate = forwardDate;
	}

	/**
	 * Gets the {@link #replyToMessage}.
	 *
	 * @return the {@link #replyToMessage}.
	 */
	public Message getReplyToMessage() {
		return replyToMessage;
	}

	/**
	 * Sets the {@link #replyToMessage}.
	 *
	 * @param replyToMessage the {@link #replyToMessage} to set.
	 */
	public void setReplyToMessage(Message replyToMessage) {
		this.replyToMessage = replyToMessage;
	}

	/**
	 * Gets the {@link #editDate}.
	 *
	 * @return the {@link #editDate}.
	 */
	public Calendar getEditDate() {
		return editDate;
	}

	/**
	 * Sets the {@link #editDate}.
	 *
	 * @param editDate the {@link #editDate} to set.
	 */
	public void setEditDate(Calendar editDate) {
		this.editDate = editDate;
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
	 * Gets the {@link #entities}.
	 *
	 * @return the {@link #entities}.
	 */
	public List<MessageEntity> getEntities() {
		return entities;
	}

	/**
	 * Sets the {@link #entities}.
	 *
	 * @param entities the {@link #entities} to set.
	 */
	public void setEntities(List<MessageEntity> entities) {
		this.entities = entities;
	}

	/**
	 * Gets the {@link #audio}.
	 *
	 * @return the {@link #audio}.
	 */
	public Audio getAudio() {
		return audio;
	}

	/**
	 * Sets the {@link #audio}.
	 *
	 * @param audio the {@link #audio} to set.
	 */
	public void setAudio(Audio audio) {
		this.audio = audio;
	}

	/**
	 * Gets the {@link #document}.
	 *
	 * @return the {@link #document}.
	 */
	public Document getDocument() {
		return document;
	}

	/**
	 * Sets the {@link #document}.
	 *
	 * @param document the {@link #document} to set.
	 */
	public void setDocument(Document document) {
		this.document = document;
	}

	/**
	 * Gets the {@link #game}.
	 *
	 * @return the {@link #game}.
	 */
	public Game getGame() {
		return game;
	}

	/**
	 * Sets the {@link #game}.
	 *
	 * @param game the {@link #game} to set.
	 */
	public void setGame(Game game) {
		this.game = game;
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
	 * Gets the {@link #sticker}.
	 *
	 * @return the {@link #sticker}.
	 */
	public Sticker getSticker() {
		return sticker;
	}

	/**
	 * Sets the {@link #sticker}.
	 *
	 * @param sticker the {@link #sticker} to set.
	 */
	public void setSticker(Sticker sticker) {
		this.sticker = sticker;
	}

	/**
	 * Gets the {@link #video}.
	 *
	 * @return the {@link #video}.
	 */
	public Video getVideo() {
		return video;
	}

	/**
	 * Sets the {@link #video}.
	 *
	 * @param video the {@link #video} to set.
	 */
	public void setVideo(Video video) {
		this.video = video;
	}

	/**
	 * Gets the {@link #voice}.
	 *
	 * @return the {@link #voice}.
	 */
	public Voice getVoice() {
		return voice;
	}

	/**
	 * Sets the {@link #voice}.
	 *
	 * @param voice the {@link #voice} to set.
	 */
	public void setVoice(Voice voice) {
		this.voice = voice;
	}

	/**
	 * Gets the {@link #caption}.
	 *
	 * @return the {@link #caption}.
	 */
	public String getCaption() {
		return caption;
	}

	/**
	 * Sets the {@link #caption}.
	 *
	 * @param caption the {@link #caption} to set.
	 */
	public void setCaption(String caption) {
		this.caption = caption;
	}

	/**
	 * Gets the {@link #contact}.
	 *
	 * @return the {@link #contact}.
	 */
	public Contact getContact() {
		return contact;
	}

	/**
	 * Sets the {@link #contact}.
	 *
	 * @param contact the {@link #contact} to set.
	 */
	public void setContact(Contact contact) {
		this.contact = contact;
	}

	/**
	 * Gets the {@link #location}.
	 *
	 * @return the {@link #location}.
	 */
	public Location getLocation() {
		return location;
	}

	/**
	 * Sets the {@link #location}.
	 *
	 * @param location the {@link #location} to set.
	 */
	public void setLocation(Location location) {
		this.location = location;
	}

	/**
	 * Gets the {@link #venue}.
	 *
	 * @return the {@link #venue}.
	 */
	public Venue getVenue() {
		return venue;
	}

	/**
	 * Sets the {@link #venue}.
	 *
	 * @param venue the {@link #venue} to set.
	 */
	public void setVenue(Venue venue) {
		this.venue = venue;
	}

	/**
	 * Gets the {@link #newChatMember}.
	 *
	 * @return the {@link #newChatMember}.
	 */
	public User getNewChatMember() {
		return newChatMember;
	}

	/**
	 * Sets the {@link #newChatMember}.
	 *
	 * @param newChatMember the {@link #newChatMember} to set.
	 */
	public void setNewChatMember(User newChatMember) {
		this.newChatMember = newChatMember;
	}

	/**
	 * Gets the {@link #leftChatMember}.
	 *
	 * @return the {@link #leftChatMember}.
	 */
	public User getLeftChatMember() {
		return leftChatMember;
	}

	/**
	 * Sets the {@link #leftChatMember}.
	 *
	 * @param leftChatMember the {@link #leftChatMember} to set.
	 */
	public void setLeftChatMember(User leftChatMember) {
		this.leftChatMember = leftChatMember;
	}

	/**
	 * Gets the {@link #newChatTitle}.
	 *
	 * @return the {@link #newChatTitle}.
	 */
	public String getNewChatTitle() {
		return newChatTitle;
	}

	/**
	 * Sets the {@link #newChatTitle}.
	 *
	 * @param newChatTitle the {@link #newChatTitle} to set.
	 */
	public void setNewChatTitle(String newChatTitle) {
		this.newChatTitle = newChatTitle;
	}

	/**
	 * Gets the {@link #newChatPhoto}.
	 *
	 * @return the {@link #newChatPhoto}.
	 */
	public List<PhotoSize> getNewChatPhoto() {
		return newChatPhoto;
	}

	/**
	 * Sets the {@link #newChatPhoto}.
	 *
	 * @param newChatPhoto the {@link #newChatPhoto} to set.
	 */
	public void setNewChatPhoto(List<PhotoSize> newChatPhoto) {
		this.newChatPhoto = newChatPhoto;
	}

	/**
	 * Gets the {@link #deleteChatPhoto}.
	 *
	 * @return the {@link #deleteChatPhoto}.
	 */
	public boolean isDeleteChatPhoto() {
		return deleteChatPhoto;
	}

	/**
	 * Sets the {@link #deleteChatPhoto}.
	 *
	 * @param deleteChatPhoto the {@link #deleteChatPhoto} to set.
	 */
	public void setDeleteChatPhoto(boolean deleteChatPhoto) {
		this.deleteChatPhoto = deleteChatPhoto;
	}

	/**
	 * Gets the {@link #groupChatCreated}.
	 *
	 * @return the {@link #groupChatCreated}.
	 */
	public boolean isGroupChatCreated() {
		return groupChatCreated;
	}

	/**
	 * Sets the {@link #groupChatCreated}.
	 *
	 * @param groupChatCreated the {@link #groupChatCreated} to set.
	 */
	public void setGroupChatCreated(boolean groupChatCreated) {
		this.groupChatCreated = groupChatCreated;
	}

	/**
	 * Gets the {@link #supergroupChatCreated}.
	 *
	 * @return the {@link #supergroupChatCreated}.
	 */
	public boolean isSupergroupChatCreated() {
		return supergroupChatCreated;
	}

	/**
	 * Sets the {@link #supergroupChatCreated}.
	 *
	 * @param supergroupChatCreated the {@link #supergroupChatCreated} to set.
	 */
	public void setSupergroupChatCreated(boolean supergroupChatCreated) {
		this.supergroupChatCreated = supergroupChatCreated;
	}

	/**
	 * Gets the {@link #channelChatCreated}.
	 *
	 * @return the {@link #channelChatCreated}.
	 */
	public boolean isChannelChatCreated() {
		return channelChatCreated;
	}

	/**
	 * Sets the {@link #channelChatCreated}.
	 *
	 * @param channelChatCreated the {@link #channelChatCreated} to set.
	 */
	public void setChannelChatCreated(boolean channelChatCreated) {
		this.channelChatCreated = channelChatCreated;
	}

	/**
	 * Gets the {@link #migrateToChatId}.
	 *
	 * @return the {@link #migrateToChatId}.
	 */
	public String getMigrateToChatId() {
		return migrateToChatId;
	}

	/**
	 * Sets the {@link #migrateToChatId}.
	 *
	 * @param migrateToChatId the {@link #migrateToChatId} to set.
	 */
	public void setMigrateToChatId(String migrateToChatId) {
		this.migrateToChatId = migrateToChatId;
	}

	/**
	 * Gets the {@link #migrateFromChatId}.
	 *
	 * @return the {@link #migrateFromChatId}.
	 */
	public String getMigrateFromChatId() {
		return migrateFromChatId;
	}

	/**
	 * Sets the {@link #migrateFromChatId}.
	 *
	 * @param migrateFromChatId the {@link #migrateFromChatId} to set.
	 */
	public void setMigrateFromChatId(String migrateFromChatId) {
		this.migrateFromChatId = migrateFromChatId;
	}

	/**
	 * Gets the {@link #pinnedMessage}.
	 *
	 * @return the {@link #pinnedMessage}.
	 */
	public Message getPinnedMessage() {
		return pinnedMessage;
	}

	/**
	 * Sets the {@link #pinnedMessage}.
	 *
	 * @param pinnedMessage the {@link #pinnedMessage} to set.
	 */
	public void setPinnedMessage(Message pinnedMessage) {
		this.pinnedMessage = pinnedMessage;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((caption == null) ? 0 : caption.hashCode());
		result = prime * result + (channelChatCreated ? 1231 : 1237);
		result = prime * result + ((chat == null) ? 0 : chat.hashCode());
		result = prime * result + ((date == null) ? 0 : date.hashCode());
		result = prime * result + (deleteChatPhoto ? 1231 : 1237);
		result = prime * result
				+ ((editDate == null) ? 0 : editDate.hashCode());
		result = prime * result
				+ ((forwardDate == null) ? 0 : forwardDate.hashCode());
		result = prime * result
				+ ((forwardFrom == null) ? 0 : forwardFrom.hashCode());
		result = prime * result
				+ ((forwardFromChat == null) ? 0 : forwardFromChat.hashCode());
		result = prime
				* result
				+ ((forwardFromMessageId == null) ? 0 : forwardFromMessageId
						.hashCode());
		result = prime * result + ((from == null) ? 0 : from.hashCode());
		result = prime * result + (groupChatCreated ? 1231 : 1237);
		result = prime * result
				+ ((leftChatMember == null) ? 0 : leftChatMember.hashCode());
		result = prime * result
				+ ((messageId == null) ? 0 : messageId.hashCode());
		result = prime
				* result
				+ ((migrateFromChatId == null) ? 0 : migrateFromChatId
						.hashCode());
		result = prime * result
				+ ((migrateToChatId == null) ? 0 : migrateToChatId.hashCode());
		result = prime * result
				+ ((newChatMember == null) ? 0 : newChatMember.hashCode());
		result = prime * result
				+ ((newChatTitle == null) ? 0 : newChatTitle.hashCode());
		result = prime * result
				+ ((pinnedMessage == null) ? 0 : pinnedMessage.hashCode());
		result = prime * result
				+ ((replyToMessage == null) ? 0 : replyToMessage.hashCode());
		result = prime * result + (supergroupChatCreated ? 1231 : 1237);
		result = prime * result + ((text == null) ? 0 : text.hashCode());
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
		Message other = (Message) obj;
		if (caption == null) {
			if (other.caption != null)
				return false;
		} else if (!caption.equals(other.caption))
			return false;
		if (channelChatCreated != other.channelChatCreated)
			return false;
		if (chat == null) {
			if (other.chat != null)
				return false;
		} else if (!chat.equals(other.chat))
			return false;
		if (date == null) {
			if (other.date != null)
				return false;
		} else if (!date.equals(other.date))
			return false;
		if (deleteChatPhoto != other.deleteChatPhoto)
			return false;
		if (editDate == null) {
			if (other.editDate != null)
				return false;
		} else if (!editDate.equals(other.editDate))
			return false;
		if (forwardDate == null) {
			if (other.forwardDate != null)
				return false;
		} else if (!forwardDate.equals(other.forwardDate))
			return false;
		if (forwardFrom == null) {
			if (other.forwardFrom != null)
				return false;
		} else if (!forwardFrom.equals(other.forwardFrom))
			return false;
		if (forwardFromChat == null) {
			if (other.forwardFromChat != null)
				return false;
		} else if (!forwardFromChat.equals(other.forwardFromChat))
			return false;
		if (forwardFromMessageId == null) {
			if (other.forwardFromMessageId != null)
				return false;
		} else if (!forwardFromMessageId.equals(other.forwardFromMessageId))
			return false;
		if (from == null) {
			if (other.from != null)
				return false;
		} else if (!from.equals(other.from))
			return false;
		if (groupChatCreated != other.groupChatCreated)
			return false;
		if (leftChatMember == null) {
			if (other.leftChatMember != null)
				return false;
		} else if (!leftChatMember.equals(other.leftChatMember))
			return false;
		if (messageId == null) {
			if (other.messageId != null)
				return false;
		} else if (!messageId.equals(other.messageId))
			return false;
		if (migrateFromChatId == null) {
			if (other.migrateFromChatId != null)
				return false;
		} else if (!migrateFromChatId.equals(other.migrateFromChatId))
			return false;
		if (migrateToChatId == null) {
			if (other.migrateToChatId != null)
				return false;
		} else if (!migrateToChatId.equals(other.migrateToChatId))
			return false;
		if (newChatMember == null) {
			if (other.newChatMember != null)
				return false;
		} else if (!newChatMember.equals(other.newChatMember))
			return false;
		if (newChatTitle == null) {
			if (other.newChatTitle != null)
				return false;
		} else if (!newChatTitle.equals(other.newChatTitle))
			return false;
		if (pinnedMessage == null) {
			if (other.pinnedMessage != null)
				return false;
		} else if (!pinnedMessage.equals(other.pinnedMessage))
			return false;
		if (replyToMessage == null) {
			if (other.replyToMessage != null)
				return false;
		} else if (!replyToMessage.equals(other.replyToMessage))
			return false;
		if (supergroupChatCreated != other.supergroupChatCreated)
			return false;
		if (text == null) {
			if (other.text != null)
				return false;
		} else if (!text.equals(other.text))
			return false;
		return true;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Message [messageId=" + messageId + ", from=" + from + ", date="
				+ date + ", chat=" + chat + ", forwardFrom=" + forwardFrom
				+ ", forwardFromChat=" + forwardFromChat
				+ ", forwardFromMessageId=" + forwardFromMessageId
				+ ", forwardDate=" + forwardDate + ", replyToMessage="
				+ replyToMessage + ", editDate=" + editDate + ", text=" + text
				+ ", caption=" + caption + ", newChatMember=" + newChatMember
				+ ", leftChatMember=" + leftChatMember + ", newChatTitle="
				+ newChatTitle + ", deleteChatPhoto=" + deleteChatPhoto
				+ ", groupChatCreated=" + groupChatCreated
				+ ", supergroupChatCreated=" + supergroupChatCreated
				+ ", channelChatCreated=" + channelChatCreated
				+ ", migrateToChatId=" + migrateToChatId
				+ ", migrateFromChatId=" + migrateFromChatId
				+ ", pinnedMessage=" + pinnedMessage + "]";
	}

}
