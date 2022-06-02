package com.spring.aopex3;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Service;

//에러발생 시 실행

//<aop:pointcut expression ="execution(* com.spring.aopex2..*Impl.insertBoardExcept(..))" 
//					    id ="insertExceptPointcut"/>

//<aop:aspect ref = "afterThrowing">
//<aop:after-throwing method = "afterThrowingLogExcept" 
//					pointcut-ref="insertExceptPointcut" 
//					throwing="exceptObj" />
//</aop:aspect> 

@Service
//@Aspect
public class AfterThrowingAdvice {
	
	@Pointcut("execution(* com.spring.aopex3..*Impl.insertBoardExcept(..))")
	public void insertExceptPointcut() { //선언만 해줌
		
	}
	
	public void afterThrowingAdviceLog() {
		System.out.println("[AfterThrowingAdvice] 예외처리 발생시 실행되는 로그!!");
	}
	
	@AfterThrowing(pointcut = "insertExceptPointcut()", throwing = "exceptObj")
	public void afterThrowingLogExcept(JoinPoint jp, Exception exceptObj) {
		System.out.println("[AfterThrowingAdviceExcept] 예외처리 발생시 실행되는 로그!!");
		String method = jp.getSignature().getName();
		System.out.println("[AfterThrowingAdviceExcept] method : " + method +
											", except Message : " + exceptObj);
		
	}
}
