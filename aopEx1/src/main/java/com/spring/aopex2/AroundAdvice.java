package com.spring.aopex2;

import org.aspectj.lang.ProceedingJoinPoint;

public class AroundAdvice {
	public Object aroundAdvice(ProceedingJoinPoint pjp) throws Throwable {
		
		System.out.println("[AroundAdvice] ����Ͻ� ���� ���� ����Ǵ� �α�!!");
		//Main������ ���⼭ �ҷ�����!!
		Object retObj = pjp.proceed(); //����Ͻ����� �ҷ��ͼ� ����� 
				
		System.out.println("[AroundAdvice] ����Ͻ� ���� ���� ����Ǵ� �α�!!");
		
		return retObj;
	}

}
