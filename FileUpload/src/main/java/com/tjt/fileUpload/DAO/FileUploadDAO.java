package com.tjt.fileUpload.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tjt.fileUpload.Entity.FileUpload;

public interface FileUploadDAO extends JpaRepository<FileUpload,Long> {

}
