package com.CompositeDemo.main.Service;



import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.CompositeDemo.main.Dao.CompositeDao;
import com.CompositeDemo.main.Entity.CompositeEntity;


@Service
public class CompositeService {
	@Autowired
	private CompositeDao compositeDao;
	

	public List<CompositeEntity> showStudent( String  name) {
		
		List<CompositeEntity> compstud=	compositeDao.findAll();
		
		return compstud;
			
		
	}


	public void createStudent(CompositeEntity compositeEntity) {
		compositeDao.save(compositeEntity);
	}
}



