package com.test.service;

import com.test.model.User;

public class AuthenticateService {

	public boolean authenticate(String username, String password) {
		if(username.equals(password))
			return true;
		return false;
	}
	
	public User getUserDetails(String username) {
		User user = new User();
		user.setId(username);
		user.setName(username);
		return user;
	}
}
