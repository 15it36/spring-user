package com.example.demo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {

	@RequestMapping("/")
	public String index() {
		return "Hello User";
	}

	@RequestMapping("/new-url")
	public String new_api(){
		return "New Api";
	}

	@RequestMapping("/new-api2")
	public String new_api1(){
		return "New Api 2";
	}

}