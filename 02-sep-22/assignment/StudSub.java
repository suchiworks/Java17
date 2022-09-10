package com.java2;

import java.util.Scanner;

public class StudSub {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int roll;
	        int s1,s2,s3;
	        Scanner sc = new Scanner(System.in);

	        for(int i=1; i<=8; i++){
	                System.out.print("\nEnter Your Roll Number ");
	                roll = sc.nextInt();

	                System.out.print("Enter the First Subject Mark ");
	                s1 = sc.nextInt();
	                System.out.print("Enter the  Second Subject Mark ");
	                s2 = sc.nextInt();
	                System.out.print("Enter the  Third Subject Mark ");
	                s3 = sc.nextInt();

	                int avg = (s1 + s2 + s3) / 3;
                        if(s1<=100 && s2<=100 && s3<=100){
	                          System.out.print(avg);
	                }
	                   else{
	                          System.out.println("\n Enter Your Marks Between 0 to 100");
	                }
	            }
	}

}
