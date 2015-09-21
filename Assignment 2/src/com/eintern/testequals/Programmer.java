//Question 1
package com.eintern.testequals;

public class Programmer implements Comparable<Programmer>{

	String name;
	int id;
	
	Programmer(){
		
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
	
	@Override
	public int compareTo(Programmer o) {
		if(this.id == o.id){
			return 0;
		}else{
			return this.id - o.id;
		}
	}

}
