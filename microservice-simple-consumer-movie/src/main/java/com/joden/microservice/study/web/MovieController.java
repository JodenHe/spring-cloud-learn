package com.joden.microservice.study.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.joden.microservice.study.entity.User;

@RestController
public class MovieController {
	
	@Autowired
	private RestTemplate restTemplate;

	@GetMapping("/user/{id}")
	public User findById(@PathVariable Long id) {
		String url = "http://localhost:8000/" + id;
		return this.restTemplate.getForObject(url, User.class);
	}
}