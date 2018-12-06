package com.soulstrk.mvc.board.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.soulstrk.mvc.board.mapper.BoardMapper;
import com.soulstrk.mvc.board.vo.BoardVo;

@Service
public class BoardService {
	
	@Autowired
	BoardMapper boardMapper;
	
	public List<BoardVo> boardPage(Map<String, Object> map){
		List<BoardVo> list = boardMapper.getList(map);
		return list;
	}
}
