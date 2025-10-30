package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;


@Configuration
@EnableWebSecurity
public class SecurityConfig {
	 @Bean
	  public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
	        http
	            .authorizeHttpRequests(auth -> auth
	                // permitAll() means no login needed
	                .requestMatchers("/public","/home").permitAll()
	                // authentication required for all others
	                .anyRequest().authenticated()
	            )
	            // enables basic authentication (username/password popup)
	            .httpBasic()
	            .and()
	            // disable csrf for simplicity
	            .csrf().disable();

	        return http.build();
	    }
}
