package com.tutorial;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppMain {
	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("Bean.xml");
		HelloWorld objHelloWorld = (HelloWorld) context.getBean("helloworld");
		objHelloWorld.getMessage();
		//context.registerShutdownHook();
		/**
		 * if u use '//' into coding 12, it'll not complicate translate 
		 * the destroy- function - the next step if u end of the step do 
		 * st with ur data in xml
		 *  
		 */
	}
}
