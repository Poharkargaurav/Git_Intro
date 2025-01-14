package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.clientcomp.ClientCompDiscoveryClient;

@RequestMapping("/payment")
@RestController
public class PaymentsController {
	
	@Autowired
	ClientCompDiscoveryClient client;
	
	@GetMapping("/status")
	String getStatus()
	{
		return client.getBillingInfoHelper();
	}

}
