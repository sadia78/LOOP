package com.example.PdfGenerationDemo.Controller;


import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.PdfGenerationDemo.service.PdfSevice;



@Controller

public class PdfController {
	@Autowired
	 private PdfSevice pdfSevice;
	
	
	@RequestMapping(value="pdfGeneration",method=RequestMethod.GET)
		
	public void pdfGeneration() throws IOException {
		
		pdfSevice.pdfGeneration();
	}
}
