package com.eintern.spring.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LoggingAspect {
	
	/*@Before("allCircleMethods()")
	public void LoggingAdvice(JoinPoint joinPoint){
		
		//System.out.println(joinPoint.getTarget());
	}
	
	@AfterReturning(pointcut="args(name)", returning="returnString") //must match property name
	public void stringArgumentMethods(String name, String returnString){
		//Needs argument that is passed to the target method
		//Argument needs to be passed to adivce
		//Argument is type String//Needs argument for th//Needs argument for the target methode target method
		System.out.println("A method that takes String arguments has been called! Value is " + name + " The output value is " + returnString);
	}
	
	@AfterThrowing("args(name)")
	public void exceptionAdvices(String name){
		System.out.println("An exception has been thrown");
	}
	
	@Around("allGetters()")
	public void myAroundAdvice(ProceedingJoinPoint proceedingJoinPoint){
		
		try {
			System.out.println("Before Advice");
			
			//Target execution method happens here
			//We can skip target execution entirely
			proceedingJoinPoint.proceed();
			System.out.println("After Returning");

		} catch (Throwable e) {
			System.out.println("After Throwing");
			e.printStackTrace();
		}
		
		System.out.println("After finally");
		
	}
	
	@Pointcut("execution(* get*())")
	public void allGetters(){
		
	}
	@Pointcut("within(com.eintern.spring.model.Circle)")
	public void allCircleMethods(){
		
	}*/
}
