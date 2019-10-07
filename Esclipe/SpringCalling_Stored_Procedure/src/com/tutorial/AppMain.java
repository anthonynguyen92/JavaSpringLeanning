package com.tutorial;

import java.sql.SQLException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppMain {
	public static void main(String[] args) throws SQLException {
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		StudentJDBCTemplate studentJDBCTemplate = (StudentJDBCTemplate) context.getBean("studentjdbctemplate");

		
		/*System.out.println("--- Record Creation ---");
		studentJDBCTemplate.create("Thắng", 21);
		studentJDBCTemplate.create("Dương", 22);
		studentJDBCTemplate.create("Lía", 24);
		*/
		System.out.println("--- List multiple Records ---");
		java.util.List<Student> list = studentJDBCTemplate.listStudent();
		for(Student sv:list) {
			System.out.println("ID: "+sv.getId());
			System.out.println("Name: "+sv.getName());
			System.out.println("Age: "+sv.getAge());
		}
		
		System.out.println("--- Listing Record With your ID");
		Student student = studentJDBCTemplate.getStudent(2);
		System.out.println("ID: "+student.getId());
		System.out.println("Name: "+student.getName());
		System.out.println("Age: "+student.getAge());

		
	}
}
