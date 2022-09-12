package sep12;

import java.util.Scanner;

public class Password {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Write a program to accept a password from the user and throw 'Authentication
		//Failure' exception if the password is incorrect.//
		
		String pass;
		Scanner sc=new Scanner(System.in);
		{
			System.out.println("Enter A password");
			pass=sc.next();
		
		if(!pass.equals("suchi"))
			throw new AunthenticationException("incorrect password !!");
		else
			System.out.println("Correct");
	}
	catch(AuthenticationException e) {
		System.out.println(e);
	}
	System.out.println( " " );
	}
	
}



