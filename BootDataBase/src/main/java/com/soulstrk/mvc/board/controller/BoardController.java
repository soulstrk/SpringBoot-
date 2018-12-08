package com.soulstrk.mvc.board.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.soulstrk.mvc.board.mapper.BoardMapper;
import com.soulstrk.mvc.board.service.BoardService;
import com.soulstrk.mvc.board.vo.BoardVo;
import com.soulstrk.mvc.util.PageUtil;

@Controller
public class BoardController {
	
	@Autowired
	BoardService boardService;
	@Autowired
	BoardMapper boardMapper;
	
	@GetMapping("/board")
	public String boardPage(@RequestParam(value="pageNum", defaultValue="1") int pageNum,String keyWord, String searchWord, Model model) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("keyWord", keyWord);
		map.put("searchWord", searchWord);
		
		int totalRowCount = boardMapper.getTotalRowCount(map);
		
		PageUtil pu = new PageUtil(pageNum, totalRowCount, 10, 10);
		
		map.put("pu", pu);
		System.out.println(pu);
		List<BoardVo> boardList = boardService.boardPage(map);
		
		model.addAttribute("boardInfo",map); // 현재 응답받은 게시판 정보
		model.addAttribute("boardList",boardList); // 글 목록
		
		return "main";
	}
	
	@GetMapping("/board/delete")
	public String deleteBoard(int num) {
		boardService.deleteBoard(num);
		
		return "redirect:/board";
	}
	
	@PostMapping("/board/insert")
	public String insertBoard(BoardVo boardVo) {
		boardVo.setHit(10);
		boardService.insertBoard(boardVo);
		
		return "redirect:/board";
	}
	
	@GetMapping("/board/moveWrite")
	public String moveWrite() {
		return "write";	
	}
	
}




















