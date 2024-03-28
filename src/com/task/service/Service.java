package com.task.service;

import java.util.ArrayList;
import java.util.List;

import com.task.model.Employee;

public class Service implements Demo{
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Service sc=new Service();
		Employee e1=new Employee(12, "Ayush");
		Employee e2=new Employee(12, "Ayush");
		sc.add(e1,e2);
		
		

	}

	@Override
	public void add(Employee e1, Employee e2)
	{
		// TODO Auto-generated method stub
		List<Employee> lis= new ArrayList<>();
		lis.add(e1);
		lis.add(e2);
		System.out.println(lis);
		
		
	}

}
