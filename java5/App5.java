package com.java;

import java.util.Scanner;

public class App5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int r,x,sum=0;
 System.out.println("enter the 1st number");
 System.out.println("enter the 2nd number");
          Scanner sc=new Scanner(System.in);
    r=sc.nextInt();
    x=sc.nextInt();
    for(int i=1;i<=r;i++)
    {
    	sum=sum+x;
    }
    System.out.println("multiplcation of"+r+" "+x+" :"+sum);
 
	}

}
