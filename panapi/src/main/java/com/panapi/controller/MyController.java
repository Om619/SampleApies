package com.panapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.panapi.models.PanBody;
import com.panapi.response.ApiResponse;
import com.panapi.response.PanModel;
import com.panapi.services.Services;

@RestController
public class MyController {
	@Autowired
	private Services services;

	@PostMapping("/ApiUser")
	public ApiResponse getUserApi(@RequestBody PanBody panbody)
	{
		ApiResponse apiresponse=this.services.consumeApi(panbody);
		//return this.services.consumeApi(panbody);
	return apiresponse;
	}
//	public ApiResponse getUserApi(@RequestBody PanBody panbody)
//	{
//		ApiResponse apiresponse=this.services.consumeApi(panbody);
//		//return this.services.consumeApi(panbody);
//	return apiresponse;
//	}
	
}
