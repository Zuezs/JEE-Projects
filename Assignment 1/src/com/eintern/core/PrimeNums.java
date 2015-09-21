//Question 16

package com.eintern.core;

public class PrimeNums {

	public static void main(String[] args) {
		
		
		String primeNs = "";
		int num = 0;
		
		for(int i = 1; i <= 100; i++){
			int counter = 0;

			for(num = i; num >= 1; num--){
				if((i % num) == 0){
					counter = counter + 1;
				}
			}
			if(counter == 2){
				primeNs = primeNs + i + ",";
			}
		}
		
		System.out.println("Prime Numbers: ");
		System.out.println(primeNs);
	}

}
