package com.example.demo.service.impl.board;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.board.BoardDto;
import com.example.demo.mapper.board.BoardMapper;
import com.example.demo.service.board.BoardService;

@Service
public class BoardServiceImpl implements BoardService {
 
	@Autowired
	BoardMapper boardMapper;
	
	@Override
	public List<BoardDto> selectBoardList() throws Exception{
		return boardMapper.selectBoardList();
	}
}
