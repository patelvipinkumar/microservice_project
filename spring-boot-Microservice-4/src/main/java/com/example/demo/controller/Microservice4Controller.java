package com.example.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import brave.sampler.Sampler;

@RestController
public class Microservice4Controller {
	private final Logger LOG=LoggerFactory.getLogger(this.getClass());
	
	@Bean
	public Sampler defaultSampler() {
		return Sampler.ALWAYS_SAMPLE;
	}
	
	@GetMapping(value="/microservice4")
	public String hello4() {
		LOG.info("Hello World Microservice4");
		return "Hello World";
		
	}
}
