package com.InvoiceGeneration.main.Enity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity

public class UserDetails {
	@Id
	private String userName;
	private String userid;
	private String password;
	private long mobileNumber;
	private String address;
	private String mailId;
	private byte[] idProf;
	private String idProofName;
	private String mgr;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public long getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getMailId() {
		return mailId;
	}
	public void setMailId(String mailId) {
		this.mailId = mailId;
	}
	public byte[] getIdProf() {
		return idProf;
	}
	public void setIdProf(byte[] idProf) {
		this.idProf = idProf;
	}
	public String getIdProofName() {
		return idProofName;
	}
	public void setIdProofName(String idProofName) {
		this.idProofName = idProofName;
	}
	public String getMgr() {
		return mgr;
	}
	public void setMgr(String mgr) {
		this.mgr = mgr;
	}
	


	

}
