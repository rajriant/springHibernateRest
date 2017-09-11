package com.rajeev.controller;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import org.json.JSONObject;
import org.json.XML;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.rajeev.model.EleaveUserDetail;

public class SpringRestClient {

	private static RestTemplate restTemplate = new RestTemplate();
	private static final String baseURL = "urlhere";

	// getuserdetail?userid=nchauhan

	public static void main(String[] args) {

		// restTemplate.getForObject(url, responseType)
		// ResponseEntity<String> response =
		// String.class);
				
		ResponseEntity<String> response = restTemplate.getForEntity(baseURL+ "", String.class);
		
		  if (HttpStatus.OK == response.getStatusCode()) {
		        System.out.println(response);
		  }else if(HttpStatus.UNAUTHORIZED==response.getStatusCode()){
			  System.out.print("Unauthorized!!!");
		  }else{
			  System.out.println("some other problem");
		  }
		  	
	
	
	}
	

}



