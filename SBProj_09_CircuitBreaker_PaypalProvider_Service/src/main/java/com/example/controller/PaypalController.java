package com.example.controller;

import java.util.Random;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaypalController {
	
	@GetMapping("/paypaltxn")
	String paypalAMt()
	{
		return "Payment receieved of amoount"+new Random().nextInt(1000);
	}

}
