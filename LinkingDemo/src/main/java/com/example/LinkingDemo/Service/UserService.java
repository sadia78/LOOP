package com.example.LinkingDemo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.LinkingDemo.Entity.UserRegistration;
import com.example.LinkingDemo.Repository.UserRepository;

@Service

public class UserService {
	@Autowired
	private UserRepository userRepository;

	public void registerUser(UserRegistration userRegistration) {
		userRepository.save(userRegistration);
		
	}

}
