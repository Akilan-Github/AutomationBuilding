package com.example.automationbuilding.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AutomationController {
	@GetMapping("/getab")
	public String getMsg() {
		return "Hi";
		
	}

}
