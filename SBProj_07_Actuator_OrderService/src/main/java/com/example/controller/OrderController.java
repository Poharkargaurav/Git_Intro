package com.example.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/order")
public class OrderController {

	
	

	@GetMapping("/home")
	public String home(@RequestParam String param) {
    return new String("WELCOME !!!PLease place your order");
}

	
}
