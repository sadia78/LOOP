package com.InvoiceGeneration.main.Enity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity

public class TyreInformation {
	@Id
	private String tyrePattern;
	private String tyreSize;
	private double price;
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
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	

	
}
