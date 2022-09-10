package loops;

public class Loop1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stud
		//wap in java to display n terms of natural numbers and their sum// 
		int n=5;
		int sum=0;
		System.out.println("numbers are:");
		for(int i=1;i<=n;i++)
		{
			System.out.println(i+" ");
			sum+=i;
			}
		System.out.println(" ");
		System.out.println("sum of natural numbers="+sum);
		}
	}


