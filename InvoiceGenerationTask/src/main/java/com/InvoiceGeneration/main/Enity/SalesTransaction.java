package com.InvoiceGeneration.main.Enity;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SalesTransaction {
	@Id
	private long transactionId;
	private UserDetails userDetails;
	private double amount;
	private Date date;
	private String paymentMode;
	private String reciversNAame;
	private byte[]fileuplod;
	public long getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(long transactionId) {
		this.transactionId = transactionId;
	}
	public UserDetails getUserDetails() {
		return userDetails;
	}
	public void setUserDetails(UserDetails userDetails) {
		this.userDetails = userDetails;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getPaymentMode() {
		return paymentMode;
	}
	public void setPaymentMode(String paymentMode) {
		this.paymentMode = paymentMode;
	}
	public String getReciversNAame() {
		return reciversNAame;
	}
	public void setReciversNAame(String reciversNAame) {
		this.reciversNAame = reciversNAame;
	}
	public byte[] getFileuplod() {
		return fileuplod;
	}
	public void setFileuplod(byte[] fileuplod) {
		this.fileuplod = fileuplod;
	}


}
