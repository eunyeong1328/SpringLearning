package com.spring.aopex3;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect //재료로 사용됨
public class PointcutCommon {
	
	
	@Pointcut("execution(* com.spring.aopex3..*Impl.insertBoardReturn(..))")
	public void insertDoPointcut() {
		
	}
	
	
	@Pointcut("execution(* com.spring.aopex3..*Impl.update*(..))")
	public void updatePointcut() {
	}

}
