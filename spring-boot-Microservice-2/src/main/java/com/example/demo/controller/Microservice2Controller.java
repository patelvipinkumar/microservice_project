package com.example.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.Microservice2Service;

import brave.sampler.Sampler;

@RestController
public class Microservice2Controller {
	private final Logger LOG=LoggerFactory.getLogger(this.getClass());
	
	
	@Autowired
	Microservice2Service microservice2Service;
	
	@Bean
	public Sampler defaultSampler() {
		return Sampler.ALWAYS_SAMPLE;
	}
	@GetMapping(value = "/microservice2")
	public String hello2() {
		LOG.info("Inside hello2");
		String response=microservice2Service.hello2();
		LOG.info("The response received by hello2 " + response);
		return response;
		
	}

}
