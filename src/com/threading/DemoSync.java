package com.threading;

public class Demo implements Runnable
{
	private int ct=0;
	
	public void run()
	{
		ct++;
		System.out.println("from runnable act" +ct);
	}
	
}
class A extends Thread
{
	private int ct=0;
	public void run()
	{
		ct++;
		System.out.println("from thread" +ct);
	}
}

public class DemoSync
{
	public static void main(String[] args) {
		
		
		
	}
	
}
