package com.eintern.spring.hellospringjersey.model.delegate;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.eintern.spring.hellospringjersey.data.dao.MultiGreetingCrudRepository;
import com.eintern.spring.hellospringjersey.data.entity.MultiGreeting;

@Component
public class MultiGreetingDelegate {
	@Autowired
	private MultiGreetingCrudRepository greetingCrud;
	
	public MultiGreeting saveGreeting(MultiGreeting greeting) {
		return greetingCrud.save(greeting);
	}
	
	public Iterable<MultiGreeting> getAllGreetings() {
		return greetingCrud.findAll();
	}
	
	public Iterable<MultiGreeting> getAllGreetingsByName(String name) {
		return greetingCrud.findAllByName(name);
	}
}
