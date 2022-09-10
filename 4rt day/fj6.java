package com.java;

public class fj6 {

	public static void main(String[] args, Object i) {
		// TODO Auto-generated method stub
outer: 
	for(int i=1;i<5;i++)
{
	System.out.println(i);
	}
        for(int j=1;j<3;j++)
{
	    System.out.println(j);
	}
  
if(i == j) {
	     continue outer;
	     System.out.println("i");
}
}
}

}
