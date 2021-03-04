package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test {

	@GetMapping("/get/data")
	public String data() {
		return "Hi Shivaji Chandra  gupta";
	}
}
