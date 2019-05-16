package com.example.LinkingDemo.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity

public class UserRegistration {
	@Id
	private long userId;
	private String name;
	private long phoneNumber;
	private String address1;
	private String address2;
	private String pos;
	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getAddress1() {
		return address1;
	}
	public void setAddress1(String address1) {
		this.address1 = address1;
	}
	public String getAddress2() {
		return address2;
	}
	public void setAddress2(String address2) {
		this.address2 = address2;
	}
	public String getPos() {
		return pos;
	}
	public void setPos(String pos) {
		this.pos = pos;
	}
	public UserRegistration() {
		super();
		
	}
	
	

}
