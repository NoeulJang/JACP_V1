package com.example.demo.mapper.board;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.dto.board.BoardDto;

@Mapper
public interface BoardMapper {
	public List<BoardDto> selectBoardList() throws Exception;
}