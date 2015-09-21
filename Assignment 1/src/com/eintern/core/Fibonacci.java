//Question 6

package com.eintern.core;

public class Fibonacci {

	//Recursive method found online
	/*public static int recursiveFib(int num){
		
		if(num == 1 || num == 2){
			return 1;
		}
		return recursiveFib(num - 1) + recursiveFib(num - 2);
		
	}*/
	
	public static void main(String[] args) {
	
		int a = 0;
		int b = 1;
		int [] array = new int[25];
		for(int i = 0; i < 15; i++){
			
			array[i] = a;
			System.out.println(a + "-");
			a = a + b;
			b = a - b;
			if(a >= 100){
				break;
			}
		}
		
		
	}

}
