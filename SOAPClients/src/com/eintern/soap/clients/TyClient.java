package com.eintern.soap.clients;

import com.eintern.training.soap.service.RussellClass;
import com.eintern.training.soap.service.RussellClassServiceLocator;

public class TyClient {

	public static void main(String[] args) {
		
		RussellClassServiceLocator locator = new RussellClassServiceLocator();
		locator.setRussellClassEndpointAddress(locator.getRussellClassAddress());
		
		try{
			
			RussellClass stub = locator.getRussellClass();
			System.out.println(stub.getMessage());
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}
	
}
