package com.rajeev.model;

import java.io.Serializable;

public class EmployeeDetail implements Serializable{

	private static final long serialVersionUID = 1L;
	private long id;
	private String name;
	private Integer salary;
	private String ssn;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getSalary() {
		return salary;
	}

	public void setSalary(Integer salary) {
		this.salary = salary;
	}

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

}
