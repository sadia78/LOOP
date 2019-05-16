package com.CompositeDemo.main.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.CompositeDemo.main.Entity.CompositeEntity;
import com.CompositeDemo.main.Entity.CompositeKey;

public interface CompositeDao extends JpaRepository<CompositeEntity, CompositeKey> {

	

}
