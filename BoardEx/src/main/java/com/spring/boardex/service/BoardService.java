package com.spring.boardex.service;

import java.util.ArrayList;

import com.spring.boardex.impl.BoardDo;

public interface BoardService {
	void insertBoard(BoardDo dbo);//�� ���
	ArrayList<BoardDo> getBoardList(); //
	
}
