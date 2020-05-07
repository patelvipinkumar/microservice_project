package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Employee;
import com.example.demo.services.EmployeeService;

@RestController
@RequestMapping("/api")
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping("/employee")
	public List<Employee> getAllEmployees(){
		return employeeService.getAllEmployees();
		
	}
	
	@GetMapping("/employee/{id}")
	public Optional<Employee> getEmployee(@PathVariable int id){
		return employeeService.getEmployee(id);
		
	}
	
	@PostMapping("/employee")
	public void addEmployee(@RequestBody Employee emp) {
		employeeService.addEmplyee(emp);
	}
	
	@DeleteMapping("/employee/{id}")
	public String deleteEmployee(@PathVariable int id) {
		return employeeService.deleteEmployee(id);
		
	}
	
	@PutMapping("/employee/{id}")
	
	public Employee updateEmployee(@RequestBody Employee emp, @PathVariable int id) throws Exception  {
        System.out.println(this.getClass().getSimpleName() + " - Update employee details by id is invoked.");
 
        Optional<Employee> emp1 =  employeeService.getEmployee(id);
        if (!emp1.isPresent())
            throw new Exception("Could not find employee with id- " + id);
 
        /* IMPORTANT - To prevent the overriding of the existing value of the variables in the database, 
         * if that variable is not coming in the @RequestBody annotation object. */    
        if(emp.getName() == null || emp.getName().isEmpty())
            emp.setName(emp1.get().getName());
        if(emp.getCity() == null || emp.getCity().isEmpty())
            emp.setCity(emp1.get().getCity());
        if(emp.getSal() == 0)
            emp.setSal(emp1.get().getSal());
 
        // Required for the "where" clause in the sql query template.
        emp.setId(id);
        return employeeService.updateEmplyee(emp);
    }
	

}
