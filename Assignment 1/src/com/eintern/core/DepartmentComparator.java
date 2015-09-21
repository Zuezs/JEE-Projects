//Q17
package com.eintern.core;

import java.util.Comparator;

public class DepartmentComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		String department1 = o1.getDepartment();
		String department2 = o2.getDepartment();

		return department1.compareTo(department2);
	}
}
