package com.java;

public class Garex {
	
	Garex obj;
	  @Override
	protected void finalize() throws Throwable {
		System.out.println("Finalize method called");
	}
	public static void main(String[] args) {
		System.out.println("main method started");
		
		Garex ob1 = new Garex();
		Garex ob2 = new Garex();
		ob1= null;    // nullifying
		System.out.println(ob1);
		System.out.println(ob2);
		Garex ob3= new Garex();
		ob3= ob2;      // reassigning
		
		System.out.println(ob2);
		System.out.println(ob3);
		new Garex(); // anonymous
		{
		Garex ob4 = new Garex();  // out of scope
		 System.out.println("inside block");
			System.out.println(ob4);
		}
		Garex ob5 = new Garex();
		Garex ob6 = new Garex();
		ob5.obj=ob6;
		ob6.obj=ob5;
		ob5 = null;
		ob6 = null;    // island isolation
		System.gc();    
		System.out.println("main method ended");
			
		
	}

}
