package com.javaSep15;

import java.util.Scanner;

public class Perticularword {
//Write a Java Program to Search a 
	//Particular Word in a String.without any method
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Sentence");
		String s = sc.nextLine();
		System.out.println("Enter a word from the sentence");
		String s1 = sc.next();
		int intIndex = s.indexOf(s1);
		if(intIndex ==-1) {
			System.out.println("Word not found");
		} else {
			System.out.println("Found the word at index "+ intIndex);
		}
	}
}
