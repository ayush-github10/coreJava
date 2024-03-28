package com.gettersetter;
// agregation
public class Person {
	
	String name;
	int num;
	address adr;
	
	public Person(String name, int num, address adr) {
		super();
		this.name = name;
		this.num = num;
		this.adr = adr;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", num=" + num + "]";
	}

	public static void main(String[] args) {
		
		address add= new address("Gali no.2",134,"NOIDA");
		Person obj= new Person("AYUSH", 0, add);
		System.out.println(add);
		System.out.println(obj);
	}

}
