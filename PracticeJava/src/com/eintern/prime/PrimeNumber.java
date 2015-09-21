package com.eintern.prime;

public class PrimeNumber {

	public static void main(String[] args) {
		
		int x = 7;
		int y = 4;
		
		System.out.println(isPrime(x));
		System.out.println(isPrime(y));
		
	}
	
	static boolean isPrime(int number){
		
		if(number < 0){
			return false;
		}
		for(int i =2; i < number; i++){
			if(number % i == 0){
				return false;
			}
		}
	return true;
	}
}
