package com.CityDemo.main.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.CityDemo.main.Entity.CityEntity;

public interface CityDao extends JpaRepository<CityEntity, String> {

}
