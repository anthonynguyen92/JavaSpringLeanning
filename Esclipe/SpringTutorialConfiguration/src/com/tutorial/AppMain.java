package com.tutorial;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppMain {

	public static void main(String[] args) {
		ApplicationContext ct = new AnnotationConfigApplicationContext(HelloWorldConflig.class);
		HelloWorld helloWorld = ct.getBean(HelloWorld.class);
		helloWorld.setMessage("Hello World!");
		helloWorld.getMessage();
	}
}
