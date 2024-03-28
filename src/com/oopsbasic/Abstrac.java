package com.oopsbasic;

abstract class Animal {
	abstract void walk();
}

	class Horse extends Animal {
		public void walk() {
			System.out.println("walks on 4 legs");
		}
	}

	class Hen extends Animal {
		public void walk() {
			System.out.println("walks on 2 legs");
		}
	}

public class Abstrac {
	public static void main(String[] args) {
		Horse h1=new Horse();
		h1.walk();
	}

}
