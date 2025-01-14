package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SbProj05ExtConfigServerMs1OrderApplication {

	public static void main(String[] args) {
		SpringApplication.run(SbProj05ExtConfigServerMs1OrderApplication.class, args);
	}

}
