
public class String3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] intArray = new int[3][3];
        
        System.out.println("Array are ");
        for (int i=0; i<3; i++) {
            for (int j=0; j<3; j++) {
                intArray[i][j] =i*j;                 
                System.out.print(intArray [i][j]+" ");
            }
            System.out.println(" ");
        }
    
	}

}
