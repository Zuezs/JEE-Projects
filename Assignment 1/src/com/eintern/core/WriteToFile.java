//Question 14
package com.eintern.core;

import java.io.*;
import java.util.*;


public class WriteToFile {
		
	
		//Reading file from Datatxt and Writing to Data2.txt
		//Found great example on Overstack to make code efficient
	
	    public static void main(String args[]) {
	        FileReader fr = null;
	        FileWriter fw = null;
	        try {
	            fr = new FileReader("Data.txt");
	            fw = new FileWriter("Data2.txt");
	            int c = fr.read();
	            while(c!=-1) {
	                fw.write(c);
	                c = fr.read();
	            }
	        } catch(IOException e) {
	            e.printStackTrace();
	        } finally {
	            close(fr);
	            close(fw);
	        }
	    }
	    public static void close(Closeable stream) {
	        try {
	            if (stream != null) {
	                stream.close();
	            }
	        } catch(IOException e) {
	            //...
	        }
	    }
	
}


