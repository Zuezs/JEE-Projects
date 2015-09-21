package com.eintern.examples;

public class LoopExamples {

	public static void main(String[] args) {
		
		int [] nums = new int [4];

		nums[0] = 10;
		nums[1] = 20;
		nums[2] = 30;
		nums[3] = 40;
		
		int [] nums2 = {2,3,4,5};
		
		//classic for loop
		for(byte i = 0; i < nums.length; i++){
			System.out.println(nums[i]);
			
			//example of break
			if(nums[i] == 30){
				break;
			}
			
			//example of continue
			if(nums[i] == 10){
				continue;
			}
			
		}
		
		//enhanced for loop - for each - Java 1.5
		for(int temp:nums2){
			System.out.println(temp);
		}
		
		int num1 = 10;
		int num2 = 20;
		System.out.println("Sum is " + (num1 + num2));
		
		while(nums.length!=0){
			System.out.println(nums);
			break;
		}
		
		//ternery operator if true else false
		boolean result = (num2>num1)?true:false;

	} 

}
