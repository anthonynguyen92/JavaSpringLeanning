package com.tutorial;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppMain {
	public static void main(String[] args) {
		AbstractApplicationContext context =  new ClassPathXmlApplicationContext("Bean.xml");
		HelloWorld objHelloWorld = (HelloWorld) context.getBean("helloworld");
		objHelloWorld.getMessage();
		context.registerShutdownHook();
	}
}
