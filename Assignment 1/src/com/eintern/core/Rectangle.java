//Assignment 2

package com.eintern.core;

public class Rectangle implements Interface{
	
	public double length;
	public double width;
	
	public Rectangle(double num1, double num2){
		this.length = num1;
		this.width = num2;
	}
	
	public double addition(double num1, double num2){
		this.length = num1;
		this.width = num2;
		return num1 + num2;
	};
	public double subtraction(double num1, double num2){
		this.length = num1;
		this.width = num2;
		return num1 - num2;
	};
	public double multiplication(double num1, double num2){
		this.length = num1;
		this.width = num2;
		return num1 * num2;
	};
	public double division(double num1, double num2){
		this.length = num1;
		this.width = num2;
		return num1 / num2;
	};
	
}
	
