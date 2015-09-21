package com.eintern.core;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;

public class Palindromes {

	public static void main(String[] args) {
		
	
	String[] stuff = {"karan", "madam", "tom", "civic", "radar", "sexes", "jimmy", "kayak", "john", "refer", "billy", "did"};
	
	ArrayList<String> array1 = new ArrayList<String>(Arrays.asList(stuff));
	ArrayList<String> palindrome = new ArrayList<String>();
	
	for(String data:array1){
		String reverse = new StringBuffer(data).reverse().toString();
		if(data.equals(reverse))
			palindrome.add(reverse);
		
		try{
			FileOutputStream fos = new FileOutputStream("palindrome.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(palindrome);
			oos.close();
		}catch(Exception e){
			e.printStackTrace();
		}
		}
	System.out.println(array1);
	System.out.println(palindrome);
	}
}