package com.java;

import java.util.Scanner;

public class App7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//non negative integer//
		int x,y,num;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first integer");
		  x=sc.nextInt();
		System.out.println("Enter the second integer");
		  y=sc.nextInt();
		System.out.println("Enter the number");
		  num=sc.nextInt();
		 int z=x*x+y*y;
		 if(z==num) {
			 System.out.println("equal");}
			 else {
		     System.out.println("not equal");
				  
		 }
		  
	}

}
