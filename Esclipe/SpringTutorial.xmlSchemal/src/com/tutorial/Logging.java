package com.tutorial;

public class Logging {

	public void beforeAdvice() {
		System.out.println("Going to setup Student profiles");
	}

	public void afretAdvice() {
		System.out.println("Student profile has been setup.");
	}

	public void afterReturnAdvice(Object reVal) {
		System.out.println("Return: " + reVal.toString());
	}

	public void afterThrowingAdvice(IllegalArgumentException ex) {
		System.out.println("There has been an exception: "+ex.toString());
	}
}
