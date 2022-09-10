package com.java;

import java.util.Scanner;

public class fj9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char choice;
		Scanner sc=new Scanner(System.in);
		int c;
		do
		{
			System.out.println("enter the first number");
			int a=sc.nextInt();
			System.out.println("enter the second number");
			int b=sc.nextInt();
			c=a+b;
			System.out.println(c);
			System.out.println("enter the choice");
			choice=(char) sc.nextInt( );
		}
		while(choice=='y'|| choice=='y');
		System.out.println(c);
	}

}
