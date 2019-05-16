package com.tjt.HashCode.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity

public class HashCode {
	@Id
private String password;
private String hash;
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getHash() {
	return hash;
}
public void setHash(String hash) {
	this.hash = hash;
}
}
