package com.example.consumeapi.demo.consumeapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.consumeapi.demo.consumeapi.model.Details;

@Service
public class ServiceLayer {

	private final RestTemplate restTemplate;

	@Autowired
	public ServiceLayer(RestTemplate restTemplate) {
		this.restTemplate = restTemplate;
	}
	
	public Details consumeAPI()
	{
		return restTemplate.getForObject("https://jsonplaceholder.typicode.com/todos/1",Details.class);
	}
}
