package com.javaSep13;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 String a,b=null;
	        Scanner s = new Scanner(System.in);
	        System.out.print("Enter the value:");
	        a = s.nextLine();
	        int n = a.length();
	        for(int i=n-1; i>=0; i--)
	        {
	            b = b + a.charAt(i);
	        }
	        if(a.equalsIgnoreCase(b))
	        {
	            System.out.println("The string is palindrome.");
	        }
	        else
	        {
	            System.out.println("The string is not palindrome.");
	        }
	    
	}

}
