package com.spring.boardex.service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.spring.boardex.common.JdbcUtil;
import com.spring.boardex.impl.BoardDo;

public class BoardClient {
	public static void main(String[] main) {
//		테스트해보기 위해 사용한 것
//		JdbcUtil jutil = new JdbcUtil();
//		jutil.getConnection();
		
		ApplicationContext context = new GenericXmlApplicationContext("BoardSetting.xml"); //스프링 컨테이너 가져오기(객체...)
		
		BoardService bService = (BoardService)context.getBean("boardService");//BoardService객체 가져오기
		
		BoardDo bdo = new BoardDo();//글 등록
		bdo.setTitle("Title");
		bdo.setWriter("Writer");
		bdo.setContent("content");
		bService.insertBoard(bdo);
	}
}
