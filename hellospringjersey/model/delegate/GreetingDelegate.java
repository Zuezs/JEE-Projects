package com.eintern.spring.hellospringjersey.model.delegate;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.eintern.spring.hellospringjersey.data.dao.GreetingCrudRepository;
import com.eintern.spring.hellospringjersey.data.dao.GreetingDAO;
import com.eintern.spring.hellospringjersey.data.entity.Greeting;

@Component
public class GreetingDelegate {
	@Autowired
	private GreetingCrudRepository greetingCrud;
	@Autowired
	private GreetingDAO greetingDao;
	
	public String getGreeting() {
		return "Hello!";
	}
	
	public Greeting saveGreeting(Greeting greeting) {
		return greetingCrud.save(greeting);
	}
	
	public Iterable<Greeting> getAllGreetings() {
		return greetingCrud.findAll();
	}
	
	public Iterable<Greeting> getAllGreetingsByName(String name) {
		return greetingCrud.findAllByName(name);
	}

	public List<Greeting> getAllGreetingsByNameMoreThanThree() {
		return greetingDao.findGreetingsForNameWithMoreThanThree();
	}
}
