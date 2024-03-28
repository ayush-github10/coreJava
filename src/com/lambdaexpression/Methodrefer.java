package com.lambdaexpression;

interface A
{
	int f1(int a);
}

public class Methodrefer {
	
	public int f2(int a)
	{
		return a*a*a;
	}
	
	public static void main(String[] args) {
		
		//A obj1=Methodrefer::f2;//need to add static in f2 method
		A obj2=(int a)->a*a;
		Methodrefer obj3=new Methodrefer();
		A xyz=obj3::f2;//need to remove the static from f2 method 
		
	}

}
