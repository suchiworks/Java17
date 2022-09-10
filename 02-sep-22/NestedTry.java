package com.java2;

import java.util.Scanner;

public class NestedTry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		try
		{
			try {
				int b=45/0;
			}
			catch(ArithmeticException e) {
				System.out.print(e);
			}
			
			try {
				int a[]=new int[5];
				a[5]=4;
			}catch(ArrayIndexOutOfBoundsException e) {
				System.out.println(e);
			}
		}catch(Exception e) {
			System.out.println("Outer Exception");
		}
	  
	}

}
