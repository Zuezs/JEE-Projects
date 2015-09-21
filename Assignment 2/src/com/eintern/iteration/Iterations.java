package com.eintern.iteration;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Iterations {
	
	//Create file reader
	BufferedReader reader;
	
	public List<String> readData(){
			//Create List that the file is going to be stored in
			List<String> store = new ArrayList<String>();
			
			try{
				//Reader that looks for txt
				//BuffRead reads characters FileReader characters
				reader = new BufferedReader(new FileReader("words.txt"));
				
				String line = null;
				
				//Reads through the file
				//line converts reader.readLine() to String
				//and while not empty
				//add the current string to ArrayList named store
				while((line = reader.readLine())!= null){
					
					store.add(line);
					//Prints the lines of the file
					System.out.println(line);
				}
			
				//Just shows the file execution
				System.out.println("File has been read!");
				
				//Exceptions in case file isnt found
			}catch(FileNotFoundException e){
				e.printStackTrace();
			}catch(IOException e){
				e.printStackTrace();
			}
			//returning the ArrayList store
			return store;
		}
	
	
	public static void main(String[] args) {
		
		//Creating ArrayList Iter and After
		List<String> Iter = new ArrayList<String>();
		List<String> After = new ArrayList<String>();
		
		//Creating instance of Iterations class to store method in Iter
		Iterations reader1 =  new Iterations();
		Iter = reader1.readData();
		
		//Shows list
		System.out.println("List is: " + Iter);
		
		//Creating Iterator loop through ArrayList Iter
		Iterator<String> it = Iter.iterator();
		
		//while it has a next value
		while(it.hasNext()){
			
			//line equals the next value store while there is a next value
			String line = it.next();
			//Created temp to equal line substring
			String temp;
			int counter = 0;
			
			//self explanatory
			//line is the current string in the ArrayList Iter
			if(line.substring(0,2).contains("ap")){
				
				System.out.println(line.substring(0,2) + " Index: " + line);
				
				//Temp equals line 
				temp = line.substring(2);
				After.add(temp);
				it.remove();
				counter++;
			}
			if(line.substring(0,2).contains("ba")){
				
				System.out.println(line.substring(0,2) + " Index: " + line);

				temp = line.substring(2);
				After.add(temp);
				it.remove();
				counter++;
			}
			if(line.substring(0,1).contains("e")){
				
				System.out.println(line.substring(0,1) + " Index: " + line);

				temp = line.substring(1);
				After.add(temp);
				it.remove();
				counter++;
			}
			if(line.substring(0,1).contains("u")){
				
				System.out.println(line.substring(0,1) + " Index: " + line);

				temp = line.substring(1);
				After.add(temp);
				it.remove();
				counter++;
			}
		}
		
		System.out.println("New Iter List: " + Iter + " Should be empty");
		System.out.println("After List with added values: " + After);
		
		for(String Aft: After){
			Iter.add(Aft);
		}
		System.out.println("New Iter List: " + Iter);
		
	}

}
