package com.spring.aopex2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("boardService")
public class BoardServiceImpl implements BoardService{
//	@Autowired
//	private LogAdvice log;

	@Override
	public void insertBoard() {
//		log.printLog();
//		log.printLogModify();
		System.out.println("[�ٽɰ��ɿ��� �ڵ�] insertBoard() ����");
	}

	@Override
	public void updateBoard() {
//		log.printLog();
//		log.printLogModify();
		System.out.println("[�ٽɰ��ɿ��� �ڵ� ] updateBoard() ����");
	}
}
