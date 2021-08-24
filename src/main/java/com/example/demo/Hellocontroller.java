package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hellocontroller {

    @GetMapping("/")
	public String index() {
		return "Welcome to Sample Vikki 08232021 Project!!!";
	}
    
}
