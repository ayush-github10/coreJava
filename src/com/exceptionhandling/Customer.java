package com.exceptionhandling;

public class Customer {
	String cusName;
	int cusId;
	int salary;
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		if(this.salary>0)
		this.salary = salary;
	
	}
	

}
