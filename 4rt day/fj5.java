package com.java;

import java.util.Scanner;

public class fj5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//leveled for loop//
		first:
		for(int i=1;i<=3;i++)
		{
			second:
			for(int j=1;j<=3;j++)
			{
				if(i==2 && j==2) {
					break second;
					
				}
				System.out.println(i+" "+j);
			}
		}
	}

}
