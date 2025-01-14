package com.example.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
@RefreshScope
public class OrderController {

	@Value("${custom.username}")
	String name;
	@Value("${custom.password}")
	String pass;

	@GetMapping("/userdetails")
	public String getMethodName() {
		return new String(name+" and "+pass);
	}
	
}
