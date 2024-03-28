package com.inner;

public class outer
{

	int x=10;
	static class Emp
	{
		int y=30;
	}
	public static void main(String args[]) 
	{
		outer e=new outer();
		System.out.println(e.x);
		outer.Emp e1=new outer.Emp();
		
		System.out.println(e1.y);
	
	}
}
