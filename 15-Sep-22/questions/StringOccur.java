package com.javaSep15;

import java.util.Scanner;

public class StringOccur {
	//Write a program to find the first and 
	//the last occurence of the letter 'o'  in "Hello World".
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in); {
		   String s="Hello, world";
			int count1=0,count2=0;
			for(int i=0;i<s.length();i++)
			{
				if(s.charAt(i)=='o') {
					count1=i;
					break;
				}
			}
			
			for(int i=0;i<s.length();i++)
			{
				if(s.charAt(i)=='o') {
					count2=i;
				}
			}
			System.out.println(count1+" "+count2);		
		
	}		
	}			
	}