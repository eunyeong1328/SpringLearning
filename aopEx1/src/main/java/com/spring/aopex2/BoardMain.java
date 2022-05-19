package com.spring.aopex2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class BoardMain {

	public static void main(String[] args) {
		ApplicationContext context = new GenericXmlApplicationContext("aopAdviceSettings.xml");
		
		BoardService bService = (BoardService) context.getBean("boardService");
		
		bService.insertBoard();
		bService.updateBoard();
	}

}
