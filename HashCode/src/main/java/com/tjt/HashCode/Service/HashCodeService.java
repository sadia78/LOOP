package com.tjt.HashCode.Service;

import static org.assertj.core.api.Assertions.assertThat;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import javax.xml.bind.DatatypeConverter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tjt.HashCode.Entity.HashCode;
import com.tjt.HashCode.Repository.HashCodeRepo;

@Service


public class HashCodeService {
	@Autowired
	private HashCodeRepo hashCodeRepo;

	public String generateHashCode() throws NoSuchAlgorithmException {
		
		String password="sadia";
		MessageDigest md=MessageDigest.getInstance("MD5");
		md.update(password.getBytes());
	byte[] digest=md.digest();
	String myHash=DatatypeConverter.printHexBinary(digest).toUpperCase();
	System.out.println(myHash);
	return myHash;
}
	
}