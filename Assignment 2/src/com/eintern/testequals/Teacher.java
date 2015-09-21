//Question 1
package com.eintern.testequals;

public class Teacher implements Comparable<Teacher>{
	
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
	
	@Override
	public int compareTo(Teacher o) {
		if(this.name.equals(o.name)){
			return 0;
		}
		return 1;
	}
	
	
	
}
