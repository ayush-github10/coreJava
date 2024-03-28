package com.crudoperations;

public class Wrapperclass {
	public static void main(String[] args) {
		Integer a=500;
		Integer b=500;
		if(a==b)
			System.out.println("YES");
		else
			System.out.println("NO");
		String s1=new String("ABC");
		String s2=new String("ABC");
			System.out.println(s1==s2);//it matches the reference
			System.out.println(s1.equals(s2));//check the content
	}

}
