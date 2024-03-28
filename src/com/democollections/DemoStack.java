package com.democollections;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;
import java.util.HashMap;


public class DemoStack {
	public static void main(String[] args) {
		
		/*Stack<Integer> st=new Stack<>();
		st.push(10);
		st.push(58);
		st.push(12);
		System.out.println(st);
		System.out.println(st.capacity());*/
		Map<Integer,String> str=new HashMap<>();
		Map<Integer,Employee> em=new HashMap<>();
		//em.put(1,new Employee("AYUSH",7655));
		//em.put(2, new Employee("ANIKEY",7644));
		em.getOrDefault(em, new Employee("AYU",76));
		System.out.println(em.getOrDefault(em, new Employee("AYU",76)));
		
		str.put(19, "Banglore");
		str.put(24,"BASS");
		str.put(15, "Noida");
		str.put(null, "DRAW");
		str.put(null, "HEyy");
		//System.out.println(str);
		
		
		
	}

}
