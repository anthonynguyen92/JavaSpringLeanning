package com.f7program.hellospringmvc.config;

import java.util.List;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
@EnableWebMvc
public class WebMvcConfig extends WebMvcConfigurerAdapter{

		@Override
		public void addResourceHandlers(ResourceHandlerRegistry registry) {
			// TODO Auto-generated method stub
			registry.addResourceHandler("/css/**").addResourceLocations("/css//").setCachePeriod(31556926);
			registry.addResourceHandler("/img/**").addResourceLocations("/img/").setCachePeriod(31556926);
			registry.addResourceHandler("/js/**").addResourceLocations("/js/").setCachePeriod(31556926);
		}
		
		@Override
		public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
		// TODO Auto-generated method stub
			configurer.enable();
		}
}
