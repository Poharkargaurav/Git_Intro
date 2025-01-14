package com.example.controller;

import java.util.Random;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/order")
@Slf4j
public class OrderController {

	
	@GetMapping("/random")
	String randomGen()
	{
		int i;
		log.info("RandomGen Method Called");
		
		i=new Random().nextInt(100);
		  try {
		
		if(i<50)
			throw new IllegalArgumentException("Value less than 50");
		  log.error("Exception triggered for less than 50");
		  }
		  catch(Exception e)
		  {
			  return "Try after sometime";
		  }
		return new String("The random value generated is "+i);
	}
	
}
