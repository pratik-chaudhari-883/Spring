package com.springboot.dao;

import java.util.List;


import javax.persistence.EntityManager;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import com.springboot.model.Employee;
@Repository
public class EmployeeDAOimpl implements EmployeeDAO {

	@Autowired
	private EntityManager entityManager;
	@Override
	public List<Employee> get()
	{
		Session session  = entityManager.unwrap(Session.class);
		  Query<Employee> query = session.createQuery("from Employee", Employee.class);		 
		 List<Employee> list = query.getResultList();
		 return list;
	}
 
	@Override
	public Employee get(int id) {
		Session session  = entityManager.unwrap(Session.class);
		Employee employeeobj =session.get(Employee.class, id);
		return employeeobj;
		
	}

	@Override
	public void save(Employee employee) {
		
		Session session  = entityManager.unwrap(Session.class);
		session.saveOrUpdate(employee);
		
	}

	@Override
	public void delete(int id) {
		Session session  = entityManager.unwrap(Session.class);
		Employee employeobj = session.get(Employee.class, id);
		
		 session.delete(employeobj);
	}

}
