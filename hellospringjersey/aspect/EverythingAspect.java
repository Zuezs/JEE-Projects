package com.eintern.spring.hellospringjersey.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class EverythingAspect {
	@Pointcut("execution(* *(..))")
	public void watchEverything() {}
	
	@Before("watchEverything()")
	public void beforeCalls(JoinPoint jp) {
		String name =
				jp.getTarget().getClass().getName()
					+ "."
					+ jp.getSignature().getName();
		System.out.println("Before calling method " + name);
	}
	
	@After("watchEverythingCalls()")
	public void afterCalls(JoinPoint jp) {
		String name =
				jp.getTarget().getClass().getName()
					+ "."
					+ jp.getSignature().getName();
		System.out.println("After calling method " + name);
	}
}
