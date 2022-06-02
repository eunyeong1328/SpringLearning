package com.spring.aopex3;

import org.springframework.stereotype.Service;

public interface BoardService {
	void insertBoard();
	void updateBoard();
	void insertBoardDo(BoardDo bdo);
	void insertBoardExcept();
	BoardDo insertBoardReturn(BoardDo bdo);
}
