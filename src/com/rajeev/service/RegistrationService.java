package com.rajeev.service;

import java.util.List;

import com.rajeev.model.EleaveUserDetail;
import com.rajeev.model.Employee;

public interface RegistrationService {
	void saveEleaveUserDetail(EleaveUserDetail eleaveUserDetail);
	long saveEmployee();
	List<Employee> findAllUsers(); 
	
}
