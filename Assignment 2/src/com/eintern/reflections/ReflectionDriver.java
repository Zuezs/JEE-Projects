package com.eintern.reflections;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class ReflectionDriver {
	

	public static void main(String[] args) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchFieldException {
		
		//
		Class<Dog> myReflection = Dog.class;
		
		//Prints name with the package
		String className = myReflection.getName();
		System.out.println(className);
		
		//Prints name without package
		String simple = myReflection.getSimpleName();
		System.out.println(simple);
		
		//Prints modifiers
		int modifiers = myReflection.getModifiers();
		System.out.println(modifiers);
		
		Method[] methods = myReflection.getMethods();
		System.out.println(methods);
		
		Method method1 = myReflection.getClass().getMethod("main");
		method1.invoke(myReflection, "Dog");
		System.out.println(myReflection);
		
		Field[] method = myReflection.getFields();
		Field field = myReflection.getField("species");
		
		System.out.println(method);
		System.out.println(field);
		
	
	}

}
