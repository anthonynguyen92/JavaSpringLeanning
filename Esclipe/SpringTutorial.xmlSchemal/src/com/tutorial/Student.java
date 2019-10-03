package com.tutorial;

public class Student {

	
	public Integer getAge() {
		System.out.println("Age: "+this.age);
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getName() {
		System.out.println("Name: "+this.name);
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	private String name;
	private Integer age;
	
	public void printThrowException() {
		System.out.println("Exception raised.");
		throw new IllegalArgumentException();
	}
}
