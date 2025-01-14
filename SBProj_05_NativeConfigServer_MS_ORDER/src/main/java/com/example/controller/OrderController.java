package com.example.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class OrderController {

	@Value("${custom.username}")
	String name;
	@Value("${custom.password}")
	String pass;
	
	@GetMapping("/getdetails")
	public String getUserDetails() {
		return new String("username: "+name +" Password: "+pass);
	}
	
}
