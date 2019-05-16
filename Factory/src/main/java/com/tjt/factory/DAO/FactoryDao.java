package com.tjt.factory.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tjt.factory.Entity.Factory;

public interface FactoryDao extends JpaRepository<Factory, Long> {

}
