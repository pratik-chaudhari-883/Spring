package com.springboot.dao;

import java.util.List;

import com.springboot.model.Employee;

public interface EmployeeDAO 
{
	List<Employee> get();
	
	Employee get(int id);
	
	void save(Employee employee);
	
	void delete(int id);
	
	

}
