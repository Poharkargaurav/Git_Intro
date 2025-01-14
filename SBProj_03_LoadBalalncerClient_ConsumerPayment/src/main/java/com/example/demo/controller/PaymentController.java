package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.clientcomp.LBCcomphelper;

@RestController
@RequestMapping("/payment")
public class PaymentController {
	
	@Autowired
	LBCcomphelper ccomphelper;

	@GetMapping("/status")
	String getStatus()
	{
		System.out.println("Consumer controller");
		return ccomphelper.getBillInfoFromProducer();
	}
}
