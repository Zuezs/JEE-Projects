package com.eintern.inheirtance;

public class Cat extends Animal implements Mammal{
	
	public void eat(){
		
		System.out.println("cat eats fish");
		
	}
	
	public void sound(){
		System.out.println("the cat meow");
	}

	@Override
	public void givesBirth() {
		// TODO Auto-generated method stub
		System.out.println("Cat gives birth to kittens");
	}
	
	
}
