package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class SbProj05NativeConfigServerConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SbProj05NativeConfigServerConfigServerApplication.class, args);
	}

}
