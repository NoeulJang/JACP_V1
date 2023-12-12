package com.example.demo.controller.board;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.board.BoardDto;
import com.example.demo.service.board.BoardService;

@RestController
@RequestMapping("/api")
public class BoardController {
	
	@Autowired
    private BoardService boardService;
	
	@GetMapping("/board/boardList")
	public List<BoardDto> getBoardList() {
		try {
			return boardService.selectBoardList();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
