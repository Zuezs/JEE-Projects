//Question 1
package com.eintern.testcomparison;

import java.util.Comparator;

public class Teacher implements Comparator<Teacher>{
	
	String name;
	int id;
	
	public Teacher(){
		
	}
	public Teacher(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	@Override
	public String toString(){
		return "Name: " + this.name + " ID: " + this.id;
	}
	public int compare(Teacher o1, Programmer pro) {
		String name1 = o1.getName();
		String name2 = pro.getName();
		return name1.compareTo(name2);
	}

	public int compare(Teacher o1, Teacher o2) {
		String name1 = o1.getName();
		String name2 = o2.getName();
		return name1.compareTo(name2);
	}
	
	
}
