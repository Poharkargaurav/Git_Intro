package com.example.schedule;

import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class Report {

	
	@Scheduled(cron =" 0/20 * * * * *")
	public void report()
	{
		System.out.println("Report genrated at "+new Date());
	}
	
	
	@Scheduled(cron ="10 * * * * *           ")
	public void reminder()
	{
		System.out.println("Report genrated at "+new Date());
	}
}
