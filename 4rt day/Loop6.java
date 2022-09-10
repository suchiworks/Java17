package loops;

public class Loop6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//wap to print fibonacci series using do while loop : 0 1 1 2 3 5 8 13//
		int i = 1, n =7, firstTerm = 0, secondTerm = 1;
	    System.out.println("Fibonacci Series till " + n + " terms:");

	    while (i <= n) {
	      System.out.print(firstTerm + ", ");

	      int nextTerm = firstTerm + secondTerm;
	      firstTerm = secondTerm;
	      secondTerm = nextTerm;

	      i++;
	    }

	}
}
