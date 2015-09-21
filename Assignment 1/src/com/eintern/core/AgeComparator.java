//Q17
package com.eintern.core;

import java.util.Comparator;

public class AgeComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		int age1 = o1.getAge();
		int age2 = o2.getAge();

		return age2 - age1;
	}
}
