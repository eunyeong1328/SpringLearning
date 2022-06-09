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
		
		System.out.println("[AroundAdvice] ����Ͻ� ���� ���� ����Ǵ� �α�!!");
		//Main������ ���⼭ �ҷ�����!!
		Object retObj = pjp.proceed(); //����Ͻ����� �ҷ��ͼ� ����� 
				
		System.out.println("[AroundAdvice] ����Ͻ� ���� ���� ����Ǵ� �α�!!");
		
		return retObj;
	}
	
	@Pointcut("execution(* com.spring.aopex3..*Impl.insert*(..))")
	public void insertPointcut() {
		
	}
	
//	@Around("insertPointcut()")
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
	
	@Around("insertPointcut()")
	public Object aroundElapseTimeLog(ProceedingJoinPoint pjp) throws Throwable { //elapse:���
		//�ٽɰ��ɿ��� �ڵ��� �޼ҵ� �̸�
		String method = pjp.getSignature().getName();
		
		System.out.println("�ٽɰ��ɿ��� �ڵ� ����ÿ� �ɸ��� �ð� üũ ��!! ");
		
		StopWatch stopWatch = new StopWatch();
		stopWatch.start(); //�ð�üũ
		Object returnObj = pjp.proceed(); //�ٽɰ��� �ڵ� ����
		
		Thread.sleep(200); //200msec!!
		stopWatch.stop();
		
		System.out.println("�ٽɰ��ɿ��� �ڵ� ����ÿ� �ɸ��� �ð� üũ ��!! ");
		System.out.println("�ٽɰ��ɿ��� �ڵ� ����ÿ� �ɸ��� �ð��� : " +
				stopWatch.getTotalTimeMillis() + "msec");
		
		return returnObj;
	}
}
