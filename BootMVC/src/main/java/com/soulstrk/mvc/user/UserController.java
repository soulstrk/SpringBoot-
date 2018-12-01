package com.soulstrk.mvc.user;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	
	@RequestMapping("/hello")
	public String abc() {
		return "hello";
	}
	
	@PostMapping("/users/create")
	public User create(@RequestBody User user) {
		
		return user;
	}
	
}
