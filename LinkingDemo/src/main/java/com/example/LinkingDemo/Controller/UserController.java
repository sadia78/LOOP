package com.example.LinkingDemo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.LinkingDemo.Entity.UserRegistration;
import com.example.LinkingDemo.Service.UserService;

@Controller

public class UserController {
	@Autowired
	private UserService userSrvice;
	@RequestMapping(value="/userRegistration", method=RequestMethod.POST)
	public String getUserById(@ModelAttribute UserRegistration userRegistration){
		userSrvice.registerUser(userRegistration);
		return "index";
	}
	@RequestMapping(value="/userRegistration", method=RequestMethod.GET)
	public String userFrom(){
		
		return "UserRegistration";
	}

}
