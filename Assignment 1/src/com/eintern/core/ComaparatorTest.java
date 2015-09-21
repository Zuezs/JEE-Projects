//Q17
package com.eintern.core;

import java.util.Arrays;

public class ComaparatorTest {

	public static void main(String[] args) {
		
		Employee employee[] = new Employee[3];
		
		employee[0] = new Employee();
		employee[1] = new Employee();
		employee[2] = new Employee();
		
		employee[0].setAge(23); 
		employee[0].setName("Tyron");
		employee[0].setDepartment("IT");
		
		employee[1].setAge(32);
		employee[1].setName("Allen");
		employee[1].setDepartment("Computer Science");
		
		employee[2].setAge(90);
		employee[2].setName("Old Mann");
		employee[2].setDepartment("The Grey Wizard");
		
		System.out.println("Before Sort: ");
		for(Employee e:employee){
			System.out.println(e.toString());
		}
		
		//This sort in the library takes Arrays.sort(array, <T>)
		Arrays.sort(employee, new NameComparator());
		System.out.println("\nAfter Name Sort:");
		//Should be changed after the name comparator
		for(Employee e:employee){
			System.out.println(e.toString());
			//System.out.println(e);
		}
		
		Arrays.sort(employee, new AgeComparator());
		System.out.println("\nAfter Age Sort:");
		for(Employee e:employee){
			System.out.println(e.toString());
		}
		
		Arrays.sort(employee, new DepartmentComparator());
		System.out.println("\nAfter Department Sort:");
		for(Employee e:employee){
			System.out.println(e.toString());
		}

	}

}
