package com.example.PdfGenerationDemo.service;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.StringReader;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.PdfGenerationDemo.Dao.PdfDao;
import com.example.PdfGenerationDemo.Entity.PdfEntity;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.html.simpleparser.HTMLWorker;
import com.itextpdf.text.pdf.PdfWriter;

@Service

public class PdfSevice {
	@Autowired
	private PdfDao pdfdao;
	public void pdfGeneration() throws IOException{
		String templet=null;
		List<PdfEntity> pdfentity=pdfdao.findAll();
		for (PdfEntity pdfEntity2 : pdfentity) {
		templet=pdfEntity2.getDescription();
			
		}
		Document document=new Document();
		try{
			PdfWriter writter=PdfWriter.getInstance(document,new FileOutputStream(" Generation.pdf"));
			document.open();
      
           System.out.println("heloo");
					document.close();
					writter.close();
					}
		catch (DocumentException e){
			e.printStackTrace();
		}
		
	catch(FileNotFoundException e)	{
		e.printStackTrace();
	}
	
		
		
	}
}
