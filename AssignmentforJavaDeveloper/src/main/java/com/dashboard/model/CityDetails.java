package com.dashboard.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
public class CityDetails {
	@Id
	private int id;

	@Column(name = "city_town")
	private String cityTown;
	@Column(name = "urban_status")
	private String urbanStatus;
	@Column(name = "state_code")
	private int stateCode;
	@Column(name = "state_unionterritory")
	private String stateUnionterritory;
	@Column(name = "district_code")
	private int districtCode;
	@Column(name = "district")
	private String district;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCityTown() {
		return cityTown;
	}
	public void setCityTown(String cityTown) {
		this.cityTown = cityTown;
	}
	public String getUrbanStatus() {
		return urbanStatus;
	}
	public void setUrbanStatus(String urbanStatus) {
		this.urbanStatus = urbanStatus;
	}
	public int getStateCode() {
		return stateCode;
	}
	public void setStateCode(int stateCode) {
		this.stateCode = stateCode;
	}
	public String getStateUnionterritory() {
		return stateUnionterritory;
	}
	public void setStateUnionterritory(String stateUnionterritory) {
		this.stateUnionterritory = stateUnionterritory;
	}
	public int getDistrictCode() {
		return districtCode;
	}
	public void setDistrictCode(int districtCode) {
		this.districtCode = districtCode;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	
	
	
}
