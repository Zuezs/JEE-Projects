package com.google.challenges;

import java.util.ArrayList;
import java.util.List;

public class Answer{

	public static void main(String [] args) {
		int y = 565756745;
		int x = answer(y);
		//System.out.println("Answer is: " + y);
	} 
	public static int answer(int x) { 

		try{
		// Your code goes here.
	        int size = 0;
	        String numberX;
	        
	        //Changed
	        numberX = Integer.toString(x);
	        size = numberX.length();
	        int sum = 0;
	        List<Integer> numbers = new ArrayList<Integer>();
	        int numArray = Integer.parseInt(numberX);
	        numbers = digits(numArray);
	        
	        
	       //System.out.println(numbers);
	        
	        	while(size > 1){
		            for(int i = 0; i < size; i++){
		            	sum = numbers.get(i) + sum;	
		            }
		           // System.out.println("Total is: " + sum);
		            String sumArray = Integer.toString(sum);
		            size = sumArray.length();
	            	numbers = digits(sum);
	            	sum = 0;
	            }
	        //System.out.println(numbers);
	        x = numbers.get(0);
	        return x;
	        }
		catch(ArithmeticException exception)
		{
			System.out.println("Cannot divide by zero. Please check the denominator");
			exception.printStackTrace();
			//return false;
		}
		catch(ArrayIndexOutOfBoundsException aioobException)
		{
			System.out.println("Index is out of bounds");
			aioobException.printStackTrace();
			//return false;
		}catch(Exception e){
	        	e.printStackTrace();
    }
			//return numArray;
		return x;
	    } 
		public static List<Integer> digits(int i) {
			List<Integer> digits = new ArrayList<Integer>();
		    while(i > 0) {
		        digits.add(i % 10);
		        i /= 10;
		    }
		    return digits;
		}
	
	
}
