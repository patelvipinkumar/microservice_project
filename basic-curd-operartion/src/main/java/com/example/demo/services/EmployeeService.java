package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import com.example.demo.model.Employee;

public interface EmployeeService {
	
	public List<Employee> getAllEmployees();
	public void addEmplyee(Employee emp);
	public String deleteEmployee(int id);
	public Optional<Employee> getEmployee(int id);
	public Employee updateEmplyee(Employee emp);
	
}
