package com.example.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.Microservice3Service;

import brave.sampler.Sampler;

@RestController
public class Microservice3Controller {
	private final Logger LOG=LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	Microservice3Service microservice3Service;
	
	@Bean
	public Sampler defaultSampler() {
		return Sampler.ALWAYS_SAMPLE;
	}
	
	@GetMapping(value = "/microservice3")
	public String hello3() {
		
		LOG.info("Inside hello3");
		
		String response=microservice3Service.hello3();
		
		LOG.info("The response received by hello3 " + response);
		return response;
		
	}

}
