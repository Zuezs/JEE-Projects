package com.eintern.examples;

public class VarArgsExample {

	public void fruitList(String fruit1, String fruit2)
	{
		System.out.println("There are 2 fruits");
		System.out.println("The fruits are " + fruit1 + " " + fruit2);
	}
	
	//Overload this method
	public void fruitList(String fruit1, String fruit2, String fruit3)
	{
		System.out.println("There are 3 fruits");
		System.out.println("The fruits are " + fruit1 + " " + fruit2 + " " + fruit3);
	}
	
	// Three dots behind the Variable type means it can take however many variables
	public void fruitList(String... fruits){
		
		System.out.println("The fruits are ");
		for(String fruit:fruits){
			
			System.out.println(fruit);
		}
	}
	
	public static void main(String[] args) {
		
		VarArgsExample obj1 = new VarArgsExample();
		
		obj1.fruitList("Apple", "Orange");
		obj1.fruitList("Apple", "Orange", "Banana");
		obj1.fruitList("Mango", "Pineapple", "Peach");
		obj1.fruitList("Mango", "Apple", "Orange", "Banana", "Pineapple", "Peach");
	}

}
