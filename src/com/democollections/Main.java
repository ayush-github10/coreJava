package com.democollections;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		List<Student> st=new ArrayList<>();
		st.add(new Student(1,"AYU"));
		st.add(new Student(2,"AKSH"));
		st.add(new Student(10,"rahul"));
		//Collections.sort(st,new Sortstudent());
		System.out.println(st);
	}

	

}
