package com.tutorial;

import java.util.List;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppMain {
	public static void main(String[] args) {

		AbstractApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		StudentJDBCTemplate obj = (StudentJDBCTemplate) context.getBean("studentjdbctemplate");

		System.out.println("--- Record createion ---");
		obj.create("thang", 21, 6, 2019);
		obj.create("duong", 22, 3, 2017);
		obj.create("long", 21, 8, 2015);

		System.out.println("--- List All Record ---");
		List<StudentMarks> list = obj.liststudents();
		for (StudentMarks studentMarks : list) {
			System.out.println("ID: " + studentMarks.getId());
			System.out.println("Name: " + studentMarks.getName());
			System.out.println("Age: " + studentMarks.getAge());
			System.out.println("Mark: " + studentMarks.getMark());
			System.out.println("Year: " + studentMarks.getYear());

		}
	}
}
