package com.yuzf.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan     //扫描该类同包下的bean
public class PeopleConfig {
	
	
	@Bean
	public People user() {
		return new User();
	}
}
