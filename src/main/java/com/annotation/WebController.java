package com.annotation;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebController {

	@GetMapping("/get")
	public String get() {
		return "HHHHHHHHHHHHHh....";
	}

	@PostMapping(path = "/members", consumes = "application/json", produces = "application/json")
	public String addMember(@RequestBody Customer member) {
		
		return null;
	}
}