package com.tutorial;

import org.springframework.context.ApplicationEvent;

public class CustomEvent extends ApplicationEvent {

	public CustomEvent(Object source) {
		// TODO Auto-generated constructor stub
		super(source);
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "My Custom event";
	}
	
}