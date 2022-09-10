package com.java2;

import java.util.Scanner;

public class Excp2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		try
		{
			int a[]=new int[5];
			a[5]=30/0;
		}
		catch(ArithmeticException e) {
			System.out.println("Arithmetic exception");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Out of Bounds");
		}catch(Exception e) {
			System.out.println("Parent Exception");	    
	   
	}
	}
}
	
