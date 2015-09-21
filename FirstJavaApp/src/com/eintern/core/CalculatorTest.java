package com.eintern.core;

public class CalculatorTest {

	public static void main(String[] args) {
		
		Calculator calculateObj1 = new Calculator();
		
		calculateObj1.setNum1(10);
		calculateObj1.setNum2(20);
		
		System.out.println("The sum is " + calculateObj1.sum());
		System.out.println("The difference is " + calculateObj1.sub());
		System.out.println("The multiproduct is " + calculateObj1.mul());
		System.out.println("The division is " + calculateObj1.div());
		
		
	}
	
	
}
