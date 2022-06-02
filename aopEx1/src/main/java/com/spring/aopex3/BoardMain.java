package com.spring.aopex3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class BoardMain {

	public static void main(String[] args) {
		ApplicationContext context 
			= new GenericXmlApplicationContext("aopAnoAdviceSettings.xml");
		
		BoardService bService = (BoardService) context.getBean("boardService");
		
		BoardDo bdo = new BoardDo();
		bdo.setSeq(1);
		bdo.setTitle("title");
		bdo.setWriter("writer");
		bdo.setContent("content");
//		bService.insertBoardDo(bdo);
//		bService.insertBoard();
//		bService.insertBoardExcept();
		bService.insertBoardReturn(bdo);
		bService.updateBoard();
	}

}


