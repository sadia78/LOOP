package com.tjt.mail.Entity;

import javax.validation.constraints.NotNull;

public class EmailFeeedback {
	@NotNull
	private String name;
	@NotNull
	private String email;
	@NotNull
	private String feedback;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFeedback() {
		return feedback;
	}
	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}
	
	

}
