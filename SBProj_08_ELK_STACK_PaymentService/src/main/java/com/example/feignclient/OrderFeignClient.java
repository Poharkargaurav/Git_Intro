package com.example.feignclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("OrderService")
public interface OrderFeignClient {

	
	@GetMapping("/order/random")
    String callOrderMeth();
   
}
