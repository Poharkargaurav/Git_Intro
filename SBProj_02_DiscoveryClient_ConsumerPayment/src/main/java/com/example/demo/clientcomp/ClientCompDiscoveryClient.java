package com.example.demo.clientcomp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component 
public class ClientCompDiscoveryClient {
	@Autowired
	private DiscoveryClient client;
	//manual coding no LBC
	public String getBillingInfoHelper()
	{
	List<ServiceInstance> instances=client.getInstances("Billing-Service");
	ServiceInstance instance=instances.get(0);
	
	String uri=instance.getUri()+"/billing/info";
	
	RestTemplate template=new RestTemplate();
    String result=	template.getForObject(uri, String.class);
	return result;
	}
			
}
