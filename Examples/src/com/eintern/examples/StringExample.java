package com.eintern.examples;

public class StringExample {

	public static void main(String[] args) {

		String name  = "Karan";
		String name1 = new String("Karan");
		//String name1 = "Karan";
		
		
		System.out.println(name==name1);
		System.out.println(name.equals(name1));
		
		//creates a new object. Anytime the values changes
		System.out.println(name.toUpperCase());
		
		StringBuffer fname = new StringBuffer("Karan");
		fname.append("Dhirar");
		System.out.println(fname);
		System.out.println(fname.reverse());
		 
		
		
	}

}
