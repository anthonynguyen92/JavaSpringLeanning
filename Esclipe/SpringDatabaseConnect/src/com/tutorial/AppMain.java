package com.tutorial;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppMain {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		
		StudentJDBCTemplate stdJ = (StudentJDBCTemplate) context.getBean("studentJDBCTemplate");
		System.out.println("--- ADD record---");
		stdJ.createData("Thang",20);
		stdJ.createData("Trang", 20);
		
		System.out.println("-----Print-----");
		List<Student> list = stdJ.listStudent();
		for (Student student : list) {
			System.out.println("ID: "+student.getID());
			System.out.println("Name: "+student.getName());
			System.out.println("Age: "+student.getAge());
		}
	}
}
