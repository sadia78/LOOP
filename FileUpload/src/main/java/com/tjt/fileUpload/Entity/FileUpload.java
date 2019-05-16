package com.tjt.fileUpload.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;

@Entity

public class FileUpload {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	@Lob
	
	private byte[] fileUpload;

	public byte[] getFileUpload() {
		return fileUpload;
	}

	public void setFileUpload(byte[] fileUpload) {
		this.fileUpload = fileUpload;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	
	

}
