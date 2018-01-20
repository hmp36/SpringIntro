package com.HP.portfolio;


import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;
@SpringBootApplication

//...
@Controller
public class HomeController {
 @RequestMapping("/")
 public String index() {
     return "index.jsp";
 }
}

	
//	@RequestMapping("/projects")
//		public String projects () {
//			return "My projects!";
//	}
//	@RequestMapping("/me")
//	public String me () {
//		return "Hello World!";
	
	
	

