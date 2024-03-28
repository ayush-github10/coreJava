package com.functional;

interface Abc
{
	int sum(int x,int y);
}

public class DemofunctionalINterface {
	
	public static void main(String[] args) {
		
		Abc obj=(int x,int y)->
		{
			return (x+y);
			
		};
		System.out.println(obj.sum(25, 232365));
	}

}
