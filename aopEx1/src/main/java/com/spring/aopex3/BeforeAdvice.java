package com.spring.aopex3;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Service;

//<aop:pointcut expression="execution(* com.spring.aopex2..*Impl.insertBoardReturn(..))" 
//							id="insertReturnPointcut"/>	


//<aop:aspect ref = "before">
//<aop:before method="beforeLogDo" pointcut-ref="insertDoPointcut"/>
//</aop:aspect> 

@Service
@Aspect
public class BeforeAdvice {
	
	@Pointcut("execution(* com.spring.aopex3..*Impl.insertBoardReturn(..))")
	public void insertDoPointcut() {
		
	}
	
	public void beforeLog() {
		System.out.println("[beforeAdvice] ����Ͻ� ���� ���� ���� ����!!");
	}

		
	@Before("PointcutCommon.insertDoPointcut()")
	public void beforeLogDo(JoinPoint jp) {
		System.out.println("[beforeAdviceDo] ����Ͻ� ���� ���� ���� ����(JointPoint)!! ");
		
		String method = jp.getSignature().getName();
		Object[] args = jp.getArgs();
		System.out.println("[beforeAdviceDo] method : " + method + "args : " + args[0].toString());
	} 

}
