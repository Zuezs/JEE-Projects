package com.eintern.overloads;

public class Overload {
	
	public int num;
	public String name;
	public String department;
	public String address;
	
	//default
	Overload(){
		
	}
	//String 
	Overload(String name){
		
	}
	//Integer
	Overload(int num){
		
	}
	//String and Integer
	Overload(String name, int num){
		
	}
	//String and String
	Overload(String name, String department){
		
	}
	//String , Integer, String
	Overload(String name, int num, String department){
		
	}
	//String , String , String
	Overload(String name, String department, String address){
		
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	

}
