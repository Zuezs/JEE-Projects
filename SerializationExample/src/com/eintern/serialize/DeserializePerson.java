package com.eintern.serialize;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializePerson {
	
	
	//Unpacking the object  that was stored in a file in bytes 
	public void deserializeData(){
		
		Person per1 = null;
		FileInputStream input;
		
		try{
		input = new FileInputStream("person.ser");
		ObjectInputStream in = new ObjectInputStream(input);
		per1 = (Person)in.readObject();
		
		System.out.println(per1.getId() + " " + per1.getName() + " " + per1.getAge());
		System.out.println("File deserialized!!!");
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}
		
	}
	
	
	public static void main(String[] args) {
		
		DeserializePerson data = new DeserializePerson();
		data.deserializeData();
		
	
		
	}
	
}
