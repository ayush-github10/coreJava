package com.assignment;

import java.io.Serializable;

public class Employee implements Serializable,Search {
	String emp_name;
	int emp_id;
	public Employee(String emp_name, int emp_id) {
		super();
		this.emp_name = emp_name;
		this.emp_id = emp_id;
	}
	@Override
	public String toString() {
		return "Employee [emp_name=" + emp_name + ", emp_id=" + emp_id + "]";
	}
	@Override
	public void sc() {
		// TODO Auto-generated method stub
		
	}
	

}
