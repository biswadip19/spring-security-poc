/**
 * 
 */
package com.mypoc.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

/**
 * @author biswadipmukherjee
 *
 */

@EnableWebMvc
@Configuration
public class MvcConfigration implements WebMvcConfigurer {
	
	@Bean
	public ViewResolver internalResourceViewResolver() {
	    InternalResourceViewResolver bean = new InternalResourceViewResolver();
	    bean.setViewClass(JstlView.class);
	    bean.setPrefix("/WEB-INF/");
	    bean.setSuffix(".jsp");
	    return bean;
	}
	
	/*@Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
		//configurer.enable("dispatcherServlet");
		WebMvcConfigurer.super.configureDefaultServletHandling(configurer);
	}
	*/
	

}
