package com.tjt.factory.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.tjt.factory.Entity.Factory;
import com.tjt.factory.Service.FactoryService;



@RestController
public class FactoryController {
	@Autowired
	private FactoryService factoryService;
	@RequestMapping(value="/createFactory",method=RequestMethod.POST)
	@ResponseBody
		public void getAllFactory( @RequestBody Factory factory) {
		factoryService.createFactory(factory);
	}
	
	@RequestMapping(value="/deleteFactory/{id}",method=RequestMethod.DELETE)
	@ResponseBody
	public void deleteAllFactory(@RequestBody Factory factory, @PathVariable(value="id") String factoryId ){
		factoryService.deleteFactory(factory,factoryId);
	}
	
	@RequestMapping(value="/modifyFactory/{id}",method=RequestMethod.PUT)
	@ResponseBody
	public void modifyFactory(@RequestBody Factory factory,@PathVariable(value="id") String factoryId){
		factoryService.updateStudent(factory,factoryId);
		
	}
}


