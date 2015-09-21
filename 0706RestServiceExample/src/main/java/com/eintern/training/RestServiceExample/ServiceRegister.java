package com.eintern.training.RestServiceExample;

import java.util.HashSet;
import java.util.Set;

import com.eintern.training.RestServiceExample.Resources.PersonResources;

public class ServiceRegister {
	
	private Set<Object> singletons = new HashSet<>();
	private Set<Class> instanced = new HashSet<>();
	
	public  ServiceRegister(){
		instanced.add(PersonResources.class);
		
	}

	public Set<Object> getSingletons() {
		return singletons;
	}

	public Set<Class> getInstanced() {
		return instanced;
	}

	
	
}
