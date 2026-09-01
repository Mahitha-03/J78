package com.java;

public class Emp {
	static int count;

	Emp(){
	count++;
	}

	public static void main(String[] args) {
		Emp emp1 = new Emp();
		Emp emp2 = new Emp();
		Emp emp3 = new Emp();
		Emp emp4 = new Emp();
		
		System.out.println("Objects count :" + count);
		
		

	}

}
