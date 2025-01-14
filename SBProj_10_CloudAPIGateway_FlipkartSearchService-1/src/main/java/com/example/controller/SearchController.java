package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/search")
public class SearchController {
	
	@GetMapping("/pen")
	public String serarchmeth() {
		return new String("search service : pen");
	}
	
	@GetMapping("/pencil")
	public String searchmethi() {
		return new String("search  service :pencil");
	}
	

}