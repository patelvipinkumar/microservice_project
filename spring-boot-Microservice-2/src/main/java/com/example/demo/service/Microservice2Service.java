package com.example.demo.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(url="http://localhost:8043/",name="microservice3")
public interface Microservice2Service {
	
	@GetMapping("/microservice3")
	public String hello2();

}
