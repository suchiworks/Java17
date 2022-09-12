package sep12;

import java.util.Scanner;

public class Mismatch {

	
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the string :: ");
		String input = sc.nextLine();
		
		try {
			if(input.equalsIgnoreCase("Hello"))
				System.out.println("String matched !!!");
			else
				throw new StringMismatchException();
		}
		catch (StringMismatchException s) {
			System.out.println(s);
		}
	}
}
