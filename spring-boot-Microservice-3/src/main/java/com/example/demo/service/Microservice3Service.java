package com.example.demo.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(url = "http://localhost:8044/",name = "microservice4")
public interface Microservice3Service {
	@GetMapping("/microservice4")
	public String hello3();
}
