package com.login.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.stereotype.Service;


import com.login.dao.userdao;
import com.login.entities.user;
import com.login.security.JwtTokenProvider;
@Service
public class userserviceimpl implements userservice 
{
	@Autowired
	private userdao userdao;
	
	@Autowired
	private JwtTokenProvider tokenProvider;
	
	@Autowired
	AuthenticationManager authenticationManager;
	
	@Transactional
	@Override
	public List<user> get() 
	{
		
		
		return userdao.findAll();
	}
	@Transactional
	@Override
	public Optional<user> get(int id) {
		
		return userdao.findById(id);
	}
	@Transactional
	@Override
	public user adduser(user user)
	{
		
		return userdao.save(user);
	}
	@Transactional
	@Override
	public user updateuser(user user) {
		
		return userdao.save(user);
	}
	@Transactional
	@Override
	public void deleteuser(int id) {
		user entity=userdao.getById(id);
		userdao.delete(entity);
	}
	public String signIn(user user) {

		//authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(username, password));
		return tokenProvider.createToken(user.getUsername(), new ArrayList<>());
	}

}
