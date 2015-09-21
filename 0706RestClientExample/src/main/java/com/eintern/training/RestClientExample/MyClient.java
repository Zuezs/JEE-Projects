package com.eintern.training.RestClientExample;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;

public class MyClient {

	public static void main(String[] args) {
		
		//URL that request are sent to 
		String url = "http://192.168.60.36:8080/0706RestServiceExample/services/person";
		
		String jsonPerson = "{\"first_name\":\"Ty\"," +
							"\"last_name\":\"Allen\"}";
		
		//Our Factory , parameters already set
		Client client = ClientBuilder.newClient();
		
		//Representation of service we are connecting to as a object,
		//Takes url and creates a proxy or emulation
		WebTarget target = client.target(url);
		
		
		//Builds HTTPs request get http request, .get actually sends request to the server
		//Stored response in string, String .class - that data type produced
		
			System.out.println("Attempting to insert: \n" + jsonPerson);
			//POST json Person to Service
			Response response = target.request().post(Entity.json(jsonPerson));
			
			if(response.getStatus() != 201){
				System.out.println("Could not create!");
			}
			
			String location = response.getLocation().toString();
			
			// GET person previously POSTED to service
			target = client.target(location);
			String resp = target.request().get(String.class);
		
		
		System.out.println("Successfully Inserted:\n" + resp);
		
	}
	
}
