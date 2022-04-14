package com.spring.boardex.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.boardex.service.BoardService;

@Service("boardService")
public class BoardServiceImpl implements BoardService{
	
	@Autowired
	private BoardDao dbao;

	@Override
	public void insertBoard(BoardDo bdo) {
		dbao.insertBoard(bdo);
	}

}
