package com.spring.aopex2;

import org.aspectj.lang.JoinPoint;

public class AfterThrowingAdvice {
	public void afterThrowingAdviceLog() {
		System.out.println("[AfterThrowingAdvice] 예외처리 발생시 실행되는 로그!!");
	}
	
	public void afterThrowingLogExcept(JoinPoint jp, Exception exceptObj) {
		System.out.println("[AfterThrowingAdviceExcept] 예외처리 발생시 실행되는 로그!!");
		String method = jp.getSignature().getName();
		System.out.println("[AfterThrowingAdviceExcept] method : " + method + ", except Message : " + exceptObj);
		
	}
}
