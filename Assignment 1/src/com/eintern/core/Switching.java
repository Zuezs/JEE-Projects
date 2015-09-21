//Question 11

package com.eintern.core;
import java.util.Date;
import java.util.Scanner;
import java.lang.Math; 

public class Switching {

	public static void main(String[] args) {
		
		Scanner userInput = new Scanner(System.in);
		
		System.out.println("1. Find square root of a number\n" + "2. Display todays date!\n" +"3. Split the following string:\n I am Learning core java");
		int choice = userInput.nextInt();
		switch(choice){
		case 1:
			System.out.println("Type a number in to find the square root:");
			int answer = userInput.nextInt();
			System.out.println("The square root of " + answer + " is " + Math.sqrt((double)answer));
			break;
		case 2:
			Date date = new Date();
			System.out.println(date.toString());
			break;
		case 3:
			String sentence = "I am Learning core java";
			String []sentences = sentence.split(" ");
			for(String sen:sentences){
				System.out.println(sen);
			}
			break;
		default:
			System.out.println("Invalid choice run program again!");
			break;
			
		}
	}

}
