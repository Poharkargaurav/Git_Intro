package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Bill;
import com.example.openFeign.IBillingClientComp;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping("/payment")
public class PaymentController {

	@Autowired
	IBillingClientComp clientComp;
	
	@GetMapping("/billnm/{param}")
	public String getMethodName(@PathVariable String param) {
		return clientComp.getBill(param);
	}
	
	
	@PostMapping("/billamt")
	public String postMethodName(@RequestBody Bill bill) {
		//TODO: process POST request
		
		return clientComp.genBillAmtRRr(bill);
	}
	
	
	@PostMapping("/rbillamt")
	public String postM(@RequestBody Bill bill ) {
		//TODO: process POST request
		
		return clientComp.genBillAmt(bill).getBody();
	}
	
	
}
