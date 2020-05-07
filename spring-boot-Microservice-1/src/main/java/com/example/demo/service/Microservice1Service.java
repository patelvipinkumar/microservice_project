package com.example.demo.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(url="http://localhost:8042",name="microservice2")
public interface Microservice1Service {
	
	@GetMapping("/microservice2")
	public String hello1();
	
	

}
