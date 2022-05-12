package com.spring.aopex;

import org.springframework.stereotype.Service;

@Service("logAdvice")
public class LogAdvice {
	public void printLog() {
		System.out.println("[공통관심영역코드] 비즈니스 로직 전에 수행되는 동작");
	}
	
	public void printLogModify() {
		System.out.println("[공통관심영역코드 Modify] 비즈니스 로직 전에 수행되는 동작");
	}
}
