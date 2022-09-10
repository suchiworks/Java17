package com.java2;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Runtime//
		
		int a=5;
		try
		{
		System.out.println(a/0);
		}
		catch(ArithmeticException ae ) {
			System.out.println(ae.getMessage());
			
		}
		System.out.println("welcome");	    
	   
	}
}
	
