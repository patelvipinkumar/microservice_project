package com.dashboard.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dashboard.dao.CityRepository;
import com.dashboard.model.CityDetails;

@Service("CityDetailsService")
public class CityDetailsService implements ICityDetailsService {
	
	@Autowired
	private CityRepository cityRepository;
		

	@Override
	public List<CityDetails> getCityDetails() {
		List<CityDetails> l=new ArrayList<>();
		cityRepository.findAll().forEach(l::add);
		return l;
	}



	@Override
	public List<CityDetails> getByState(String stateUnionterritory) {

		List<CityDetails> list = cityRepository.findStateUnionterritoryAndDistrictCodeAndDistrictByStateUnionterritory(stateUnionterritory);
		
		return list;
	}



	@Override
	public List<CityDetails> getByCity(String cityTown) {
		List<CityDetails> list = cityRepository.findStateUnionterritoryAndDistrictByCityTown(cityTown);
		return list;
	}



	@Override
	public List<CityDetails> getByDistrict(String district) {
		List<CityDetails> list = cityRepository.findTownByDistrict(district);
		return list;
	}

	
	




	
}
