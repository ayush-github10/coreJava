package com.functional;

@FunctionalInterface
interface A {
	void show();
}

/*class B implements A {
 
 @Override public void show() { // TODO Auto-generated method stub
 
 }
 
 }*/


public class Demofun {

	public static void main(String[] args) {

		A obj = ()->//known as lambda
		{

			
				System.out.println("HELLO");


		};

		obj.show();

	}

}
