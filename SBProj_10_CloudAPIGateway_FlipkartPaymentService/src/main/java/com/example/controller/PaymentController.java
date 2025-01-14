package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payment")
public class PaymentController {
	
	@GetMapping("/upi")
	public String payWithUpi() {
		return new String("Payment service :paying with UPI");
	}
	
	@GetMapping("/cc")
	public String payWithCc() {
		return new String("Payment service :paying with CC");
	}
	

}
