package com.mypoc.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.actuate.autoconfigure.security.servlet.ManagementWebSecurityAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication(exclude = { SecurityAutoConfiguration.class, ManagementWebSecurityAutoConfiguration.class })
@ComponentScan("com.mypoc")
public class SpringSecurityPocApplication extends SpringBootServletInitializer {

	private static Logger logger =  LoggerFactory.getLogger(SpringSecurityPocApplication.class);

	public static void main(String[] args) {
		logger.debug("SpringSecurityPocApplication main method start");
		SpringApplication.run(SpringSecurityPocApplication.class, args);
		logger.debug("SpringSecurityPocApplication main method end");

	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		logger.debug("SpringSecurityPocApplication configure method start");
		return builder.sources(SpringSecurityPocApplication.class);

	}
}
