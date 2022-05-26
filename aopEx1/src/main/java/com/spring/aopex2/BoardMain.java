package com.spring.aopex2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class BoardMain {

	public static void main(String[] args) {
		ApplicationContext context = new GenericXmlApplicationContext("aopAdviceSettings.xml");
		
		BoardService bService = (BoardService) context.getBean("boardService");
		
//		BoardDo bdo = new BoardDo();
//		bdo.setSeq(1);
//		bdo.setTitle("title");
//		bdo.setWriter("writer");
//		bdo.setContent("content");
		
		bService.insertBoardExcept();
		bService.updateBoard();
	}

}
