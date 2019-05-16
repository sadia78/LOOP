package com.CompositeDemo.main.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlIDREF;

import org.hibernate.annotations.CollectionId;

@Entity
@Table(name="Composit_Key")
@IdClass(CompositeKey.class)

public class CompositeEntity {
	@Id
	@Column(length=250, name="id")
	
	private String id;
	@Column(length=200, name="StudentName")
	private String name;
	@Id
	@Column(length=250,name="RollNumber")
	private String rollNumber;
	@Column(name="Stream")
	private String stream;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRollNumber() {
		return rollNumber;
	}
	public void setRollNumber(String rollNumber) {
		this.rollNumber = rollNumber;
	}
	public String getStream() {
		return stream;
	}
	public void setStream(String stream) {
		this.stream = stream;
	}
	
	

}
