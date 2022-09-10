package com.java2;

import java.util.Scanner;

public class App1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int arr[]= {12,67,89};
		try
		{
		System.out.println(arr[5]);
		}
		catch(ArrayIndexOutOfBoundsException ae )
		{
			
			System.out.println(ae.getMessage());
		}
		System.out.println("welcome");    
	   
	}
}
	
