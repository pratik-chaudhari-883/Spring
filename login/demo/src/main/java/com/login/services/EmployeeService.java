package com.login.services;

import java.util.List;
import java.util.Optional;

import com.login.entities.Employee;

public interface EmployeeService 
{

	List<Employee> get();
	
	Optional<Employee> get(int id);
	
	void save(Employee employee);
	
	void delete(int id);
}
