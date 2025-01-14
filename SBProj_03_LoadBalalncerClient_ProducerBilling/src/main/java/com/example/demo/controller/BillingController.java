package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/billing")
public class BillingController {

	@Value("${server.port}")
	private Integer port;
	
	@Value("${eureka.instance.instance-id}")
	private String instanceID;
	
	@GetMapping("/info")
	ResponseEntity<String> getBillingInfo()
	{
		try {
		Thread.sleep(10000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return new ResponseEntity<String>("Billing Service"+"port no="+port+instanceID, HttpStatus.OK);
	}
}
