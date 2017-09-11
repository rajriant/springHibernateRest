package com.rajeev.dao;

import java.util.List;

import com.rajeev.model.EleaveUserDetail;
import com.rajeev.model.Employee;

public interface RegistraionServiceDao {
	

	void saveEleaveUserDetail(EleaveUserDetail eleaveUserDetail);
	
	void saveEmployee(Employee employee);
	List<Employee> findAllUsers(); 
	

}
