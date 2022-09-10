package com.java;

public class fj8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//pattern//A
		 //A B
		 //A B C
		 //A B C D
		for(int rows=1;rows<5;rows++)
		{
			int num=65;
			for(int cols=1;cols<rows+1;cols++)
			{
				System.out.print((char)num+"");
				num=num+1;
			}
			System.out.println();
		}
		}
		
	}


