
public class StringArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][]=new int[2][3];
		a[0][0]=89;
		a[0][1]=90;
		a[0][2]=89;
		
		a[1][0]=99;
		a[1][1]=70;
		a[1][2]=77;
		
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.println(a[i][j]);
			}
		}
		
	}
	
}