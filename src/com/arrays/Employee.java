package com.arrays;

public class Employee {
	String empName;
	int empId;
	long empSalary;//some of the salaries must be greater than 25000
	
	public Employee(String empName, int empId, long empSalary) {
		this.empName = empName;
		this.empId = empId;
		this.empSalary = empSalary;
	}
	@Override
	public String toString() {
		return "Employee10 [empName=" + empName + ", empId=" + empId + ", empSalary=" + empSalary + "]";
	}


}