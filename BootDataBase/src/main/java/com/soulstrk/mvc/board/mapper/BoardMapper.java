package com.soulstrk.mvc.board.mapper;

import java.util.List;
import java.util.Map;

import com.soulstrk.mvc.board.vo.BoardVo;

public interface BoardMapper {
	public List<BoardVo> getList(Map<String, Object> map);
	public int getTotalRowCount(Map<String, Object> map);
}
