package com.tutorialspring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppMain {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Bean.xml");
		HelloWorld objHelloWorld = (HelloWorld) context.getBean("helloworld");

		objHelloWorld.setMessage("Xin chao");
		objHelloWorld.getMessage();

		//System.out.println("Another value");
		HelloWorld objB = (HelloWorld) context.getBean("helloworld");
		objB.getMessage();

	}
}
