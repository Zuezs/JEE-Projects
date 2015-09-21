package com.eintern.file;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFromFile {

	BufferedReader reader;
	
	public void readData(){
		
		try{
			reader = new BufferedReader(new FileReader("data.txt"));
			
			String line = null;
			
			while((line = reader.readLine())!= null){
				
				System.out.println(line);
			}
		
			System.out.println("File has been read!");
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		ReadFromFile readFile1 = new ReadFromFile();
		readFile1.readData();
	}
	
}
