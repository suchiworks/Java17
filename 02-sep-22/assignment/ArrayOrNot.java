package com.java2;

public class ArrayOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] num = {3,6,8,4,9}; 
	        int element = 4;
	        int index = -1;
	         
	        for(int i = 0; i < num.length; i++) {
	            if(num[i] == element) {
	                index = i;
	                break;
	            }
	        }
	         
	        System.out.println("Index of "+element+" is : "+index);
	    
	}

}
