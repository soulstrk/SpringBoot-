package com.soulstrk.mvc;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Configuration;

import com.soulstrk.mvc.setting.DatabaseConfig;

@Configuration
public class Runner implements ApplicationRunner{
	
	@Autowired
	DatabaseConfig databaseConfig;
	@Autowired
	DataSource dataSource;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {

		/*SqlSessionFactory sqlSessionFactory = databaseConfig.sqlSessionFactory(dataSource);
		SqlSessionTemplate sqlSessionTemplate = databaseConfig.sqlSession(sqlSessionFactory);
		
		System.out.println("----------------------------");
		System.out.println(sqlSessionTemplate.getClass());
		System.out.println(sqlSessionTemplate.getConnection());*/
		
	}
	
}
