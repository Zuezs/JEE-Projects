package com.eintern.wrappers;

public class Wrapper {

	//Static double method returns double 
	//Takes in String
	public static double splitNAdd(String nums){
		
		//String array equal String by splitting by ','
		String [] data = nums.split(",");
		double result = 0;
		
		//Loops thru data and parses data into double 
		//Adds to result
		for(String split : data){
			result = result + Double.parseDouble(split);
		}
		//Return sum of parsed numbers
		return result;	
	}
	
	public static void main(String[] args) {
		
		//String of numbers
		String numbers = "1,2,3";
		String numbers2 = "2,200,201,0.5";
		
		//Print statements calling method and inputting strings
		System.out.println("Input: " + numbers + "\nOutput: " + splitNAdd(numbers));
		
		System.out.println("Input: " + numbers2 + "\nOutput: " + splitNAdd(numbers2));
		
	}
	
}
