package com.login.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.login.entities.Employee;
import com.login.entities.user;
import com.login.services.EmployeeServiceimpl;
import com.login.services.userserviceimpl;

@RestController
public class usercontroller
{
	@Autowired
	private userserviceimpl userserviceimpl;
	
	
	
	@GetMapping("/users/getAllUsers")
	public List<user> getall()
	{
		List<user> list =userserviceimpl.get();
		
		return list;
	}
	
	@GetMapping("/users/{userId}")
	public Optional<user> getuser(@PathVariable String userId)
	{
//		if(userId<0)
//		{
//			userId=-userId;
//		}
		return  userserviceimpl.get(Integer.parseInt(userId));
		
		
	}
	
	@PostMapping("/users")
	public user  Save(@RequestBody user userobj)
	{
		userserviceimpl.adduser(userobj);
		return userobj;
		
		
	}
	
	@PostMapping("/users/login")
	public String  login(@RequestBody user user)
	{
		String token = userserviceimpl.signIn(user);
		return token;
		
		
	}
	//for delete the user
	//status
	@DeleteMapping("/users/{uid}")
	public ResponseEntity<HttpStatus> delete(@PathVariable int uid)
	{
		try {
			userserviceimpl.deleteuser(uid);
			return new ResponseEntity<>(HttpStatus.OK);
		}catch(Exception e){
			return new  ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
			
		}
		 
//		return "Deleted Employe id:"+id;
		
		
	}
	
	@PutMapping("/users")
	public user update(@RequestBody user userobj )
	{
		userserviceimpl.adduser(userobj);
		return userobj;
	}
	
	
	
	
}
