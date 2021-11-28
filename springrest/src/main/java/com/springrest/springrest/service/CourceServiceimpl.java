package com.springrest.springrest.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.springrest.springrest.entities.cource;
@Service
public class CourceServiceimpl implements CourceService 
{
	
	List<cource> list; 
	 
	public  CourceServiceimpl()
	{
		list = new ArrayList<>();
		list.add(new cource(145,"java","ppa"));
		list.add(new cource(146,"python","ppa"));
		
	}
	
	@Override
	public List<cource> get() {
		
		return list;
	}
    @Override
	public cource getcource(long courceid) {
		cource c = null;
			for(cource cource:list)
			{
				if(cource.getId()==courceid)
				{
					c=cource;
					break;
				}
			}
		
		return c;
	}

	@Override
	public cource addcource(cource cource) {
		
		list.add(cource);
		
		return cource;
		
	}

	@Override
	public cource updatecource(cource cource) {
		
		for(cource cource1:list)
		{
			if(cource1.getId()==cource.getId())
			{
				cource1.setTitle(cource.getTitle());
				cource1.setDescription(cource.getDescription());
			}
			
		}
		return cource;
	}

	@Override
	public  void deletecource(long courceId) {
		
		
			for(cource cource1:list)
			{
				if(cource1.getId() == courceId)
				{
					list.remove(cource1);
					
				}
				
			}		

		
	}
	
	
	

}
