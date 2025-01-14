package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import io.github.resilience4j.retry.annotation.Retry;

@RestController
public class FlipkartController {

	
	@GetMapping("/orderpay")
	@CircuitBreaker(name = "PaypalService" , fallbackMethod = "fallmeth")
	String orderNow()
	{
		
		System.out.println("Flipkart method");
		RestTemplate template=new RestTemplate();
		
		String url="http://localhost:8081/paypaltxn";
		
	return	template.getForObject(url, String.class);
	}
	
	 String fallmeth(Exception e)
	{
		return "Dummy respose try after certain time";	}
	
	
}
