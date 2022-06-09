package com.spring.aopex3;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Service;

@Service
@Aspect
public class AfterAdvice {
	
//<aop:aspect ref ="after">
//	<aop:after method="afterAdvice" pointcut-ref="insertPointcut"/>
//</aop:aspect> 
//<aop:pointcut expression="execution(* com.spring.aopex2..*Impl.update*(..))"
//				id="updatePointcut"/>
	
//	@Pointcut("execution(* com.spring.aopex3..*Impl.update*(..))")
//	public void updatePointcut() {
//		
//	}
	
	@After("PointcutCommon.updatePointcut()")
	public void afterAdvice() {
		System.out.println("[AfterAdvice] 비즈니스로직 실행 후에 꼭 실행됨!!");
	}
}
