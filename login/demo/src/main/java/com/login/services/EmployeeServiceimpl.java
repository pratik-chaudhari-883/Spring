package com.login.services;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.login.dao.EmployeeDAO;
import com.login.entities.Employee;
import com.login.entities.user;
@Service
public class EmployeeServiceimpl implements EmployeeService 
{
	@Autowired
	private EmployeeDAO employeeDAO;
	
	
	@Override
	public List<Employee> get()
	{
	 	return employeeDAO.findAll();
	}
	@Transactional
	@Override
	public  Optional<Employee> get(int id)
	{
		
		   return employeeDAO.findById(id);
		
	}
	
	@Transactional
	@Override
	public void save(Employee employee) {


		
	}
	@Transactional
	@Override
	public void delete(int id) {
		employeeDAO.deleteById(id);
		
	}

}
