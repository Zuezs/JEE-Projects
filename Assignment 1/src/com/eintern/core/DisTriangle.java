//Question 8

package com.eintern.core;

public class DisTriangle {

	public static void main(String[] args) {
		
		String x = "1", y = "0";
		
		// Method found online
		String s = "";
		//Uses string to save previous data and
		//adds to the conditions
		System.out.println("Method found online which is more clean");
		for(int i = 1 ; i < 5 ; ++i) {
		    s = (i % 2 == 0 ? "1 " : "0 ") + s;
		    System.out.println(s);
		}
		System.out.println("\nNext function\n");
		
		//The way I programmed it and it works only in strings
		for(int i = 1; i < 5; i++){
				if(i == 2){
					System.out.println(x + y);
				}
				else if(i == 1){
					System.out.println(y);
				}
				else if(i % 3 == 0){
					System.out.println(x + y + x);
				}
				else if(i == 4){
					System.out.println(y + x + y + x);
				}
			}
		}
		
	}
