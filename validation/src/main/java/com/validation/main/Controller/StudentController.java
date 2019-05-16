package com.validation.main.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.validation.main.Entity.Students;
import com.validation.main.Service.StudentService;

@Controller

public class StudentController {
	@Autowired 
	private StudentService studentService;
	
	
	
	@RequestMapping(value="/Student",method=RequestMethod.POST)
	public String saveStudentById(@ModelAttribute Students students){
		studentService.createStudent(students);
		return "Student";
	}
	
	@RequestMapping(value="/Student",method=RequestMethod.GET)
	public String saveStudentform(){
			return "Student";
	}
	
	

}
