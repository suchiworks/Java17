package loops;

import java.util.Scanner;

public class Loop3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//wap in java to display the cube of the number upto given an integer//
		int i,n;
		System.out.print("enter number: ");
	    Scanner in = new Scanner(System.in);
			    n = in.nextInt();
			    for(i=1;i<=n;i++)
	{
	    System.out.println("the cube of numbers: "+(i*i*i)); 
	}

}
}
