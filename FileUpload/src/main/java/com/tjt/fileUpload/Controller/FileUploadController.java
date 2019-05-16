package com.tjt.fileUpload.Controller;

import java.io.IOException;

import org.hibernate.mapping.Array;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.tjt.fileUpload.DAO.FileUploadDAO;
import com.tjt.fileUpload.DTO.FileUploadDTO;
import com.tjt.fileUpload.Entity.FileUpload;

@Controller

public class FileUploadController {
	@Autowired
	private FileUploadDAO daofile;
	@RequestMapping(value="show",method=RequestMethod.GET)
	public  String showFile() {
		return "File";
		
	}
	@RequestMapping(value="fileUpload",method=RequestMethod.POST)
	public String uploadFile(@ModelAttribute FileUploadDTO file) throws IOException
	{
		FileUpload filesdto=new FileUpload();
		
		
		byte[] files=file.getFileUpload().getBytes();
		filesdto.setFileUpload(files);
		daofile.save(filesdto);
		return "File";
	}
	
	
	

}
