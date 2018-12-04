package com.soulstrk.mvc;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.soulstrk.mvc.board.mapper.TestMapper;
import com.soulstrk.mvc.member.mapper.MemberMapper;

@RestController
public class TestController {
	
	@Autowired
	private SqlSessionTemplate sqlSession;
	
	@Autowired
	private TestMapper testMapper;
	@Autowired
	private MemberMapper memberMapper;
	
	@GetMapping("/test")
	public String test() {
		int a = testMapper.select();
		int b = memberMapper.select();
		return String.valueOf(a) + " " + String.valueOf(b);
	}
}
