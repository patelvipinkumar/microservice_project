package com.example.demo.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.EmployeeRepository;
import com.example.demo.model.Employee;

@Service("EmployeeServiceImp")
public class EmployeeServiceImp implements EmployeeService {
	
	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public List<Employee> getAllEmployees() {
		List<Employee> emp=new ArrayList<Employee>();
		employeeRepository.findAll().forEach(emp::add);
		return emp;
	}

	@Override
	public void addEmplyee(Employee emp) {
		employeeRepository.save(emp);
		
	}

	@Override
	public Employee updateEmplyee(Employee emp) {
		return employeeRepository.save(emp);
		
	}

	@Override
	public String deleteEmployee(int id) {
		employeeRepository.deleteById(id);
		return "deleted employee successfullly";
		
	}

	@Override
	public Optional<Employee> getEmployee(int id) {
		return employeeRepository.findById(id);
	}

}
