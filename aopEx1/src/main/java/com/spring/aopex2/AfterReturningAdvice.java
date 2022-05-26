package com.spring.aopex2;

import org.aspectj.lang.JoinPoint;

public class AfterReturningAdvice {
	public void afterReturningAdviceLog() {
		System.out.println("[AfterReturningAdvice] ����Ʈ �� �����Ŀ� advice ����!!");
	}
	
	public void afterReturningAdviceLogDo(JoinPoint jp, Object returnObj) {
		String method = jp.getSignature().getName();
		if(returnObj instanceof BoardDo) {
			BoardDo bdo = (BoardDo) returnObj;
			System.out.println("[AfterReturningAdviceLogDo] method : " + method + 
					"returnObj ���� "  + bdo.getSeq() + " , " + bdo.getTitle()) ; 
		}
	}


}
