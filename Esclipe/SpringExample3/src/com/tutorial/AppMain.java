package com.tutorial;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class AppMain {
	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("Bean.xml");
		HelloWolrd obj1 = (HelloWolrd) context.getBean("helloworld");
		
		HelloIndia obj2 = (HelloIndia) context.getBean("helloIndia");
		
		obj1.getMessage1();
		obj1.getMessage2();
		
		System.out.println();
		
		obj2.getMessage1();
		obj2.getMessage2();
		obj2.getMessage3();
	}
}
