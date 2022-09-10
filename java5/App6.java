package com.java;

import java.util.Scanner;

public class App6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char ch;
		Scanner sc=new Scanner(System.in);
		ch=sc.next().charAt(0);
		if(!(ch>='a' && ch<='z' || ch>'A' && ch<='Z')){
		
			System.out.println("error");}
		
		 {
		if(ch=='a' || ch=='e' || ch== 'i' || ch=='o' || ch=='u') {
			
		}
		System.out.println("vowel");
		}  {
			System.out.println("consonant");}
	}
}

		
