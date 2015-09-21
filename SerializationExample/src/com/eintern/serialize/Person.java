package com.eintern.serialize;

import java.io.Serializable;

//This is a Marker Interface
//Serializable is the Marker Interface
//No methods
//All the info in here can be serialized now
public class Person implements Serializable{

	private transient int id;
	private String name;
	private int age;
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Person(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
	
	
	
}
