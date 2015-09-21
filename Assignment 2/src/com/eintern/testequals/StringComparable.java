//Question 1
package com.eintern.testequals;

public class StringComparable{

	public static void main(String[] args) {
		
		//Creating teacher and programmer objects from the classes
		Teacher teacher[] = new Teacher[2];
		Programmer programmer[] = new Programmer[2];
		//creating teacher objects in the indexes
		teacher[0] = new Teacher();
		teacher[1] = new Teacher();
		//Creating programmer objects in the indexes
		programmer[0] = new Programmer();
		programmer[1] = new Programmer();
		
		//Making teacher values
		teacher[0].name = "Lisa";
		teacher[1].name = "Lisa";
		teacher[0].id = 1;
		teacher[1].id = 1;
		// Teachers compareTo technique
		int num = teacher[0].compareTo(teacher[1]);
		//Testing if it works and is true
		System.out.println("Teachers CompareTo: ");
		if(num == 0){
			System.out.println("TRUE! Compare works");
		}else{
			System.out.println("FALSE! WRONG!");
		}
		//Making programmers values
		programmer[0].name = "Lisa";
		programmer[1].name = "Lisa";
		programmer[0].id = 1;
		programmer[1].id = 1;
		//Programmers compareTo technique
		int num1 = programmer[0].compareTo(programmer[1]);
		//Testing if it works and is true
		System.out.println("\nProgrammers CompareTo: ");
		if(num1 == 0){
			System.out.println("TRUE! Compare works");
		}else{
			System.out.println("FALSE! WRONG!");
		}
		
		
		//Testing to see if Teacher from class A will work
		//With Programmer from class B by comparing
		if(programmer[0].name.equals(teacher[0].name) && programmer[0].id == teacher[0].id){
			System.out.println("\nProgrammer: " + programmer[0].name + " with ID: " + programmer[0].id + 
					" ===== " + "Teacher: " + teacher[0].name + " with ID: " + teacher[0].id );
		}else{
			System.out.println("THIS IS TOTALLY NOT TRUE!! SO WRONG!");
		}
		
		
	}

}
