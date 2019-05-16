package com.tjt.HashCode.Controller;

import java.net.MalformedURLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.tjt.HashCode.Service.UrlService;


@Controller

public class UrlController {
	@Autowired
	private UrlService urlService;

	@RequestMapping(method=RequestMethod.GET, value="/urlLink")
	@ResponseBody
	 public String createLink() throws MalformedURLException{
		String url="";
		url=urlService.createLink();
		return url;

}
}