//Question 2
package com.eintern.core;

import java.util.Scanner;

public class Interest {

	public double principal;
	public double rate;
	public double time;
	//private double interest;
	
	public Interest(double Principal, double Rate, double Time){
		this.principal = Principal;
		this.rate = Rate;
		this.time = Time;
			
	}
	
	public double interestOwed(){
		
		return principal * rate * time;
	}
	
	
	public static void main(String[] args) {
		
		Scanner userInput = new Scanner(System.in);
		
		double principal;
		double rate;
		double time;
		
		System.out.println("Enter the principal number: ");
		principal = Double.parseDouble(userInput.nextLine());
		
		System.out.println("Enter the rate number: ");
		rate = Double.parseDouble(userInput.nextLine());
		
		System.out.println("Enter the number of years: ");
		time = Double.parseDouble(userInput.nextLine());
		
		Interest interestValue = new Interest(principal, rate, time);		
		
		System.out.println("Your simple interest amount is " + interestValue.interestOwed());
		
	}

}
