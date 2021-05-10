package com.example.my.login.models;

import java.util.Date;

public class UserCredentialResponse {

	private String username;
	private String password;
	private Date createdOn;

	public UserCredentialResponse(String username, String password, Date createdOn) {
		super();
		this.username = username;
		this.password = password;
		this.createdOn = createdOn;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Date getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}

}
