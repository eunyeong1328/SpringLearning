package com.spring.aopex3;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Service;
import org.springframework.util.StopWatch;

//<aop:pointcut expression="execution(* com.spring.aopex2..*Impl.insert*(..))" 
//						id="insertPointcut"/>

//<aop:aspect ref = "around">
//<aop:around method = "aroundAdvice" pointcut-ref="insertPointcut" />
//</aop:aspect>

@Service
//@Aspect
public class AroundAdvice {
	public Object aroundAdvice(ProceedingJoinPoint pjp) throws Throwable {
		
		System.out.println("[AroundAdvice] 비즈니스 실행 전에 실행되는 로그!!");
		//Main로직을 여기서 불러오자!!
		Object retObj = pjp.proceed(); //비즈니스로직 불러와서 실행됨 
				
		System.out.println("[AroundAdvice] 비즈니스 실행 전에 실행되는 로그!!");
		
		return retObj;
	}
	
	@Pointcut("execution(* com.spring.aopex3..*Impl.insert*(..))")
	public void insertPointcut() {
		
	}
	
//	@Around("insertPointcut()")
	public Object aroundAdviceDo(ProceedingJoinPoint pjp) throws Throwable {
		String method = pjp.getSignature().getName();//호출하는 method
		System.out.println("[AroundAdvice] 비즈니스 실행 전에 실행되는 로그!!");
		//Main로직을 여기서 불러오자!!
		Object retObj = pjp.proceed(); //비즈니스로직 불러와서 실행됨
		if( retObj instanceof BoardDo) {
			BoardDo bdo = (BoardDo) retObj;
			System.out.println("[aroundAdviceDo]  method : " + method + " rebObj : " + bdo.getSeq()
				+ ", " + bdo.getTitle() );
		}
		return retObj;
	}
	
	@Around("insertPointcut()")
	public Object aroundElapseTimeLog(ProceedingJoinPoint pjp) throws Throwable { //elapse:경고
		//핵심관심영역 코드의 메소드 이름
		String method = pjp.getSignature().getName();
		
		System.out.println("핵심관심영역 코드 실행시에 걸리는 시간 체크 전!! ");
		
		StopWatch stopWatch = new StopWatch();
		stopWatch.start(); //시간체크
		Object returnObj = pjp.proceed(); //핵심관심 코드 실행
		
		Thread.sleep(200); //200msec!!
		stopWatch.stop();
		
		System.out.println("핵심관심영역 코드 실행시에 걸리는 시간 체크 후!! ");
		System.out.println("핵심관심영역 코드 실행시에 걸리는 시간은 : " +
				stopWatch.getTotalTimeMillis() + "msec");
		
		return returnObj;
	}
}
