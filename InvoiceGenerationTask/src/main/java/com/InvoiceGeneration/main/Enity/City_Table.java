package com.InvoiceGeneration.main.Enity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Columns;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

@Entity
@Table(name="City_Table")
public class City_Table {
	@Id
	@OnDelete(action= OnDeleteAction.CASCADE)
	@Column(name="cityName")
	private String cityName;
	@Column(name="gstno")
	private String gstno;
	@Column(name="gstAddrss")
	private String gstAddrss;
	@Column( name="description")
	private String description;
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public String getGstno() {
		return gstno;
	}
	public void setGstno(String gstno) {
		this.gstno = gstno;
	}
	public String getGstAddrss() {
		return gstAddrss;
	}
	public void setGstAddrss(String gstAddrss) {
		this.gstAddrss = gstAddrss;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
}
