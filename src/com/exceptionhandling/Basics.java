package com.exceptionhandling;

public class Basics {
	public static void main(String[] args) {
		int i,j,k=0;
		i=4;
		j=0;
		try
		{
			k=i/j;
		}
		catch(Exception e)
		{
			System.out.println("cant divide by zero");
		}
		
		System.out.println(k);
	}

}
