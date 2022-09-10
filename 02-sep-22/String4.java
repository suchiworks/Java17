
public class String4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double avg;
		float sum=0;
		float sales[]=new float[7];

		for(int i=1;i<=7;i++)
		{
			System.out.println ("Enter sales for day"+i+" of week =");
			
			sum=sum+sales[i-1];
		}
		System.out.println ("Sum = "+sum);
		avg=sum/7;
		System.out.println ("Average sale of week="+avg);
	
	}

}
