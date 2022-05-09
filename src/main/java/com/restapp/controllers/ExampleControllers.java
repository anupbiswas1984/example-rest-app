package com.restapp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.restapp.services.ExampleService;

@RestController
public class ExampleControllers {
	
	@Autowired
	private ExampleService service;

	@GetMapping({ "/", "/health" })
	public ResponseEntity<String> healthCheck() {
		String hostname = service.getHostName();
		return new ResponseEntity<String>("Application v1 Is Running from "+ hostname , HttpStatus.OK);
	}
}
