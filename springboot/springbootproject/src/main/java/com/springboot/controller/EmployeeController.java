package com.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.model.Employee;
import com.springboot.service.EmployeeService;
import com.springboot.service.EmployeeServiceimpl;

@RestController
@RequestMapping("/api")
public class EmployeeController
{	
	
	@Autowired
	EmployeeServiceimpl employeeService;
	
	@GetMapping("/employee")
	public List<Employee>get()
	{
		return  employeeService.get();
		
	}
	@PostMapping("/employee")
	public Employee  Save(@RequestBody Employee employeeobj)
	{
		employeeService.save(employeeobj);
		return employeeobj;
		
		
	}
	

	@GetMapping("/employee/{id}")
	public Employee get(@PathVariable int id) 
	{
		Employee employeeobj=employeeService.get(id);
		
		if(employeeobj==null)
		{
			throw new  RuntimeException("employee with is:"+id+"not found");
		}else{
			return employeeobj;
		}
		
		
	}
	@DeleteMapping("/employee/{id}")
	public String delete(@PathVariable int id)
	{
		employeeService.delete(id);
		
		return "Deleted Employe id:"+id;
		
		
	}
	@PutMapping("/employee")
	public Employee update(@RequestBody Employee employeeobj )
	{
		employeeService.save(employeeobj);
		return employeeobj;
	}
	
}
