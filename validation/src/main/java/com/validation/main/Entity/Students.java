package com.validation.main.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity

public class Students {
	@Id
	private String id;
	private String name;
	private double rollNumber;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getRollNumber() {
		return rollNumber;
	}
	public void setRollNumber(double rollNumber) {
		this.rollNumber = rollNumber;
	}
	


	}


