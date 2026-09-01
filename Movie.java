package com.java;

public class Movie {
	static String theatreName = "PVR";
	static String loc ="HYD";
	String moviename ;
	int moviebudget;
	String reDate;
	

	public static void main(String[] args) {
		
	Movie m1 = new Movie();
	m1.moviename = "irumudi";
	m1.moviebudget= 5000000;
	m1.reDate= "20-08-2026" ;
	
	Movie m2 = new Movie();
	m2.moviename = "rajasab";
	m2.moviebudget= 500000;
	m2.reDate= "25-08-2026" ;
	
	Movie m3 = new Movie();
	m3.moviename = "hi nana";
	m3.moviebudget= 4000000;
	m3.reDate= "20-06-2025" ;
	
	Movie m4 = new Movie();
	m4.moviename = "Darling";
	m4.moviebudget= 3000000;
	m4.reDate= "20-08-2010" ;
	
	Movie m5 = new Movie();
	m5.moviename = "Mr.Perfect";
	m5.moviebudget= 5000000;
	m5.reDate= "20-08-2009" ;
	System.out.println("TheatreName : " + theatreName);
	System.out.println("Location : " + loc);
	System.out.println("moviename : " + m1.moviename);
	System.out.println("moviebudget : " + m1.moviebudget);
	System.out.println("reDate : " + m1.reDate);
	
	System.out.println("moviename : " + m2.moviename);
	System.out.println("moviebudget : " + m2.moviebudget);
	System.out.println("reDate : " + m2.reDate);
	
	System.out.println("moviename : " + m3.moviename);
	System.out.println("moviebudget : " + m3.moviebudget);
	System.out.println("reDate : " + m3.reDate);
	
	System.out.println("moviename : " + m4.moviename);
	System.out.println("moviebudget : " + m4.moviebudget);
	System.out.println("reDate : " + m4.reDate);
	
	System.out.println("moviename : " + m5.moviename);
	System.out.println("moviebudget : " + m5.moviebudget);
	System.out.println("reDate : " + m5.reDate);
	
	}

}
