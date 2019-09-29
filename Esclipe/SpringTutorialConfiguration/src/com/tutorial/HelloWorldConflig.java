package com.tutorial;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration 
public class HelloWorldConflig {

	@Bean
	public HelloWorld helloworld() {
		return new HelloWorld();
	}
	
}
