package com.eintern.inheirtance;

public class AnimalTest {

	public static void main(String[] args) {
		
		
		Animal animal1 = new Cat();
		Animal animal2 = new Dog();
		
		animal1.eat();
		animal2.eat();
		
		animal1.sleep();
		animal2.sleep();
		
		//only objects created from CAT and DOG NOT Animal
		//Can Use GiveBirth function
		Cat cat1 = new Cat();
		Dog dog1 = new Dog();
		cat1.givesBirth();
		dog1.givesBirth();
		
		
		
		
	}
	
}
