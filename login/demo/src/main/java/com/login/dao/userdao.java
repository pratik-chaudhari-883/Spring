package com.login.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.login.entities.user;

@Repository
public interface userdao extends JpaRepository<user, Integer>
{

	user findByUsername(String username);
}
