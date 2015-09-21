package com.eintern.serialize;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializePerson {

	//Packing a object flattening into bytes and putting it into a file
	public void SerializeData(){
		
		try {
			FileOutputStream output = new FileOutputStream("person.ser");
			ObjectOutputStream out = new ObjectOutputStream(output);
			
			Person person1 = new Person(1, "Karan", 29);
			out.writeObject(person1);
			
			System.out.println("Record serialized!!!");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}
		
		
	}
	
	public static void main(String[] args) {
		
		SerializePerson data = new SerializePerson();
		data.SerializeData();
		
	}
	
	
}
