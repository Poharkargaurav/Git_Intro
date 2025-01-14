package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/billing")
@RestController
public class BillingController {
	
	@GetMapping("/info")
	String getInfo()
	{
		return "Get Meth from Producer:Bill generated of 200";
	}

}
