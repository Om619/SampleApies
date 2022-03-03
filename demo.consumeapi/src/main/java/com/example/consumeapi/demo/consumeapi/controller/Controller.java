package com.example.consumeapi.demo.consumeapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.consumeapi.demo.consumeapi.model.Details;
import com.example.consumeapi.demo.consumeapi.service.ServiceLayer;

@RestController
public class Controller {

	private final ServiceLayer servicelayer;

	@Autowired
	public Controller(ServiceLayer servicelayer) {
		this.servicelayer = servicelayer;
	}
	
	@GetMapping("/")
	public ResponseEntity<Details> getData()
	{
		return new ResponseEntity<>(servicelayer.consumeAPI(),HttpStatus.OK);
	}
}
