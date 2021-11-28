package com.springrest.springrest.service;

import java.util.List;

import com.springrest.springrest.entities.cource;

public interface CourceService
{
	public List<cource> get();
	
	public cource getcource(long courceid);
	
	public cource addcource(cource cource);
	
	public cource updatecource(cource cource);
	
	public void deletecource(long courceId);
}
