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
	private static final String baseURL = "http://10.248.80.14/ELEAVEID2/eleave/";

	// getuserdetail?userid=nchauhan

	public static void main(String[] args) {

		// restTemplate.getForObject(url, responseType)
		// ResponseEntity<String> response =
		// restTemplate.getForEntity("http://10.248.80.14/ELEAVEID2/eleave/getuserdetail?userid=nchauhan",
		// String.class);
				
		ResponseEntity<String> response = restTemplate.getForEntity(baseURL+ "getuserdetail?userid=nchauhan", String.class);
		
		  if (HttpStatus.OK == response.getStatusCode()) {
		        System.out.println(response);
		  }else if(HttpStatus.UNAUTHORIZED==response.getStatusCode()){
			  System.out.print("Unauthorized!!!");
		  }else{
			  System.out.println("some other problem");
		  }
		  	
	//converting to json	
		/*String soapmessageString = response.toString();
		JSONObject soapDatainJsonObject = XML.toJSONObject(soapmessageString);
		System.out.println(soapDatainJsonObject);*/
		    
	/*	EleaveUserDetail eleaveUserDetail = restTemplate.getForObject(baseURL+ "getuserdetail?userid=nchauhan", EleaveUserDetail.class,200);
		System.out.println("AdminName: " + eleaveUserDetail.getAdminName());
        System.out.println("AdminAssistant name: " + eleaveUserDetail.getAdminAsstName());*/
      
	
	}
	

}



