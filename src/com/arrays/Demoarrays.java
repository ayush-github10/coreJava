package com.arrays;
class Student
{
	public Student(String name, int num, int score) {
		// TODO Auto-generated constructor stub
	}
	String name;
	int num;
	int score;
}

public class Demoarrays {
	public static void main(String[] args) {
		int[] empId=new int[20];
		empId[0]=100;
		empId[1]=101;
		empId[2]=102;
	/*	for(int i=0;i<3;i++)
		{
			System.out.println(i);
		}*/
		/*for(int i=0;i<empId.length;i++)//using employee length
		{
			System.out.println(empId[i]);
		}*/
		Student [] std=new Student[10];
		std[0]=new Student("AYUSH",6,68);
		std[1]=new Student("SHAURYA",7,78);
		if(std[0].score>std[1].score)
			System.out.println(std[0].score);
		else
			System.out.println(std[1].score);
		/*for(int i=0;i<2;i++)
		{
			
		}
		public Student highscore(Student s)
		{
			
		}*/
		
	}

}
