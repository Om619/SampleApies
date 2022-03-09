package com.panapi.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.panapi.models.PanBody;
import com.panapi.response.ApiResponse;
import com.panapi.response.PanModel;

@Service
public class Services {
	RestTemplate restTemplate;
	
	//public ResponseEntity<ApiResponse> consumeApi(PanBody panbody)
	public ApiResponse consumeApi(PanBody panbody)
	{
		HttpHeaders headers = new HttpHeaders();
		headers.add("Token","MzNkYTg3ZGYtYzkwNS00OTk2LTllZmItMWI2ZTM4OGU1YTNi");
		String url = "http://dev.torusdigital.in/Document/PanValidation";
		//HttpEntity<PanModel> entity = new HttpEntity<PanModel>(panbody, headers);
		HttpEntity<PanBody> entity=new HttpEntity<PanBody>(panbody,headers);
		//HttpEntity<String> entity=new HttpEntity<String>(panbody,headers);
		restTemplate=new RestTemplate();
		ResponseEntity<ApiResponse> responseEntity = restTemplate.postForEntity(url, entity, ApiResponse.class);
		System.out.println(responseEntity);
        //return responseEntity;
		return responseEntity.getBody();
	}

}
