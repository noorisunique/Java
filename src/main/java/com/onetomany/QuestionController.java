package com.onetomany;

import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QuestionController {

	@Autowired
	QuestionRepository questionRepository;

	/*
	 * @GetMapping("/eagerload") public List<Employee> eagerload(){
	 * List<Employee> employees=(List<Employee>) employeeRepository.findAll();
	 * return employees; }
	 * 
	 * @GetMapping("/lazyload") public String lazyload(){ List<Employee>
	 * employees=(List<Employee>) employeeRepository.findAll();
	 * 
	 * String city=employees.get(0).getAddress().getCity(); return city; }
	 */

	@PostMapping("/question")
	public Question createNote(@Valid @RequestBody Question question) {

		return questionRepository.save(question);
	}
}
