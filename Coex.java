package com.java;
public class Coex{
	static int count;

    {
    count++;
    }

	public static void main(String[] args) {
		Coex ex1 = new Coex();
	
		Coex ex2 = new Coex();
		
		Coex ex3 = new Coex();
		
		Coex ex4 = new Coex();
		
		
		System.out.println("Objects count :" + count);
		
		

	}

}
