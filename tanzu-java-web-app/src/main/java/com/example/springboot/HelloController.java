package com.example.springboot;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {

	@RequestMapping("/")
	public String index() {
	    java.lang.System.exit(1);
	    return "Greetings from Spring Boot + Tanzu!!!";
	}

}