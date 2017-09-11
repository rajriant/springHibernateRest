package com.rajeev.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import com.rajeev.dao.AbstractDao;
import com.rajeev.dao.RegistraionServiceDao;
import com.rajeev.model.EleaveUserDetail;
import com.rajeev.model.Employee;

@Repository("RegistraionServiceDao")
public class RegistrationServiceDaoImpl extends AbstractDao implements RegistraionServiceDao {

	public void saveEleaveUserDetail(EleaveUserDetail eleaveUserDetail) {
		persist(eleaveUserDetail);

	}
	public void saveEmployee(Employee employee) {
		save(employee);

	}
	
	public List<Employee> findAllUsers() {
	
		System.out.println("HI.....");
		Session session = getSession();
		Query query = session.createQuery("from Employee");
		return query.list();
	}

}
