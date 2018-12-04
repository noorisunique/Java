package com.spring;

import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebController {
	
	@Autowired
	CustomerService customerService;
	
	@RequestMapping(value = "/customer/{name}")
	public Customer findCustomerByName(@PathVariable("name") String name) {
 
		Customer cust = customerService.findCustomerByName(name);
 
		if (null == cust) {
			throw new CustomNotFoundException("Not found customer with name is " + name);
		}
 
		return cust;
	}
	
	@PostMapping(path = "/members", consumes = "application/json", produces = "application/json")
	public String addMember(@RequestBody Customer member) {
		ObjectMapper mapper = new ObjectMapper();

		try {
		    // convert user object to json string and return it 
		    return mapper.writeValueAsString(member);
		}
		catch (Exception  e) {
		    // catch various errors
		    e.printStackTrace();
		}
		
		return null;
	}
}