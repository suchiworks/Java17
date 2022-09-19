package fileH19Sep;

import java.io.Console;
import java.io.IOException;

public class file2 {
	public static void main(String args[]) throws IOException
	{
		System.out.println("Enter your name");
	Console c=System.console();
	
	char[] s=c.readPassword();
System.out.println(String.valueOf(s));
}
}