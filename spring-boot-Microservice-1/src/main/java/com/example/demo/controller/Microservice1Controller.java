package com.example.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.Microservice1Service;

import brave.sampler.Sampler;

@RestController
public class Microservice1Controller {
	private final Logger LOG=LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	Microservice1Service microservice1Service;
	@Bean
	public Sampler defaultSampler() {
		return Sampler.ALWAYS_SAMPLE;
	}
	
	@GetMapping("/microservice1")
	public String hello1() {
        LOG.info("Inside hello1");
		String response=microservice1Service.hello1();
		LOG.info("The response received by hello2 " + response);
		return response;
	}
}
