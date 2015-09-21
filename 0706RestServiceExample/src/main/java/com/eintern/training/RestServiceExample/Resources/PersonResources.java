package com.eintern.training.RestServiceExample.Resources;

import java.net.URI;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.NotFoundException;
import javax.ws.rs.Path;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;

import com.eintern.training.RestServiceExample.Domains.Person;

import oracle.jdbc.OracleDriver;


@Path("/person")
public class PersonResources {

	Connection conn = null;
	
	@GET
	@Consumes("application/json")
	public Response insertPeople(@Context UriInfo url , Person person){
		
		String query = "INSERT INTO RestPerson VALUES(" + person.getFirstName() + " , "
														  + person.getLastName() + ")";
		
		String personID = "SELECT MAX(personID) from  RestPerson";
		Statement stmt = null;
		ResultSet results = null;
		String uriID = null;
		
		System.out.println("Recieved GET Request for PersonID = " + personID);
		
		openConnection();
		try{
			
			stmt =conn.createStatement();
			stmt.executeQuery(query);
			
			stmt = conn.createStatement();
			results = stmt.executeQuery(personID);
			
			results.next();
			
			uriID = results.getString(0);
				
		}catch(Exception e){
			System.out.println("Could not create or execute query:\n");
			System.out.println(query + "\n");
			e.printStackTrace();
		}
		
		
		return Response.created(URI.create("/0706RestServiceExample/services/person" + uriID)).build();
		
	}
	
	
	
	private void openConnection(){
		String dbURL = "jdbc:oracle:thin:@localhost:1521:xe";
		String name = "System";
		String password = "manager";
		
		try{
			DriverManager.registerDriver(new OracleDriver());
			conn = DriverManager.getConnection(dbURL, name, password); 
			
		}catch(Exception e){
			System.out.println("Could not open connection!");
			e.printStackTrace();
		}
		
	}
	
	private void closeConnection(){
		
		try{
			if(conn != null){
				conn.close();
			}
		}catch(Exception e){
			System.out.println("Could not close connection!");
			e.printStackTrace();
		}
	}
	
	@Override
	public void finalize(){
		
		closeConnection();
	}

}


