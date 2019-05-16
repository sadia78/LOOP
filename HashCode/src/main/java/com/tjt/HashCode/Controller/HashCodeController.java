package com.tjt.HashCode.Controller;

import java.security.NoSuchAlgorithmException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import com.tjt.HashCode.Service.HashCodeService;

@RestController

public class HashCodeController {
	@Autowired
	private HashCodeService hashCodeService;
	@RequestMapping(value="/generateHashCode",method=RequestMethod.GET)
	public String generateHashCode() throws NoSuchAlgorithmException{
		String hashCode=hashCodeService.generateHashCode();
		return hashCode;
		
	}
	

}
