package com.gumbak.model;

import java.util.ArrayList;
import java.util.List;

public class ChatMessagesList {
	private List<ChatMessage> messages;
	
	public ChatMessagesList() {
		messages = new ArrayList();
	}
	
	public List getMessages() {
		return messages;
	}
	
	public void addMessages(ChatMessage message) {
		messages.add(message);
	}
}
