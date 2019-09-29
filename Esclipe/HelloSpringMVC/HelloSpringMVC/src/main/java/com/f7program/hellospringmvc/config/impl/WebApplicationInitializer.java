package com.f7program.hellospringmvc.config.impl;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;

public interface WebApplicationInitializer {
	public void onStartup(ServletContext servletContext) throws ServletException;
}
