package com.CityDemo.main.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.CityDemo.main.Entity.CityEntity;
import com.CityDemo.main.Service.CityService;

@Controller

public class CityController {
	@Autowired
	private CityService cityService;
	@RequestMapping(value="addCity",method=RequestMethod.POST)
	@ResponseBody
	public void getAllCity(@RequestBody CityEntity cityEntity){
		
		cityService.showCity(cityEntity);
		
		
	
	}
	@RequestMapping(value="deleteCity", method=RequestMethod.DELETE)
	@ResponseBody
	public void deletCity(@RequestBody CityEntity cityEntity){
		cityService.deletCity(cityEntity);
	}

}
