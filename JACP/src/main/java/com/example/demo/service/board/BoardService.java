package com.example.demo.service.board;

import java.util.List;

import com.example.demo.dto.board.BoardDto;

public interface BoardService {
	public List<BoardDto> selectBoardList() throws Exception;
}
