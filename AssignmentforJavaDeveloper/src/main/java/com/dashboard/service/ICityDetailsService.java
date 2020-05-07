package com.dashboard.service;

import java.util.List;
import java.util.Optional;

import com.dashboard.model.CityDetails;

public interface ICityDetailsService {

	
		
		
	public List<CityDetails> getCityDetails();
	
	public List<CityDetails> getByCity(String cityTown);
	public List<CityDetails> getByDistrict(String district);
	public List<CityDetails> getByState(String stateUnionterritory);

	
}
