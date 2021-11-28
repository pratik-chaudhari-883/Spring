package com.springrest.springrest.controller;


import java.util.List;
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
//Representational state transfer

import com.springrest.springrest.entities.cource;
import com.springrest.springrest.service.CourceService;




@RestController
public class mycontroller {
	@Autowired
	private CourceService courceservice;
	
	@GetMapping("/Home")
	public String Home()
	{
		return "this is home";
	}
	
	@GetMapping("/cources")
	public List<cource> get()
	{
		List<cource> list =courceservice.get();
		
		return list;
	}
	//@GetMapping(value = "/{}", produces = "application/json", consumes = "application/json")

	@GetMapping("/cources/{courceId}")
	public cource getcource(@PathVariable String courceId)
	{
		return  this.courceservice.getcource(Long.parseLong(courceId));
		
	}
	@PostMapping("/cources")
	public cource addcource(@RequestBody cource cource)
	{
		return courceservice.addcource(cource);
	}
	
	@PutMapping("/cources")
	public cource updatecource(@RequestBody cource cource)
	{
		return courceservice.updatecource(cource);
	}
	@DeleteMapping("/cources/{courceId}")
	public ResponseEntity<HttpStatus> Delete(@PathVariable String courceId )
	{
		try{
			courceservice.deletecource(Long.parseLong(courceId));
			 return new ResponseEntity<>(HttpStatus.OK);
		}catch(Exception e){
			return new  ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
			
		}
		 
	}
}
