package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/demo")
public class HelloWorldController 
{
	@GetMapping("/welcome/{name}")
	public String welcomeMsg(@PathVariable String name)
	{
		return "Welcome "+name+" to openshift container deployment demo.";
	}
}
