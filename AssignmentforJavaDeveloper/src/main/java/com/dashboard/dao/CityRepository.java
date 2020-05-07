package com.dashboard.dao;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.dashboard.model.CityDetails;


@Repository
public interface CityRepository extends CrudRepository<CityDetails, Integer> {

	
	
	List<CityDetails> findStateUnionterritoryAndDistrictCodeAndDistrictByStateUnionterritory(String stateUnionterritory);

	List<CityDetails> findStateUnionterritoryAndDistrictByCityTown(String cityTown);
	List<CityDetails> findTownByDistrict(String district);
	
	

	
}