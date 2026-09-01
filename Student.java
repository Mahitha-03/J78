package com.java;

public class Student {
	static String collegeName = "JNTU" ;
	String stuName;
	int stuid;
	int stumarks;

	public static void main(String[] args) {
		Student s1 = new Student();
		s1.stuName="Mahitha";
		s1.stuid= 11;
		s1.stumarks= 100;
		System.out.println("CollegeName :" + collegeName);
		System.out.println("StudentName :" + s1.stuName);
		System.out.println("Stuid :" + s1.stuid);
		System.out.println("marks :" + s1.stumarks);
		
		

	}

}
