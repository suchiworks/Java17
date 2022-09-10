package com.java2;

import java.util.Scanner;

public class Apple {
	public static void main(String[] args) {
	float arr[]=new float[7];
	float avg=0,sum=0;
	for(int i=0;i<7;i++)
	{
		Scanner sc=new Scanner(System.in);
		arr[i]= sc.nextFloat();
		sum=sum+arr[i];
	}
	avg=sum/7;
	System.out.println(avg);
	
	
}
}

