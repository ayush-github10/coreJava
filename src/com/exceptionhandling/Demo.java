package com.exceptionhandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Demo {
	public static void main(String[] args) 
	{
		try {
			System.out.println(10/0);
		}                               //JVM will give a default catch
		finally {
			System.out.println("HELLO");//finally is always printed
		}
		
		
		
		/*try {
			FileReader file=new FileReader("abc.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		
		
		/*int[] num= {2,3,4};
		try
		{
			System.out.println(num[5]);
			System.out.println(10/0);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
			//e.printStackTrace(); //traces the path of the exception
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
	    }*/
		
	}

}
