package com.dashboard.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.dashboard.model.CityDetails;
import com.dashboard.service.ICityDetailsService;

@RestController
public class UserController {
	@Autowired
	private ICityDetailsService cityDetailsService;
	
	
	@GetMapping("/city")
	public List<CityDetails> getAll() {
		return cityDetailsService.getCityDetails();
	}

	
	@GetMapping("/state")
	public List<CityDetails> getByState(@RequestParam("name") String state) {
		return cityDetailsService.getByState(state);
	}
	
	@GetMapping("/town")
	public List<CityDetails> getBycity(@RequestParam("name") String cityTown) {
		return cityDetailsService.getByCity(cityTown);
	}
	@GetMapping("/district")
	public List<CityDetails> getByDistrict(@RequestParam("name") String district) {
		return cityDetailsService.getByDistrict(district);
	}
	
	
}
