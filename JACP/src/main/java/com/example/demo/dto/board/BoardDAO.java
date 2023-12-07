package com.example.demo.dto.board;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

public interface BoardDAO {
	public List<BoardDto> selectBoardList() throws Exception;
}
