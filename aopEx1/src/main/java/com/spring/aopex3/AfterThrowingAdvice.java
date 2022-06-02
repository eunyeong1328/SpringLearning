package com.spring.aopex3;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Service;

//�����߻� �� ����

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
	public void insertExceptPointcut() { //���� ����
		
	}
	
	public void afterThrowingAdviceLog() {
		System.out.println("[AfterThrowingAdvice] ����ó�� �߻��� ����Ǵ� �α�!!");
	}
	
	@AfterThrowing(pointcut = "insertExceptPointcut()", throwing = "exceptObj")
	public void afterThrowingLogExcept(JoinPoint jp, Exception exceptObj) {
		System.out.println("[AfterThrowingAdviceExcept] ����ó�� �߻��� ����Ǵ� �α�!!");
		String method = jp.getSignature().getName();
		System.out.println("[AfterThrowingAdviceExcept] method : " + method +
											", except Message : " + exceptObj);
		
	}
}
