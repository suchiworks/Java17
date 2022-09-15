package com.javaSep15;

public class demo {
	
	public static void main(String args[]) {
// WAP to input a sentence. From the sentence sort the words according 
//to their length. The sorting should be done is descending order
	//	Print the words from highest length to lowest length//
		
		String sentence="I like java programming";
		String[] arr=sentence.split(" ");
		for(int i=0;i<arr.length;i++)
		{
			
			for(int j=0;j<arr.length-1;j++)
			{
				if(arr[j+1].length()>arr[j].length()) {
					String temp=arr[j+1];
					arr[j+1]=arr[j];
					arr[j]=temp;
					
				}
			}
		}
			
			for(String i:arr) {
				System.out.println(i);
			}
		}
}
