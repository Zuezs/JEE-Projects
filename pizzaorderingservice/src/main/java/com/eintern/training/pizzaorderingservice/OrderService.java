package com.eintern.training.pizzaorderingservice;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;


@Path("/order")
public class OrderService {

		@POST
		@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
		@Produces(MediaType.APPLICATION_JSON)
		public Response orderPizza(){
			
			String response = "{\"accepted\":true,"
					+ "\"maker\":\"Jorge\","
					+ "\"eta\":\"An hour from now\"}";
			
			
			return Response.ok(response).build();
		}
	
	
}
