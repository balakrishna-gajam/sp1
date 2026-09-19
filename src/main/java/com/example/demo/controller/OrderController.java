package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {
	
	
	@GetMapping("/t1")
	public String first() {
		
		return "hi welcome back";
	}
	
	@GetMapping("/")
	public String first1() {
		
		return "hi welcome back";
	}

}
