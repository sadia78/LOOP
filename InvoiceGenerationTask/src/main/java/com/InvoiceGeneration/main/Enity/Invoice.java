package com.InvoiceGeneration.main.Enity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="invoice")

public class Invoice {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="InvoiceNumber")
	private long invoiceNumber;
	@ManyToOne(fetch=FetchType.LAZY,optional=false)
	@JoinColumn(name="userid",nullable=false)

	private UserDetails userDetails;
	private String customerName;
	private long contactNumber;
	private String email;
	private String address1;
	private String address2;
	private String city;
	private long pincode;
	private double totalPrice;
	private double totalGST;
	private double totalCGST;
	private double taxableAmount;
	private long quantity;
	private double discount;
	private String paymentMode;
	private Date salesdate;
	public long getInvoiceNumber() {
		return invoiceNumber;
	}
	public void setInvoiceNumber(long invoiceNumber) {
		this.invoiceNumber = invoiceNumber;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public long getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(long contactNumber) {
		this.contactNumber = contactNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
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
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public long getPincode() {
		return pincode;
	}
	public void setPincode(long pincode) {
		this.pincode = pincode;
	}
	public double getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}
	public double getTotalGST() {
		return totalGST;
	}
	public void setTotalGST(double totalGST) {
		this.totalGST = totalGST;
	}
	public double getTotalCGST() {
		return totalCGST;
	}
	public void setTotalCGST(double totalCGST) {
		this.totalCGST = totalCGST;
	}
	public double getTaxableAmount() {
		return taxableAmount;
	}
	public void setTaxableAmount(double taxableAmount) {
		this.taxableAmount = taxableAmount;
	}
	public long getQuantity() {
		return quantity;
	}
	public void setQuantity(long quantity) {
		this.quantity = quantity;
	}
	public double getDiscount() {
		return discount;
	}
	public void setDiscount(double discount) {
		this.discount = discount;
	}
	public String getPaymentMode() {
		return paymentMode;
	}
	public void setPaymentMode(String paymentMode) {
		this.paymentMode = paymentMode;
	}
	public Date getSalesdate() {
		return salesdate;
	}
	public void setSalesdate(Date salesdate) {
		this.salesdate = salesdate;
	}

}
