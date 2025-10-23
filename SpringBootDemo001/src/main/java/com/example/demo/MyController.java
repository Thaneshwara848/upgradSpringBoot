package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	
	@GetMapping("/home")
	public String home() {
		
		return "<h1> Hi Welcome to Home page </h1>";
	}
	
	@GetMapping("login")
	public String login() {
		
		return "<h1> Hi Welcome to Login page </h1>";
	}

	@GetMapping("/signup")
	public String xyz() {
	
		return "<h1> Hi Welcome to Signup page </h1>";
	}
}
