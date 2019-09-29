package com.tutorial;

public class HelloWorld {
	private String message;

	public void getMessage() {
		System.out.println("Your message: " + this.message);
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	public void init() {
		System.out.println("Bean is going through innit.");
	}
	
	public void destroy() {
		System.out.println("Bean'll destroy now.");
	}

}
