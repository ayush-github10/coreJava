package com.gettersetter;

public class Customer {
   
	String name;
	long accno;
	long phone;
	String addr;
	long bal;
	long initialdep;
	
	
	public static void main(String[] args) {
		
		
		
	}
	public Customer(String name, long accno, long phone, String addr,long initialdep) {
		
		this.name = name;
		this.accno = accno;
		this.phone = phone;
		this.addr = addr;
		this.initialdep = initialdep;
		this.bal= initialdep;
	}
	
	public void deposit(long amt)
	
	{
		this.bal+=amt;
	}
	public void withdraw(long amt)
	{
		if(this.bal-amt<=500)
			System.out.println("not possible");
		else {
			this.bal-=amt;
			System.out.println("withdrawn");
		}
		
	}
	
}
