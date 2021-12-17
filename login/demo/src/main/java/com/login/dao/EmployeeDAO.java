package com.login.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.login.entities.Employee;
import com.login.entities.user;
@Repository
public interface EmployeeDAO extends JpaRepository<user, Integer> {

	void saveAll(Employee employee);

}
