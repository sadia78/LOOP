package com.tjt.SessionDemo.Controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.tjt.SessionDemo.Service.LoginService;

@Controller

public class LoginController {
	@Autowired
	private LoginService loginservice;
	
	@GetMapping("/login")
	public String show()
	{
		return "login";
	}
	
	
	@GetMapping( value="/done")
	public String doLogIn(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException{
		String responsePage="";
		responsePage="login";
		loginservice.doLogin(request, response);
		return responsePage;
}
}