package com.soulstrk.mvc.Tem;

import org.springframework.hateoas.Resource;
import org.springframework.hateoas.mvc.ControllerLinkBuilder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.soulstrk.mvc.user.Hello;

@Controller
public class SampleController {
	
	@GetMapping("/hello")
	public String hello(Model model) {
		model.addAttribute("name","keesun");
		return "hello";
	}
	
	@RequestMapping("/restHello")
	public @ResponseBody Resource<Hello> restHello() {
		Hello hello = new Hello();
		hello.setName("keesun");
		hello.setPrefix("lee");
		
		//링크 정보를 추가하는 방법
		Resource<Hello> helloResource = new Resource<Hello>(hello);
		helloResource.add(ControllerLinkBuilder.linkTo(ControllerLinkBuilder.methodOn(SampleController.class).restHello()).withSelfRel());
		
		return helloResource;
	}
	
}
