package com.eintern.interfaceEx;

import java.util.Scanner;

public class ShapeTest {

	
	public static void main(String[] args) {
		
		Scanner userInput = new Scanner(System.in);
		String answer;
		
		System.out.println("Please choose a Shape! ");
		System.out.println("1. Square\n"
				+ "2. Rectangle\n" + "3. Triangle\n" + "4. Circle\n" + "5. Exit");
		
		while(userInput.hasNext()){
			
			answer = userInput.next();
			if(answer.contains("1")){
				Square square1 = new Square();
				square1.height = 10; square1.width = 15;
				System.out.println("The area of the square is " + square1.area());
			}else if(answer.contains("2")){
				Rectangle rectangle1 = new Rectangle();
				rectangle1.height = 20; rectangle1.width = 10;
				System.out.println("The area of the rectangle is " + rectangle1.area());
				
			}else if(answer.contains("3")){
				Triangle triangle1 = new Triangle();
				triangle1.base = 40; triangle1.height = 15;
				System.out.println("The area of the triangle is " + triangle1.area());
			}else if(answer.contains("4")){
					Circle circle1 = new Circle();
					circle1.radius = 15;
					System.out.println("The are of the circle is " + circle1.area());
			}
			else if(answer.contains("5")){
				break;
			}
			else{
				System.out.println("Incorrect Input, Please Select Values 1 - 5. Thanks ");
			}
			
			
		}
		
		System.out.println("Thanks for Playing!");
	}
		
		
}
	
