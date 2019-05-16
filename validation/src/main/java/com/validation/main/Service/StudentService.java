package com.validation.main.Service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.validation.main.Dao.StudentDao;
import com.validation.main.Entity.Students;

@Service
@Transactional

public class StudentService {
	@Autowired
	private StudentDao studentDao;

	public void createStudent(Students students) {
		studentDao.save(students);
		
		
	}

}
