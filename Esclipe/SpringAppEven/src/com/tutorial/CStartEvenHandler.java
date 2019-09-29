package com.tutorial;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStartedEvent;

public class CStartEvenHandler implements ApplicationListener<ContextStartedEvent> {
	@Override
	public void onApplicationEvent(ContextStartedEvent arg0) {
		// TODO Auto-generated method stub
		// it means before your hello World show off in your screen . u can call this function and it will be show before your Hello world
		System.out.println("Context Started Event reveiced");

	}
}
