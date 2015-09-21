package com.eintern.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ArrayLists {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		
		String[] nums = {"10", "20", "30", "40", "50"};
		
		for(String num: nums){
			list.add(num);
		}
		
		System.out.println("List is: " + list);
		
		Set<String> set = new HashSet<String>(list);
		
		System.out.println("Set is: " + set);
	}
	
}
