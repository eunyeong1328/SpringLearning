package com.spring.aopex;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class BoardMain {

	public static void main(String[] args) {
		ApplicationContext context = new GenericXmlApplicationContext("aopExSetting.xml");
		
		BoardService bService = (BoardService) context.getBean("boardService");
		
		bService.insertBoard();
		bService.updateBoard();
	}

}
