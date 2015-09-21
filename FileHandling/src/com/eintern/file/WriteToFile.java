package com.eintern.file;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {

	public void writeData(){
		
		BufferedWriter writer = null;
		
		try {
			writer = new BufferedWriter(new FileWriter("data.txt"));
			writer.write("This is the first line in the file.");
			writer.write("\r\n");
			writer.write("This is the second line in the file");
			System.out.println("File has been written!");
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		finally{
			try{
			writer.close();
			}catch(IOException e){
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		WriteToFile file1 = new WriteToFile();
		file1.writeData();
	}
	
	
}
