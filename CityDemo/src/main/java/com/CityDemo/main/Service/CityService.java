package com.CityDemo.main.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.CityDemo.main.Dao.CityDao;
import com.CityDemo.main.Entity.CityEntity;

@Service

public class CityService {
	@Autowired
	private CityDao citydao;

	public void showCity( CityEntity cityEntity) {
		citydao.save(cityEntity);
		
		
	}

	public void deletCity(CityEntity cityEntity) {
		citydao.delete(cityEntity);
		
	}

}
