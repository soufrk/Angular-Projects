package com.example.my.login.service;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.my.login.models.LoginRequest;
import com.example.my.login.models.UserCredentialResponse;
import com.example.my.login.service.entities.UserCredential;
import com.example.my.login.service.repository.UserCredentialRepository;

@Service
public class UserCredentialManager implements UserCredentialService {
	
	@Autowired
	private UserCredentialRepository usrCredRepo;

	@Override
	public boolean addUser(LoginRequest request) {
		boolean response = false;
		UserCredential savedEntity = usrCredRepo.save(request.convert());
		if(savedEntity != null) {
			response = true;			
		}
		return response;
	}

	@Override
	public List<UserCredentialResponse> listAllUsers() {
		List<UserCredentialResponse> resultList = new LinkedList<>();
		resultList = usrCredRepo.findAll().stream()
			.map(u->new UserCredentialResponse(
					u.getUsername(), 
					u.getPassword().length>0?"*****":"", 
					u.getCreatedOn())
				)
			.collect(Collectors.toList());
		return resultList;
	}

}
