package com.assignment;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


public class Driver {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		Employee emp=new Employee("AYUSH",10);
		emp.sc();
        File f=new File("C:\\demogit\\serial.txt");
		ObjectOutputStream out= new ObjectOutputStream(new FileOutputStream(f));
		ObjectInputStream rd=new ObjectInputStream(new FileInputStream(f));
		out.writeObject(emp);
		Employee p=(Employee) rd.readObject();
		System.out.println(p);
		out.close();
		
		
		
		

	}

}
