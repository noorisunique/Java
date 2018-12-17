package com.insertintoDB;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class WebController {
	
	@Autowired
	CustomerRepository repository;

	@GetMapping("/get")
	public String get() {
		return "HHHHHHHHHHHHHh....";
	}

	@PostMapping(path = "/post", consumes = "application/json", produces = "application/json")
	public String post(@RequestBody Customer customer) {
		repository.save(customer);
		return "Inserted Successfull";
	}
}