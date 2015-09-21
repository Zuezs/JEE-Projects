package com.eintern.spring.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Circle {
	@Id 
	@Column(name="id", nullable = false)
	private int id;
	private String name;

	public Circle(int circleId, String name){
		setId(circleId);
		setName(name);
	}
	
	public Circle() {
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
		//System.out.println("Circle's setter called");
	}

	
	
	
}
