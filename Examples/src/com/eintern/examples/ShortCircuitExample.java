package com.eintern.examples;

public class ShortCircuitExample {

	public static void main(String[] args) {
		
		int x = 10;
		int y = 20;
		//checks both operators 
		//even if the first value false
		if(x > y | x > 8){
			 System.out.println("X is greater than Y");
		}
		
		//this is a short circuit operator
		//checks only one operator if false
		if(x > y || x > 8){
			System.out.println("X is greater than Y");
		}
	}

}
