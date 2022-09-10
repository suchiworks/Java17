package loops;

import java.util.Scanner;

public class Loop2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stud
// wap in java to input 5 numbers from keyboard and find their sum and average//
		 int i,n=0,sum=0;
			double avg;
			{
		  System.out.println("enter the 5 numbers:");  
		   }
				for (i=0;i<5;i++)
				{
				    Scanner in = new Scanner(System.in);
				    n = in.nextInt();
				    
		  		sum +=n;
			}
			avg=sum/5;
			System.out.println("sum of numbers:" +sum);
			System.out.println("average:" +avg);
	}

}
