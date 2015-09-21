//Question 10

package com.eintern.core;

public class Operators {

	public static void main(String[] args) {
		
		double x = 20 , y = 15;
		
		double z = min(x, y);
		
		System.out.println("Minimum number is: " + z);
		
	}
	
	public static double min(double x, double y){
		if(x < y){
			return x;
		}else{
			return y;
		}
	}

}
