package com.mypoc.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.mypoc")
public class SpringSecurityPocApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringSecurityPocApplication.class, args);
	}

}
