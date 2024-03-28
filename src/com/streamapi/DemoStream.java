package com.streamapi;

import java.util.ArrayList;
import java.util.List;

import com.streamAPIdemo.Employee;

public class DemoStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee> num=new ArrayList<>();
		num.add(new Employee(1,"AYUSH",50000));
		num.add(new Employee(2,"AJAY",60000));
		num.add(new Employee(3,"ANIKET",80000));
		System.out.println(num.stream().mapToDouble(e->e.sal).sum());
		

	}

}
