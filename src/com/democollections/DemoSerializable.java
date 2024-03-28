package com.democollections;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.assignment.Employee;


public class DemoSerializable {
	
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		Employee e1=new Employee("AYU",65);
		File f =new File("demo.txt");
		ObjectOutputStream s= new ObjectOutputStream(new FileOutputStream(f));//to write
		ObjectInputStream rd=new ObjectInputStream(new FileInputStream(f));//to read
		s.writeObject(e1);//to write
		Employee p=(Employee) rd.readObject();//to read
		System.out.println(p);//need to give toString to print in class Employee
		s.close();
		
	}

}
