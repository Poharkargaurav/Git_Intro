package com.example.demo.clientcomp;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class LBCcomphelper {

	@Autowired
	LoadBalancerClient client;

	public String getBillInfoFromProducer()
	{
		//it provide instance of provider with low load factor
			ServiceInstance instance=client.choose("Billing-Service");
			
			URI uri=instance.getUri();
			
			
			String url=uri+"/billing/info";
			
			System.out.println("LBC client helper");
			
			RestTemplate template=new RestTemplate();
		ResponseEntity<String> resultEntity=template.getForEntity(url, String.class);
	       return resultEntity.getBody();
	}
}
