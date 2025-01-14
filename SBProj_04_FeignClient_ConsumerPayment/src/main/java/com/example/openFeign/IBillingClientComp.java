package com.example.openFeign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.model.Bill;

@FeignClient("Billing-Service")
public interface IBillingClientComp {

	@GetMapping("/billing/report/{name}")
	String getBill(@PathVariable String name);
	
	@PostMapping("/billing/billamt")
ResponseEntity<	String >genBillAmt(@RequestBody Bill bill);
	
	
	@PostMapping("/billing/rbillamt")
   String genBillAmtRRr(@RequestBody Bill bill);
}
