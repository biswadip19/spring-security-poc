package com.mypoc.config.autoconfig;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@EnableWebSecurity (debug = true)
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		//super.configure(auth);
		
		PasswordEncoder encoder = PasswordEncoderFactories.createDelegatingPasswordEncoder();
    	auth
          .inMemoryAuthentication()
          .withUser("user")
          .password(encoder.encode("password"))
          .roles("USER")
          .and()
          .withUser("admin")
          .password(encoder.encode("admin"))
          .roles("USER", "ADMIN");
	}
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		//http.authorizeRequests().anyRequest().anonymous().and().httpBasic();
		//super.configure(http);
		//http.authorizeRequests().anyRequest().authenticated().and().httpBasic();
		//http.authorizeRequests().antMatchers("/welcomemvc","/welcome").permitAll();
		http
			.authorizeRequests()
			.antMatchers("/loginPage","/welcome*","/actuator/*").permitAll()
			.anyRequest().authenticated()
			.and()
			.formLogin()
			.loginPage("/loginPage")
			.loginProcessingUrl("/login")
			.defaultSuccessUrl("/homePage",true);
		http
			.csrf()
			.disable();
   
	}

}
