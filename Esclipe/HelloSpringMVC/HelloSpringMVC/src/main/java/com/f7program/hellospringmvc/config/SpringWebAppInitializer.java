package com.f7program.hellospringmvc.config;

import javax.imageio.spi.ServiceRegistry;
import javax.servlet.FilterRegistration;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.servlet.DispatcherServlet;

import com.f7program.hellospringmvc.config.impl.WebApplicationInitializer;

public class SpringWebAppInitializer implements WebApplicationInitializer {
	
	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		// TODO Auto-generated method stub
		AnnotationConfigWebApplicationContext appContext =  new AnnotationConfigWebApplicationContext();
		appContext.register(ApplicationContextConfig.class);
		
		//dispather Servlet
		ServletRegistration.Dynamic dispatcher = servletContext.addServlet("SpringDispatcher", new DispatcherServlet(appContext));
		dispatcher.setLoadOnStartup(1);
		dispatcher.addMapping("/");
		
		dispatcher.setInitParameter("ContextClass", appContext.getClass().getName());
		
		servletContext.addListener(new ContextLoaderListener(appContext));
		
		//UTF 8 Charactor Filler
		FilterRegistration.Dynamic frDynamic = servletContext.addFilter("encoding", CharacterEncodingFilter.class);
		
		frDynamic.setInitParameter("encoding", "UTF-8");
		frDynamic.setInitParameter("forceEncoding", "true");
		frDynamic.addMappingForUrlPatterns(null, true, "/*");
	}

}
