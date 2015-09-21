package com.eintern.reflections;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Dog extends AnimalSpecies{

	public static String species;
	@Override
	public String species(String line) {
		
		
		return "I am a " + line ;
	}
	public static void main(String[] args) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		
		Dog dog = new Dog();
		species = dog.species("Dog");
		
		
		//Got it To WORK!!! DAMNNNN !
		//This line creates method type Method to grab a method out of the Dog
		//Class. First arg is the function that you want Second arg is the 
		//Type of parameter it takes
		Method method1 = Dog.class.getMethod("species", String.class);
		//This line converts the method invoke function which first arg
		//takes new instance of the animal species second arg
		//Is the value or string that is returned 
		String line = (String) method1.invoke(new Dog(), "Frog");
		//Prints the line
		System.out.println(line);
	}

}
