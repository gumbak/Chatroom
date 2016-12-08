package com.gumbak.utils;

import java.util.List;

import com.gumbak.model.User;

public class UsersLookup {
	List<User> users;
	
	public void addUser(User user) {
		users.add(user);
	}
	
	public void removeUser(User user) {
		users.remove(user);
	}
}
