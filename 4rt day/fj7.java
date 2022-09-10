package com.java;

import java.util.Scanner;

public class fj7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double sum=0;
		int n;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		for(int i=2; i<=n; i++)
		{
			sum=sum(1/i);
		}
		sum=1+sum;
		System.out.println(sum);
	}

	
	}

