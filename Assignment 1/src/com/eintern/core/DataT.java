//Question 12

package com.eintern.core;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;

public class DataT {

	public static void main(String[] args) {
		
		
		Scanner dataScanner = null;
		ArrayList<String> dataList = new ArrayList<String>();
		File dFile = new File("Data.txt");
		
		try{
			dataScanner = new Scanner(dFile);
			String sentence = dataScanner.nextLine();
			String [] data = sentence.split(":");

			//while(dataScanner.hasNextLine()){
				do {
					
					
					
					
				if(data[0].equals("Mickey")){
					dataList.add(dataScanner.nextLine());
					System.out.println("Name: " + data[0] + " " + data[1] +
							"\nAge: " + data[2] + " years" + "\nState: " + data[3] + " State");
					
				}
				if(data[0].equals("Hulk")){
					dataList.add(dataScanner.nextLine());
					System.out.println("Name: " + data[0] + " " + data[1] +
							"\nAge: " + data[2] + " years" + "\nState: " + data[3] + " State");
					
				}
				if(data[0].equals("Rodger")){
					dataList.add(dataScanner.nextLine());
					System.out.println("Name: " + data[0] + " " + data[1] +
							"\nAge: " + data[2] + " years" + "\nState: " + data[3] + " State");
					
				}
				if(data[0].equals("Wonder")){
					dataList.add(dataScanner.nextLine());
					System.out.println("Name: " + data[0] + " " + data[1] +
							"\nAge: " + data[2] + " years" + "\nState: " + data[3] + " State");
					
				}
				 
				// while(dataScanner.hasNextLine()){
			}while(dataScanner.next() != null);	
		}
		catch(FileNotFoundException e){
			System.out.println("File not found");
			System.exit(0);
		}
		

	
	}
}
