package com.springrest.springrest.entities;

public class cource
{
	private long id;
	
	private String title;
	
	private String description;
	
	

	public cource(long id, String title, String description) {
		super();
		this.id = id;
		this.title = title;
		this.description = description;
	}
	

	public cource() {
		super();
		// TODO Auto-generated constructor stub
	}


	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	

}
