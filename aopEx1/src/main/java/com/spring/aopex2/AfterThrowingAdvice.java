package com.spring.aopex2;

import org.aspectj.lang.JoinPoint;

public class AfterThrowingAdvice {
	public void afterThrowingAdviceLog() {
		System.out.println("[AfterThrowingAdvice] ����ó�� �߻��� ����Ǵ� �α�!!");
	}
	
	public void afterThrowingLogExcept(JoinPoint jp, Exception exceptObj) {
		System.out.println("[AfterThrowingAdviceExcept] ����ó�� �߻��� ����Ǵ� �α�!!");
		String method = jp.getSignature().getName();
		System.out.println("[AfterThrowingAdviceExcept] method : " + method + ", except Message : " + exceptObj);
		
	}
}
