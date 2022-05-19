package com.spring.aopex2;

import org.aspectj.lang.ProceedingJoinPoint;

public class AroundAdvice {
	public Object aroundAdvice(ProceedingJoinPoint pjp) throws Throwable {
		
		System.out.println("[AroundAdvice] 비즈니스 실행 전에 실행되는 로그!!");
		//Main로직을 여기서 불러오자!!
		Object retObj = pjp.proceed(); //비즈니스로직 불러와서 실행됨 
				
		System.out.println("[AroundAdvice] 비즈니스 실행 전에 실행되는 로그!!");
		
		return retObj;
	}

}
