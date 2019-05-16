package com.InvoiceGeneration.main.Enity;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class VehicleInvoice {
	@Id
private long vehicleInvoice;
private String vehicleMake;
private String vehicleModel;
private String vehicleNumber;
private long vehicleKm;
private String vehicleType;
private Date salesdate;
public long getVehicleInvoice() {
	return vehicleInvoice;
}
public void setVehicleInvoice(long vehicleInvoice) {
	this.vehicleInvoice = vehicleInvoice;
}
public String getVehicleMake() {
	return vehicleMake;
}
public void setVehicleMake(String vehicleMake) {
	this.vehicleMake = vehicleMake;
}
public String getVehicleModel() {
	return vehicleModel;
}
public void setVehicleModel(String vehicleModel) {
	this.vehicleModel = vehicleModel;
}
public String getVehicleNumber() {
	return vehicleNumber;
}
public void setVehicleNumber(String vehicleNumber) {
	this.vehicleNumber = vehicleNumber;
}
public long getVehicleKm() {
	return vehicleKm;
}
public void setVehicleKm(long vehicleKm) {
	this.vehicleKm = vehicleKm;
}
public String getVehicleType() {
	return vehicleType;
}
public void setVehicleType(String vehicleType) {
	this.vehicleType = vehicleType;
}
public Date getSalesdate() {
	return salesdate;
}
public void setSalesdate(Date salesdate) {
	this.salesdate = salesdate;
}




}
