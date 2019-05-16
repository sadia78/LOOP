package com.tjt.URLCreation.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.tjt.URLCreation.Service.UrlService;

@Controller
public class UrlController {
	@Autowired
	private UrlService urlService;
	@RequestMapping(method=RequestMethod.GET, value="/urlLink")
	 public String createLink(){
		urlService.createLink();
		return null;
		
	}

}
