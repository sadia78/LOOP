package com.tjt.factory.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tjt.factory.DAO.FactoryDao;
import com.tjt.factory.Entity.Factory;

import antlr.collections.List;
@Service

public class FactoryService {
	@Autowired
	private FactoryDao factoryDao;

public void createFactory(Factory factory) {
	factoryDao.save(factory);
	}

public void deleteFactory(Factory factory,String factoryId) {
	factoryDao.delete(factory);
	
}

public void updateStudent(Factory factory, String factoryId) {
	factoryDao.save(factory);
	
}

public List findAllFactory( Factory factory) {
	factoryDao.findAll();
	return (List) factory;
}


}
