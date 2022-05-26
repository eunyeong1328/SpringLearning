package com.spring.aopex2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("boardService")
public class BoardServiceImpl implements BoardService{
//	@Autowired
//	private LogAdvice log;
	int seq = 0;

	@Override
	public void insertBoard() {
//		log.printLog();
//		log.printLogModify();
		System.out.println("[�ٽɰ��ɿ��� �ڵ�] insertBoard() ����");
//		if(seq == 0) {
//			throw new IllegalArgumentException("seq�� 0�� ���� �߻���!!");
//		}
	}

	@Override
	public void updateBoard() {
//		log.printLog();
//		log.printLogModify();
		System.out.println("[�ٽɰ��ɿ��� �ڵ� ] updateBoard() ����");
	}

	@Override
	public void insertBoardDo(BoardDo bdo) {
		System.out.println("[�ٽɰ��ɿ��� �ڵ� ] insertBoard(BoardDo bdo) ����");
	}

	@Override
	public void insertBoardExcept() {
		System.out.println("[�ٽɰ��ɿ��� �ڵ�] insertBoardExcept() ����");
		if(seq == 0) {
			throw new IllegalArgumentException("seq�� 0�� ���� �߻���!!");
		}
	}

	@Override
	public BoardDo insertBoardReturn(BoardDo bdo) {
		System.out.println("[�ٽɰ��ɿ��� �ڵ�] insertBoardReturn() ����");
		return bdo;
	}
}
