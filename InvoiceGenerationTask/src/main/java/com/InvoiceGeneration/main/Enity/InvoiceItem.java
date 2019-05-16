package com.InvoiceGeneration.main.Enity;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table( name="InvoiceItem")

public class InvoiceItem {
	@Id
	private long invoiceItems;
	private Invoice invoiceNumber;
	private String tyrePattern;
	private String tyreSize;
	private double basicPrice;
	private String warrentyId;
	private Date salesdate;
	public long getInvoiceItems() {
		return invoiceItems;
	}
	public void setInvoiceItems(long invoiceItems) {
		this.invoiceItems = invoiceItems;
	}
	public Invoice getInvoiceNumber() {
		return invoiceNumber;
	}
	public void setInvoiceNumber(Invoice invoiceNumber) {
		this.invoiceNumber = invoiceNumber;
	}
	public String getTyrePattern() {
		return tyrePattern;
	}
	public void setTyrePattern(String tyrePattern) {
		this.tyrePattern = tyrePattern;
	}
	public String getTyreSize() {
		return tyreSize;
	}
	public void setTyreSize(String tyreSize) {
		this.tyreSize = tyreSize;
	}
	public double getBasicPrice() {
		return basicPrice;
	}
	public void setBasicPrice(double basicPrice) {
		this.basicPrice = basicPrice;
	}
	public String getWarrentyId() {
		return warrentyId;
	}
	public void setWarrentyId(String warrentyId) {
		this.warrentyId = warrentyId;
	}
	public Date getSalesdate() {
		return salesdate;
	}
	public void setSalesdate(Date salesdate) {
		this.salesdate = salesdate;
	}

	
}
