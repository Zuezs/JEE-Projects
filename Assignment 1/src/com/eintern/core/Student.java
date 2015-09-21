//Question 4

package com.eintern.core;

import java.util.Scanner;

public class Student extends AbExample {
	
	String name;
	String age;
	
	public Student(String name, String age){
		this.name = name;
		this.age = age;
	}
	boolean checkCase(String name){
		this.name = name;
		boolean hasUpper = !name.equals(name.toLowerCase());
		if(hasUpper){
			return true;
		}else{
			return false;
		}
	}
	String convertCase(String name){
		this.name = name;
		return name.toUpperCase();
	};
	int convertStoI(String age){
		this.age = age;
		return Integer.parseInt(age) + 10;
	};
	
public static void main(String[] args) {
		
	String name;
	String age;
	
	Scanner userInput = new Scanner(System.in);
	
	System.out.println("What is your name: ");
	name = userInput.nextLine();
	
	System.out.println("What is your age: ");
	age = userInput.nextLine();
	
	Student student1 = new Student(name, age);
	
	System.out.println(student1.checkCase(name));
	System.out.println(student1.convertCase(name));
	System.out.println(student1.convertStoI(age));
	
	}
}
