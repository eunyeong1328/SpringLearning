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
	
	public Object aroundAdviceDo(ProceedingJoinPoint pjp) throws Throwable {
		String method = pjp.getSignature().getName();//ȣ���ϴ� method
		System.out.println("[AroundAdvice] ����Ͻ� ���� ���� ����Ǵ� �α�!!");
		//Main������ ���⼭ �ҷ�����!!
		Object retObj = pjp.proceed(); //����Ͻ����� �ҷ��ͼ� �����
		if( retObj instanceof BoardDo) {
			BoardDo bdo = (BoardDo) retObj;
			System.out.println("[aroundAdviceDo]  method : " + method + " rebObj : " + bdo.getSeq()
				+ ", " + bdo.getTitle() );
		}
		return retObj;
	}

}
