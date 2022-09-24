package com.lstech.dscatalog.dto;

import java.io.Serializable;
import java.time.Instant;

import com.lstech.dscatalog.entities.Category;

public class CategoryDTO implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private Long id;
	private String name;
	
	
	public CategoryDTO() {
		
	}

public CategoryDTO(Long id, String name, Instant created_At) {
		
		this.id = id;
		this.name = name;
		
	}
	
	public CategoryDTO(Category entity) {
		this.id = entity.getId();
		this.name = entity.getName();
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	
	
	 
}
