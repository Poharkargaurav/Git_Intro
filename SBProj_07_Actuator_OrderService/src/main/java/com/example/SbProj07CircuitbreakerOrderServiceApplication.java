package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class SbProj07CircuitbreakerOrderServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SbProj07CircuitbreakerOrderServiceApplication.class, args);
	}

}
