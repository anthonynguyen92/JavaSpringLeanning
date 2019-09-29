package com.tutorialpoint;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Bean.Xml");
		HelloWorld objHelloWorld = (HelloWorld) context.getBean("helloworld");
		objHelloWorld.getMessager();

	}
}
