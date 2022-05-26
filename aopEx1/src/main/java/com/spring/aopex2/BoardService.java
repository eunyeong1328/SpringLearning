package com.spring.aopex2;

import org.springframework.stereotype.Service;

public interface BoardService {
	void insertBoard();
	void updateBoard();
	void insertBoardDo(BoardDo bdo);
	void insertBoardExcept();
}
