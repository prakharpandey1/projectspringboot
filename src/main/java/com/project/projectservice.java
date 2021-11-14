package com.project;

import java.util.List;
import java.util.Optional;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class projectservice {

	@Autowired
	ProjectRepo1 projectrepo;
	
	
	
	List<Usersignup> getemployeedata(){
		List<Usersignup> values= projectrepo.findAll();
		System.out.println(values.toString()+"valuewregers");
		
		return values;	
		
	}
	
Usersignup saveemployeedata(Usersignup emp){
	 
	  
	  Random random = new Random();
	  int randomWithNextInt = random.nextInt();
	  int obsvalue=Math.abs(randomWithNextInt);
	  emp.setUsersignupid(randomWithNextInt);
	  Usersignup value = projectrepo.save(emp);
	  return value;
		
	}


Optional<Usersignup> findemployeedata(int id){
  return projectrepo.findById(id);
	
}



String deleteemployeedata(int id){
	  projectrepo.deleteById(id);
	  return "DELETED SUCCESSFULLY";
	
}

Usersignup updateemployeedata(Usersignup emp){
	 return projectrepo.save(emp);
	  
	
}
}
