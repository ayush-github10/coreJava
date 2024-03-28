package com.oopsbasic;

public class OOPS {
	public static void main(String[] args) {
		/*Pen p1=new Pen();//to create object in Pen class
		Pen p2=new Pen();
		p2.color="Blue";
		p2.type="gel";
		p1.color="Black";//Using the property of Pen i.e. color
		p1.type="Dot";
		p1.write();//object using functions
		p1.color();
		p2.color();*/
		Student s1=new Student();
		s1.name="AYUSH";
		s1.age=24;
		s1.printInfo(s1.name);
	}

}
/* class Pen
{
	String color;
	String type;
	public void write()
	{
		System.out.println("writing something");
		
	}
	public void color()
	{
		System.out.println(this.color);
	}
}*/
 class Student{
	 String name;
	 int age;
	 public void printInfo(String name) 
	 {
		 System.out.println(name);
	 }
	 public void printInfo(int age)
	 {
		 System.out.println(age);
	 }
 }

