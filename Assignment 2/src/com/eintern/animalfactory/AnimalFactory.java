// Question 6 & 6
package com.eintern.animalfactory;

import java.util.Scanner;

//Class extends exception because we want to create
//Custom exception by making a constructor that calls
//super message and throws new AnimalFactory
public class AnimalFactory extends Exception{

	//main method with Exception thrown on it
	public static void main(String[] args) throws Exception{
		// Creating data Scanner to take user Input
		Scanner data = new Scanner(System.in);

		//try and catch block only because we are throwing the exception in Main 
		try{
			//Menu for options for the user
			System.out.println("Which animal would you like to create?"
					+ " \n2. Chicken \n4. Horse \n6. Insect \n8. Spider \n100. Centipede");
			//creating a int to store answer in
			int answer = data.nextInt();
			//creating string to store animal in after user Input
			String line = createAnimal(answer);
			
			//if line empty throw exception 
			//other than that print animal
			if(line.isEmpty()){
				throw new AnimalFactory("The input for animal creation is incorrect!");
			}else{
				System.out.println(createAnimal(answer));
				}		
		}catch(Exception e){
			e.printStackTrace();
			}
		}

	//Custom exception made here with Animal factory constructor
	//super message
	public AnimalFactory(String message){
		super(message);
	}
	
	//method to create animal based off legs
	public static String createAnimal(int legs){
		
		String animal = "";
		
		if(legs == 2){
			animal = "Chicken";
		}else if(legs == 4){
			animal = "Horse";
		}else if(legs == 6){
			animal = "Insect";
		}else if(legs == 8){
			animal = "Spider";
		}else if (legs == 100){
			animal = "Centipede";
		}
		
		return animal;
	}
	
	
}
