package com.tutorial;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppMain {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");

		Student ojbStudent = (Student) context.getBean("student");

		ojbStudent.getAge();
		ojbStudent.getName();
		ojbStudent.printThrowException();
	}
}