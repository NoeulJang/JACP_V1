package com.example.demo.controller.board;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.board.BoardDAO;
import com.example.demo.dto.board.BoardDto;

@RestController
public class BoardController {
	
	@Autowired
    private BoardDAO boardDAO;
	
	@GetMapping("/board/boardList")
	public List<BoardDto> getBoardList() {
		System.out.println("111111 ");
		try {
			System.out.println("test?? " + boardDAO.selectBoardList());
			return boardDAO.selectBoardList();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}
