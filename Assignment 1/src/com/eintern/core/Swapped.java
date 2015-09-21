//Question 9
package com.eintern.core;

public class Swapped {

	
	public static void main(String[] args) {

		String x = "Tyron Darnay " , y = "Allen Jr";
		System.out.println("Before swap: ");
		System.out.println("X: " + x + " Y: " + y);
		String z = swap(x,y);
		System.out.println("After swap: ");
		System.out.println("X: " + z);
	}

	private static String swap(String x, String y) {
		int xSize = x.length();
		x = x + y;
		x = x.substring(xSize);
		
		return x;
	
	}

}
