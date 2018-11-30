package com.soulstrk.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.autoconfigure.web.ServerProperties;
import org.springframework.stereotype.Component;

@Component
public class SampleRunner implements ApplicationRunner{
	
	@Autowired
	KeesunProperties keesunProperties;
	
	@Autowired
	ServerProperties serverProperties;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("---------------");
		System.out.println(keesunProperties.getAge());
		System.out.println(keesunProperties.getFullName());
		System.out.println(serverProperties.getPort());
		System.out.println("---------------");
	}
	
}
