package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tutorial")
public class Tutorial {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name="title",length = 100)
	private String title;
	@Column(name="description",length = 200)
	private String description;
	@Column(name="isPubliched")
	private boolean isPubliched=false;
	
	
	public Tutorial(String title, String description, boolean isPubliched) {
		super();
		this.title = title;
		this.description = description;
		this.isPubliched = isPubliched;
	}

	public  Tutorial() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
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

	public boolean isPubliched() {
		return isPubliched;
	}

	public void setPubliched(boolean isPubliched) {
		this.isPubliched = isPubliched;
	}
	

	
	
	
}
