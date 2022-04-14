package com.spring.boardex.service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.spring.boardex.common.JdbcUtil;
import com.spring.boardex.impl.BoardDo;

public class BoardClient {
	public static void main(String[] main) {
//		�׽�Ʈ�غ��� ���� ����� ��
//		JdbcUtil jutil = new JdbcUtil();
//		jutil.getConnection();
		
		ApplicationContext context = new GenericXmlApplicationContext("BoardSetting.xml"); //������ �����̳� ��������(��ü...)
		
		BoardService bService = (BoardService)context.getBean("boardService");//BoardService��ü ��������
		
		BoardDo bdo = new BoardDo();//�� ���
		bdo.setTitle("Title");
		bdo.setWriter("Writer");
		bdo.setContent("content");
		bService.insertBoard(bdo);
	}
}
