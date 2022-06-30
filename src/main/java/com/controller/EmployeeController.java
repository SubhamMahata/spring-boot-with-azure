package com.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("azure")
public class EmployeeController {
	
	@GetMapping(value="say/{name}")
	public String sayHello(@PathVariable("name") String name) {
		return "Welcome to Spring boot with Azure "+name;
	}

}
