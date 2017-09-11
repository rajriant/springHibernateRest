package com.rajeev.service.impl;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Collections;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rajeev.dao.RegistraionServiceDao;
import com.rajeev.model.EleaveUserDetail;
import com.rajeev.model.Employee;
import com.rajeev.service.RegistrationService;

@Service("registrationService")
@Transactional
public class RegistrationServiceImpl implements RegistrationService {
	@Autowired
	private RegistraionServiceDao registraionServiceDao;

	public long saveEmployee() {
		long noofTimes = 500;
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Date date = new Date();
		System.out.println(dateFormat.format(date));
		long i=1;
		for ( i = 1; i <= noofTimes; i++) {
			Employee employee = new Employee();
			employee.setName("testname" + i);
			employee.setDate(date);
			employee.setSalary(i);
			employee.setSsn("SSN0000000" + i);
			registraionServiceDao.saveEmployee(employee);
			System.out.println("\n Rows inserted:  _-_ " + i);
		}
		return i;
	}

	public void saveEleaveUserDetail(EleaveUserDetail eleaveUserDetail) {
		registraionServiceDao.saveEleaveUserDetail(eleaveUserDetail);

	}

	public List<Employee> findAllUsers() {
		System.out.println("inside registraitonserviceimpl.........");

		// return registraionServiceDao.findAllUsers();
		List<Employee> list = registraionServiceDao.findAllUsers();
		for (int i = 0; i < list.size(); i++) {

		}
		return Collections.EMPTY_LIST;
	}

}
