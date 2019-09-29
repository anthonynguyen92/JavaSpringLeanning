package com.tutorial;

import static org.springframework.test.web.client.match.MockRestRequestMatchers.content;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppMain {

	public static void main(String[] args) {
			ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		//nhớ khai báo nó ở trong xml thì khi compiled mới hiểu và có thể chạy 2 cái file start and stop nha.
			
			context.start();	
			
			HelloWorld obj = (HelloWorld) context.getBean("helloworld");
			obj.getMessage();
			
			context.stop();
	}
}
