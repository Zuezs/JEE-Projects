//Question 13

package com.eintern.core;
import java.util.Scanner;
import java.util.ArrayList;

public class ArrayListEx {

	public static void main(String[] args) {
		
		//Created the arrayList type Integer
		ArrayList<Integer> nums = new ArrayList<>();
		
		//Print statement
		System.out.println("ArrayList: ");
		//for loop adds info to ArrayList
		for(int i = 1; i <= 10; i++){
			nums.add(i);
		}//This is how you print the whole ArrayList
		System.out.println(nums);
		
		//Numbers needed to get different totals
		int evenTotal = 0;
		int oddTotal = 0;
		
		System.out.println("\nEven numbers: ");
		//For loop to get the even numbers and print them
		//Also gets even total
		for(int number:nums){
			
			if((number % 2) == 0){
				
				System.out.println(number);
				evenTotal = evenTotal + number;
			};
			
		}
		System.out.println("Even number total is " + evenTotal);	
		
		System.out.println("\nOdd numbers: ");
		//Odd numbers and total
		for(int number:nums){
				//if not even used remainder not equal to 0
			if(!((number % 2) == 0)){
				
				System.out.println(number);
				oddTotal = oddTotal + number;
			};
		}
		System.out.println("Odd number total is " + oddTotal);
		
		//Prime numbers
		/*System.out.println("Prime numbers are: ");
		for(int number:nums){
			int myPrime = checkPrime(number) ? 1 : 0;
			System.out.println(myPrime);
		}*/
		
		//Uses true values to get rid of prime values
		boolean isPrime = false;
		for(int i = 0; i < nums.size(); i++){
				//if number never has remainder of 0 besides itself
				isPrime = checkPrime(nums.get(i));
				if(isPrime){
					nums.remove(i);
				}
			}
		System.out.println("\n  New ArrayList No Primes: ");
		System.out.println("\n" + nums);
	}

	//Method that checks for Prime numbers
	//StackOverflow
	static boolean checkPrime(int n){
		for(int i = 2; i < n; i++){
			if(n % i == 0){
				return false;
			}
		}
		return true;
	}
}
