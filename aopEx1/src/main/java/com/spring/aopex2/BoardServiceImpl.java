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
		System.out.println("[핵심관심영역 코드] insertBoard() 실행");
//		if(seq == 0) {
//			throw new IllegalArgumentException("seq가 0인 에러 발생됨!!");
//		}
	}

	@Override
	public void updateBoard() {
//		log.printLog();
//		log.printLogModify();
		System.out.println("[핵심관심영역 코드 ] updateBoard() 실행");
	}

	@Override
	public void insertBoardDo(BoardDo bdo) {
		System.out.println("[핵심관심영역 코드 ] insertBoard(BoardDo bdo) 실행");
	}

	@Override
	public void insertBoardExcept() {
		System.out.println("[핵심관심영역 코드] insertBoardExcept() 실행");
		if(seq == 0) {
			throw new IllegalArgumentException("seq가 0인 에러 발생됨!!");
		}
	}

	@Override
	public BoardDo insertBoardReturn(BoardDo bdo) {
		System.out.println("[핵심관심영역 코드] insertBoardReturn() 실행");
		return bdo;
	}
}
