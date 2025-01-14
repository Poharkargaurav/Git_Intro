package com.example.schedule;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "college.mca")
public class ConfigurationProp {

	
	String deparatment;
	String classroom;
}
