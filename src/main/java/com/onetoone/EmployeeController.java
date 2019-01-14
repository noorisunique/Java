package com.onetoone;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

	@Autowired
	EmployeeRepository employeeRepository;


	@GetMapping("/eagerload")
	public List<Employee> eagerload(){
		List<Employee> employees=(List<Employee>) employeeRepository.findAll();
		return employees;
	}
	@GetMapping("/lazyload")
	public String lazyload(){
		List<Employee> employees=(List<Employee>) employeeRepository.findAll();
		
		String city=employees.get(0).getAddress().getCity();
		return city;
	}
	
	
	@PostMapping("/employee")
	public Employee createNote(@Valid @RequestBody Employee employee) {
		System.out.println(employee.getAddress());
	    return employeeRepository.save(employee);
	}
}
