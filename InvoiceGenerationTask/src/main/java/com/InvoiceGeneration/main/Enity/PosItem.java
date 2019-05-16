package com.InvoiceGeneration.main.Enity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity

public class PosItem {
	@Id
	 private PosTable posTable;
	private long quantity;
	private double mrp;
	private double salesPrice;
	public PosTable getPosTable() {
		return posTable;
	}
	public void setPosTable(PosTable posTable) {
		this.posTable = posTable;
	}
	public long getQuantity() {
		return quantity;
	}
	public void setQuantity(long quantity) {
		this.quantity = quantity;
	}
	public double getMrp() {
		return mrp;
	}
	public void setMrp(double mrp) {
		this.mrp = mrp;
	}
	public double getSalesPrice() {
		return salesPrice;
	}
	public void setSalesPrice(double salesPrice) {
		this.salesPrice = salesPrice;
	}
	
	
	
	

	

}
