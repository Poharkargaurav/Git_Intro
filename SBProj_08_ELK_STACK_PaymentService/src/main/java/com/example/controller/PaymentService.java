package com.example.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.feignclient.OrderFeignClient;

import lombok.extern.slf4j.Slf4j;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/Payment")
@Slf4j
public class PaymentService {

	@Autowired
	OrderFeignClient client;
	
	@GetMapping("/gpay")
	public String payNOrder() {
		log.info("Payment Started in Payment contorller");
		return client.callOrderMeth(); 
	}
	
}
