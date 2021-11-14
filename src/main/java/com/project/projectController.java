package com.project;



import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class projectController {

	@Autowired
	projectservice Projectservice;
	
	@RequestMapping("/user/all")
	List<Usersignup> getall() {
	return Projectservice.getemployeedata() ;
	}
	
	
	@RequestMapping(value="/user/save",method=RequestMethod.POST)
	public Usersignup saveemp(@RequestBody Usersignup emp) {
		return Projectservice.saveemployeedata(emp);
		
	}
	
	
	
	@RequestMapping(value="/user/fetch",method=RequestMethod.POST)
	public  Optional<Usersignup> getuserid(@RequestBody Usersignup emp) {
		int value=emp.getUsersignupid();
		System.out.println(value);
		return Projectservice.findemployeedata(value);
		
	}
	
	@RequestMapping(value="/user/delete",method=RequestMethod.POST)
	public  String delete(@RequestBody Usersignup emp) {
		int value=emp.getUsersignupid();
		System.out.println(value);
		return Projectservice.deleteemployeedata(value);
		
	}
	
	@RequestMapping(value="/user/update",method=RequestMethod.POST)
	public  Usersignup update(@RequestBody Usersignup emp) {
		return Projectservice.updateemployeedata(emp);
		
	}
	
	
}
