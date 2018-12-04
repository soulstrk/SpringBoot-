package com.soulstrk.mvc;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.soulstrk.mvc.**.mapper")
public class BootDataBaseApplication {
	public static void main(String[] args) {
		SpringApplication.run(BootDataBaseApplication.class, args);
	}
}
