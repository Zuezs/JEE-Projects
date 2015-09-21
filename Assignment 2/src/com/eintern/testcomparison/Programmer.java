//Question 1
package com.eintern.testcomparison;

import java.util.Comparator;

public class Programmer implements Comparator<Programmer>{

	String name;
	int id;
	
	public Programmer(){
		
	}
	public Programmer(String name, int id) {
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
	
	public int compare(Programmer o1, Teacher o2){
		int id1 = o1.getId();
		int id2 = o2.getId();
		return id1 - id2;
	}
	public int compare(Programmer o1, Programmer o2) {
		int id1 = o1.getId();
		int id2 = o2.getId();
		return id1 - id2;
	}
	
	
}
