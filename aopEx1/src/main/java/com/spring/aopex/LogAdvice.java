package com.spring.aopex;

import org.springframework.stereotype.Service;

@Service("logAdvice")
public class LogAdvice {
	public void printLog() {
		System.out.println("[������ɿ����ڵ�] ����Ͻ� ���� ���� ����Ǵ� ����");
	}
	
	public void printLogModify() {
		System.out.println("[������ɿ����ڵ� Modify] ����Ͻ� ���� ���� ����Ǵ� ����");
	}
}
