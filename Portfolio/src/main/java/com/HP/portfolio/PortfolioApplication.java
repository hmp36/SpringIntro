package com.HP.portfolio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@SpringBootApplication

@RestController
public class PortfolioApplication {

	public static void main(String[] args) {
		SpringApplication.run(PortfolioApplication.class, args);
	}
	
	
	@RequestMapping("/")
	public String index () {
		return "forward:/index.html";
	}	
	
//	@RequestMapping("/projects")
//		public String projects () {
//			return "My projects!";
//	}
//	@RequestMapping("/me")
//	public String me () {
//		return "Hello World!";
	
	}
	

