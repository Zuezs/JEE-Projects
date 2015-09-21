package com.eintern.spring.hellospringjersey.service;

import java.util.List;

import javax.inject.Singleton;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;

import com.eintern.spring.hellospringjersey.data.entity.Greeting;
import com.eintern.spring.hellospringjersey.model.delegate.GreetingDelegate;

@Service
@Singleton
@Path("/greeting")
public class GreetingService {
	@Autowired
	private GreetingDelegate greetingDelegate;
	
	public GreetingService() {
		System.out.println("Constructed");
	}
	
	@GET
	@Produces(MediaType.TEXT_PLAIN_VALUE)
	public Response getGreeting() {
		return Response.ok(greetingDelegate.getGreeting()).build();
	}
	
	@GET
	@Path("/report/all")
	@Produces(MediaType.TEXT_PLAIN_VALUE)
	public Response getAllGreetings() {
		StringBuilder report = new StringBuilder();
		Iterable<Greeting> greetings = greetingDelegate.getAllGreetings();
		for (Greeting g : greetings) {
			report.append(g.toString() + "\n");
		}
		return Response.ok(report.toString()).build();
	}
	
	@GET
	@Path("/report/{name}")
	@Produces(MediaType.TEXT_PLAIN_VALUE)
	public Response getAllGreetingsForName(@PathParam("name") String name) {
		StringBuilder report = new StringBuilder();
		Iterable<Greeting> greetings = greetingDelegate.getAllGreetingsByName(name);
		for (Greeting g : greetings) {
			report.append(g.toString() + "\n");
		}
		return Response.ok(report.toString()).build();
	}
	
	@GET
	@Path("/report/morethanthree")
	@Produces(MediaType.TEXT_PLAIN_VALUE)
	public Response getAllGreetingsForNameMoreThanThree() {
		StringBuilder report = new StringBuilder();
		List<Greeting> greetings = greetingDelegate.getAllGreetingsByNameMoreThanThree();
		for (Greeting g : greetings) {
			report.append(g.toString() + "\n");
		}
		return Response.ok(report.toString()).build();
	}
}
