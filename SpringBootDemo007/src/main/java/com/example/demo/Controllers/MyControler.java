package com.example.demo.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyControler {

	@GetMapping("/home")
	public String home() {
		return "<h1> Hi Welcome to Home page </h1>";
	}
	
	@GetMapping("/dashboard")
	public String dashboard() {
		
		return "<h1> Hi Welcome to DashBoard Page </h1>";
	}
	
	@GetMapping("private")
	public String privateApi() {
		return "<h1> Hi This is Public end Point";
	}
	@GetMapping("public")
	public String publicApi() {
		return "<h1> Hi This is Public end Point";
	}
}
