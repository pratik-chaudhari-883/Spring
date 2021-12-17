package com.login.services;

import java.util.List;
import java.util.Optional;

import com.login.entities.user;

public interface userservice 
{
public List<user> get();
	
	public Optional<user> get(int id);
	
	public user adduser(user user);
	
	public user updateuser(user user);
	
	public void deleteuser(int id);

}
