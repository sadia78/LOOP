package com.CityDemo.main.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="cityName")

public class CityEntity {
	@Id
	private  String cityName;
	private  double gstAddress;
	private double gstNo;
	private String state;
    private String description;
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public double getGstAddress() {
		return gstAddress;
	}
	public void setGstAddress(double gstAddress) {
		this.gstAddress = gstAddress;
	}
	public double getGstNo() {
		return gstNo;
	}
	public void setGstNo(double gstNo) {
		this.gstNo = gstNo;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
    
 
}
