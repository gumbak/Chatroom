package com.gumbak.model;

public class ChatMessage {
	private User author;
	private String text;
	
	public void setAuthor(User author) {
		this.author = author;
	}
	public User getAuthor() {
		return author;
	}
	
	public void setText(String text) {
		this.text = text;
	}
	public String getText() {
		return text;
	}
}
