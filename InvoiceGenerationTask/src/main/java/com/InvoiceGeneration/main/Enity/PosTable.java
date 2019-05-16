package com.InvoiceGeneration.main.Enity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity

public class PosTable {
	@Id
	private String posId;
	private String posName;
	private String password;
	private String address1;
	private String address2;
	private String pincode;
	private String gstNo;
	private String gstAddress;
	public String getPosId() {
		return posId;
	}
	public void setPosId(String posId) {
		this.posId = posId;
	}
	public String getPosName() {
		return posName;
	}
	public void setPosName(String posName) {
		this.posName = posName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
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
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	public String getGstNo() {
		return gstNo;
	}
	public void setGstNo(String gstNo) {
		this.gstNo = gstNo;
	}
	public String getGstAddress() {
		return gstAddress;
	}
	public void setGstAddress(String gstAddress) {
		this.gstAddress = gstAddress;
	}

}
