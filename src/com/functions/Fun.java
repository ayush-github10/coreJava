package com.functions;

import java.util.Scanner;

public class Fun {
	public static int sum(int a,int b)
	{
		int s=a+b;
		return s;
	}

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ab= new Scanner(System.in);
				int a=ab.nextInt();
				int b=ab.nextInt();
				int s=sum(a,b);
				System.out.println(s);

	}

}
