package com.tjt.HashCode.Service;

import java.net.MalformedURLException;
import java.net.URL;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

import com.tjt.HashCode.Repository.HashCodeRepo;

@Service

public class UrlService {
	@Autowired
	private HashCodeRepo hashCodeRepo;

	public String  createLink() throws MalformedURLException {
		try{
		URL url=new URL("http", "localhost", 9999 ,"/generateHashCode");
		
		String uricompo=url.toString();
		System.out.println("hii");
		return uricompo;
		}
		catch(Exception e){
			e.printStackTrace();
			return "";
		}
	}

}
