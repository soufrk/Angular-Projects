package com.example.my.login.service;

import java.util.List;

import com.example.my.login.models.LoginRequest;
import com.example.my.login.models.UserCredentialResponse;
import com.example.my.login.service.entities.UserCredential;


public interface UserCredentialService {

	boolean addUser(LoginRequest request);

	List<UserCredentialResponse> listAllUsers();

}
