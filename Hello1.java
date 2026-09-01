package com.java;

public class Hello1 {
  public void main(String[] args) throws ClassNotFoundException {
		System.out.println("Hello");
		Class.forName("com.java.Stu");
		Class.forName("java.lang.String");
		Class.forName("java.lang.System");
		
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("jdbc finished");
		

	}

}
