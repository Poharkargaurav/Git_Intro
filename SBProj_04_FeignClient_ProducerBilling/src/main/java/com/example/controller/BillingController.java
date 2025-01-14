package com.example.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Bill;

@RestController
@RequestMapping("/billing")
public class BillingController {

	@Value("${server.port}")
	private Integer port;
	
	@GetMapping("/report/{name}")
	String billReport(@PathVariable String name)
	{
	
		
		try {
			Thread.sleep(10000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return "Bill genarated on name of"+name +"port no"+port;
	}
	@PostMapping("/billamt")
	String getBillAmount(@RequestBody Bill bill)
	{
		try {
			Thread.sleep(10000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return "Bill Genrate"+(bill.getP1()+bill.getP2())+" with price of product "+bill.getP1()+" "+bill.getP2();
	}
	@PostMapping("/rbillamt")
	public ResponseEntity<String> getBillAmount1(@RequestBody Bill bill)
	{
		
		//To see LBC
		try {
			Thread.sleep(10000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
		return new ResponseEntity<>("Bill Genrate RRR"+(bill.getP1()+bill.getP2())+" with price of product "+bill.getP1()+" "+bill.getP2(),
				HttpStatus.CREATED) ;
	}
	
}
