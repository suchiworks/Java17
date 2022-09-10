package com.java2;

import java.util.Scanner;

public class Excp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=0;
		int data;
		try
		{
		data=a/b;
		}
		catch(Exception ae ) {
			System.out.println(a/(b+2));
			
			
		}
		System.out.println("welcome");
	}

}
