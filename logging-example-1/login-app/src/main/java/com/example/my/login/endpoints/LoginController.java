package com.example.my.login.endpoints;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.my.login.models.LoginRequest;
import com.example.my.login.service.LoginService;

@RestController
@RequestMapping("authenticate")
public class LoginController {
	
	@Autowired
	LoginService service;
	
	@CrossOrigin(origins = "http://localhost:4200")
	@PostMapping
	public ResponseEntity<?> login(@RequestBody LoginRequest request) {
		return SimpleResponse.buildResponse(service.checkLogin(request));
	}

}
