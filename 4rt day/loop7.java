package loops;

import java.util.Scanner;

public class loop7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//wap to input a number and check whether it is prime number or not//
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the numbers");
		int num=sc.nextInt();
		boolean flag=false;
		if(num==1)
		{
			System.out.println("not prime number");
		}
		else {
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{
				System.out.println("not prime number");
				flag=true;
				break;
			}
			}
			if(flag==false) {
				System.out.println ("prime number");
			}
		}
			}
	}

