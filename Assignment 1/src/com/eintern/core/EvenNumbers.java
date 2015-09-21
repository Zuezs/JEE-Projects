//Question 7

package com.eintern.core;

public class EvenNumbers {

	public static void main(String[] args) {
			
			//Creates int array object
			int [] nums = new int[100];
			int x = 0;
			
			// First for loop stores values 1 to 100
			//inside of the nums array
			for(int i = 1; i <= 100; i++){
				nums[x] = i;
				//Error checking Elements and numbers
				System.out.println("Element: " + nums[x] + " Number: " + i);
				x += 1;	
			}
			
			//Enhanced loop takes nums and prints only 
			//Even numbers by using mod 2 remainder 0
			System.out.println("\nEven numbers are: ");
			for(int temp:nums){
				if( temp % 2 == 0)
					System.out.println(temp);
			}
	}

}
