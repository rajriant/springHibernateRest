package com.rajeev.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.rajeev.model.EleaveUserDetail;
import com.rajeev.model.Employee;
import com.rajeev.service.RegistrationService;

@RestController
public class AuthenticateController {

	@Autowired
	 private RegistrationService registrationService;

	
	@RequestMapping("/authenticate")
	public String welcome() {// Welcome page, non-rest
		
			List<Employee> employee = registrationService.findAllUsers();
			System.out.println("users list"+employee.size());

		return "Welcome to RestTemplate Example.";
	}
	
	@RequestMapping("/insert")
	public String insertUsers() {
		
	long i=	registrationService.saveEmployee();
	
		return "Rows inserted ::::"+i;
		
	}
	
	@RequestMapping("/list")
    public String listUsers() {
 
      List<Employee> users =registrationService.findAllUsers();
      System.out.println("usersssssssssssssssss "+users.size());
   
        return "userslist";
    }
	
	
	

	@RequestMapping(value = "/projectregistration", method = RequestMethod.POST, produces = "application/json", consumes = "application/json")
	@ResponseBody
	public String getUser(@RequestBody String json)
			throws JsonProcessingException {

		EleaveUserDetail eleaveUserDetail = new EleaveUserDetail();
		ObjectMapper mapper = new ObjectMapper();
		try {
			// JSON from String to Object
			eleaveUserDetail = mapper.readValue(json, EleaveUserDetail.class);
			// do some things with json, put some header information in json

		} catch (Exception e) {
			e.printStackTrace();
		}

		 //service.saveEleaveUserDetail(eleaveUserDetail);

		System.out.println("hi......" + eleaveUserDetail.getAdminAsstName());
		return mapper.writeValueAsString(eleaveUserDetail);

	}
}
