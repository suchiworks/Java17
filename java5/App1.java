package com.java;

import java.util.Scanner;

public class App1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char ch;
		do
		{
			System.out.println("welcome");
			Scanner sc=new Scanner(System.in);
			System.out.println("enter your chioce");
			ch=sc.next().charAt(0);
			if(ch=='y')
				 break;
					 }
		while(true);
	}

}
