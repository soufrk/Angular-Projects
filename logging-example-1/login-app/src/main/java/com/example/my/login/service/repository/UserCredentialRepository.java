package com.example.my.login.service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.my.login.service.entities.UserCredential;

@Repository
public interface UserCredentialRepository extends JpaRepository<UserCredential, String>{
	UserCredential findByUsernameAndPassword(String username, char[]password);

	UserCredential findByUsername(String username);
}
