package com.hibernateInsert.copy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {

	@Autowired
	private CustomerRepository repository;
	
	@GetMapping("/customer")
	public void get(){
		System.out.println(repository.findByLastName("Bauer"));
	}
}
