package com.cjc.demoproject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	
	@GetMapping(value="/document")
	public String getDocument() {
		return "success";
		
	}
}
