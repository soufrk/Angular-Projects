package com.example.my.login.models;

import com.example.my.login.service.entities.UserCredential;

public class LoginRequest {

	private String username;
	private char[] password;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public char[] getPassword() {
		return password;
	}

	public void setPassword(char[] password) {
		this.password = password;
	}
	
	public UserCredential convert() {
		UserCredential instance = new UserCredential();
		instance.setUsername(username);
		instance.setPassword(password);
		return instance;
	}

}
