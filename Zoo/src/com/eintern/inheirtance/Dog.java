package com.eintern.inheirtance;

public class Dog extends Animal implements Mammal {
	
	@Override
	public void eat(){
		System.out.println("The dog eats meat");
	}
	
	public void run(){
		
		System.out.println("The dog runs");
	
	}
	
	public void sleep(){
		System.out.println("The dog sleeps");
	}

	@Override
	public void givesBirth() {
		System.out.println("Dogs gives birth to a puppy");
	}
	

}
