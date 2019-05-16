package com.tjt.fileUpload.DTO;

import org.springframework.web.multipart.MultipartFile;

public class FileUploadDTO {
	private MultipartFile fileUpload;

	public MultipartFile getFileUpload() {
		return fileUpload;
	}

	public void setFileUpload(MultipartFile fileUpload) {
		this.fileUpload = fileUpload;
	}

}
