package com.soulstrk.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {
	@RequestMapping("/")
	public @ResponseBody String root_text() {
		return"hello world";
	}
	
	@RequestMapping("/demo")
	public @ResponseBody String demo_test() {
		return "데모 페이지에 접속 하셨습니다.";
	}
}
