package com.example.my.login.endpoints;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.my.login.models.LoginRequest;
import com.example.my.login.models.UserCredentialResponse;
import com.example.my.login.service.UserCredentialService;

@RestController
@RequestMapping("usercred")
public class UserCredentialController {
	
	@Autowired
	private UserCredentialService service;
	
	@PostMapping
	public ResponseEntity<?> addUser(LoginRequest request) {
		return SimpleResponse.buildResponse(service.addUser(request));
	}
	
	@GetMapping
	public ResponseEntity<?> getAllUsers(){
		List<UserCredentialResponse> listOfUsers = service.listAllUsers();
		return SimpleResponse.buildResponse(listOfUsers);
	}

}
