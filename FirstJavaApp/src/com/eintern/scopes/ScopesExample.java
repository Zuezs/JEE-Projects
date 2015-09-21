package com.eintern.scopes;

public class ScopesExample {

	//this is a static variable - shared by all objects of a class - can be accessed using class name
	private static int counter;
	
	//these are instance variables
	private double num1;
	private double num2;
	
	//No args constructor. Must have same name as the class
	public ScopesExample(){
		num1 = 10;
		num2 = 20;
		counter++;
	}
	
	//Constructor takes 2 args
	public ScopesExample(double num1, double num2){
		
		this.num1 = num1;
		this.num2 = num2;
		counter++;
		
	}
	
	public double sum(double num1, double num2){
		
		this.num1 = num1;
		this.num2 = num2;
		
		return num1 + num2;
	}
	
	public double mul(double num1, double num2){
		
		this.num1 = num1;
		this.num2= num2;
		
		//local variable
		double result = num1 * num2;
		
		return result;
	}
	
	public void printNums(){
		
		//this is a loop variable
		for(byte i = 0; i < 10; i++){
			System.out.print(i);
		}
	}
	
	public double sum(){
		return num1 + num2;
	}
	public double mul(){
		return num1 * num2;
	}
	
	public static void main(String[] args){
		
		ScopesExample example = new ScopesExample();
		ScopesExample example2 = new ScopesExample(29, 32.0);
		
		System.out.println("The sum of the numbers is " + example.sum(20.0, 10.3));
		System.out.println("The multi product is " + example.mul(2.2, 32.1));
		System.out.println("Sum is " + example2.sum() + " Multi is " + example2.mul());
		System.out.println(counter);
		
	}
}
