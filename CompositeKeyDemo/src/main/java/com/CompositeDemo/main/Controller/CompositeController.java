package com.CompositeDemo.main.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.CompositeDemo.main.Entity.CompositeEntity;
import com.CompositeDemo.main.Service.CompositeService;

@Controller
public class CompositeController{
	@Autowired
	private CompositeService compositeService;
	@RequestMapping(value="StudentCompositeKey/{name}", method=RequestMethod.GET)
	@ResponseBody
	public List<CompositeEntity>showStudent(@PathVariable("name")String name ){
		
		return compositeService.showStudent(name) ;
		}
	@RequestMapping(value="saveStudent",method=RequestMethod.POST)
	public void saveStudent(@RequestBody CompositeEntity compositeEntity){
		compositeService.createStudent(compositeEntity)	;
	}
}

