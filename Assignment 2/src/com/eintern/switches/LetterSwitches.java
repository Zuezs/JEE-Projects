package com.eintern.switches;

import java.io.IOException;
import java.util.Scanner;

public class LetterSwitches {

	

	public static void main(String[] args){
		
		//Creating constants for the letters
		final String A =  "1";
		final char B = 2;
		final char C = 3;
		final char D = 4;
		final char E = 5;
		final char F = 6;
		final char G = 7;
		final char H = 8;
		final char I = 9;
		final char J = 10;
		final char Q = 50;
		int a = 0;
		
		//Creating the scanner instances
		Scanner userInput = new Scanner(System.in); 
		
		System.out.println("Choose your letter to add the counte or Q to quit! ");
		
		int counter = 0;
		String choice = userInput.next(); 
		//char letter = choice.charAt(0);
	
		boolean loop = true;
		//int value = 6;
		while(loop){
			
			switch(choice){
						
				case "A": 
					//FallThrough intended
					System.out.println("The input A was choosen falls through");
					counter = counter + 1;
					loop = true;
					
					//choice = userInput.next();
					
				case "B":
					//Fall Through intended
					System.out.println("The input B was choosen falls through");
					counter = counter + 2;
					loop = true;
					//choice = userInput.next();
					
				case "C":
					System.out.println("The input C was choosen ");
					counter = counter + 3;
					loop = false;
					break;
					
				case "D":
					System.out.println("The input D was choosen ");
					counter = counter + 4;
					//loop = false;
					break;
					
				case "E":
					System.out.println("The input E was choosen ");
					counter = counter + 5;
					break;
					
				case "F":
					System.out.println("The input F was choosen ");
					counter = counter + 6;
					break;
					
				case "G":
					System.out.println("The input G was choosen ");
					counter = counter + 7;
					break;
					
				case "H":
					System.out.println("The input H was choosen ");
					counter = counter + 8;
					break;
					
				case "I":
					System.out.println("The input I was choosen ");
					counter = counter + 9;
					break;
					
				case "J":
					System.out.println("The input J was choosen ");
					counter = counter + 10;
					break;
					
				default:
					//loop = true;
					System.out.println("Default case");
					loop = false;
					break;
				
				}
			if(choice.contains("A") || choice.contains("B")){
				loop = true;
				choice = userInput.next();
			}else{
				loop = false;
			}
			
			}
		System.out.println("Total Output: " + counter);
		
	}
	
	
	
	
}
