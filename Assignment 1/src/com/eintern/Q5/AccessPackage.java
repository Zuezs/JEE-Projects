package com.eintern.Q5;

import com.eintern.core.Interest;


public class AccessPackage {

	public static void main(String[] args) {
		
		Interest accessInfo = new Interest(20, 1.25, 50);

		
		System.out.println("The principal amount is " + accessInfo.principal);
		System.out.println("The rate amount is " + accessInfo.rate);
		System.out.println("The time amount is " + accessInfo.time);
		System.out.println("The simple interest amount is " + accessInfo.interestOwed());
	}

}
