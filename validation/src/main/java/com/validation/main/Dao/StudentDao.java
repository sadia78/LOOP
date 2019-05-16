package com.validation.main.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.validation.main.Entity.Students;

public interface StudentDao extends JpaRepository<Students, String> {

}
