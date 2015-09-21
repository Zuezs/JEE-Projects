//Q17
package com.eintern.core;

import java.util.Comparator;

public class NameComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		String name1 = o1.getName();
		String name2 = o2.getName();

		return name1.compareTo(name2);
		
	}


}
