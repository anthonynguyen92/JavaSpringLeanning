package com.tutorial;

public class HelloWorld {

	public void getMessage() {
		System.out.println("Your Message: "+this.message );
	}

	public void setMessage(String message) {
		this.message = message;
	}

	private String message;
}
