package com.tjt.factory.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Factory")

public class Factory {
	@Id
	@Column(name="factory_id",nullable=false)

	private long factory_id;
	@Column(name="factory_name",nullable=false)
	private String factory_name;
	@Column(name="factroy_location",nullable=false)
	private String factroy_location;
	@Column(name="factory_manager_id",nullable=false)
	private String factory_manager_id;
	@Column(name="factory_password",nullable=false)
	private String factory_password;
	public long getFactory_id() {
		return factory_id;
	}
	public void setFactory_id(long factory_id) {
		this.factory_id = factory_id;
	}
	public String getFactory_name() {
		return factory_name;
	}
	public void setFactory_name(String factory_name) {
		this.factory_name = factory_name;
	}
	public String getFactroy_location() {
		return factroy_location;
	}
	public void setFactroy_location(String factroy_location) {
		this.factroy_location = factroy_location;
	}
	public String getFactory_manager_id() {
		return factory_manager_id;
	}
	public void setFactory_manager_id(String factory_manager_id) {
		this.factory_manager_id = factory_manager_id;
	}
	public String getFactory_password() {
		return factory_password;
	}
	public void setFactory_password(String factory_password) {
		this.factory_password = factory_password;
	}
	
	


}