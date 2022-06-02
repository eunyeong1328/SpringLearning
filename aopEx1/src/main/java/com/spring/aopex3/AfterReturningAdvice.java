package com.spring.aopex3;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Service;

//<aop:pointcut expression="execution(* com.spring.aopex2..*Impl.insertBoardReturn(..))" 
//				id="insertReturnPointcut"/>

//<aop:aspect ref = "afterReturning">
//<aop:after-returning method = "afterReturningAdviceLogDo" 
//						pointcut-ref="insertReturnPointcut" 
//						returning="returnObj" />
//</aop:aspect>

@Service //객체만들기
//@Aspect
public class AfterReturningAdvice {
	public void afterReturningAdviceLog() {
		System.out.println("[AfterReturningAdvice] 포인트 컷 실행후에 advice 적용!!");
	}
	
	@Pointcut("execution(* com.spring.aopex3..*Impl.insertBoardReturn(..))")
	public void insertReturnPointcut() {
		
	}
	
	@AfterReturning(pointcut = "insertReturnPointcut()", returning = "returnObj")
	public void afterReturningAdviceLogDo(JoinPoint jp, Object returnObj) {
		String method = jp.getSignature().getName();
		if(returnObj instanceof BoardDo) {
			BoardDo bdo = (BoardDo) returnObj;
			System.out.println("[AfterReturningAdviceLogDo] method : " + method + 
					"returnObj 내용 "  + bdo.getSeq() + " , " + bdo.getTitle()) ; 
		}
	}


}
