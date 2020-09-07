package com.example.my.login.service;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.my.login.models.LoginRequest;
import com.example.my.login.service.entities.UserCredential;
import com.example.my.login.service.repository.UserCredentialRepository;

@Service
public class FirstLoginImplementation implements LoginService {
	
	@Autowired
	private UserCredentialRepository usrCredRepo;

	@Override
	public boolean checkLogin(LoginRequest request) {
		//Object o = usrCredRepo.findByUsernameAndPassword(request.getUsername(), request.getPassword());
		//return o==null?true:false;
		boolean result = false;
		UserCredential entity = usrCredRepo.findByUsername(request.getUsername());
		if(entity!=null && Arrays.equals(request.getPassword(), entity.getPassword())) {
			result = true;			
		}
		return result;
	}

}
