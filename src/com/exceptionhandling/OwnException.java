package com.exceptionhandling;
//creating our own exception
public class OwnException {
	public static void main(String[] args) throws Invalidage {
		
		validateage(0);
	}

	private static void validateage(int age)throws Invalidage
	{
		if(age>0)
		{
			throw new Invalidage("Not possible");
		}
		else{
			System.out.println("Age not possible");
		}
		
	}

}
