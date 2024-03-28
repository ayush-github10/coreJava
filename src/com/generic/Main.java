package com.generic;

import java.util.List;

public class Main {
	public static void main(String[] args) {
		//Box<Integer> n=new Box<Integer>(20);
		//n.getvalue();
		//System.out.println(n);
		Box<Integer> n=new Box<Integer>(10);
		n.getvalue();
	}
	private static void print(List<?> obj)
	{
		System.out.println(obj);
		
		
		
	}

}
