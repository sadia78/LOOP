package com.example.PdfGenerationDemo.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.PdfGenerationDemo.Entity.PdfEntity;

public interface PdfDao extends JpaRepository<PdfEntity, String> {

}
