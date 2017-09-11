package com.rajeev.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.rajeev.model.EleaveUserDetail;


public abstract class AbstractDao {

	@Autowired
	private SessionFactory sessionFactory;

	protected Session getSession() {
		return sessionFactory.getCurrentSession();
	}

	public void persist(Object entity) {
		getSession().persist(entity);
	}

	public void save(Object entity) {
		getSession().save(entity);
		getSession().flush();
		
	}
	public void delete(Object entity) {
		getSession().delete(entity);
			
	}
	
	/*public List<EleaveUserDetail> findAllUsers() {
		
	}
	*/
	
}

