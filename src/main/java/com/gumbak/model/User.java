package com.gumbak.model;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class User {
	private String username;
	
	public String getUsername() {
		return username;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
}
