package Mypack;

enum Month {
	Jan, Feb, March, April, May, June
	}

		public static void main(String args[])
		{
			
			Month m=Month.April;
			
				switch(m) {
				case Jan:
					System.out.println("January");
					break;
					
				case Feb:
					System.out.println("Feb");
					break;
				case March:
					System.out.println("March");
					break;
				case April:
					System.out.println("April");
					break;
				case May:
					System.out.println("May");
					break;
				case June:
				
					System.out.println("June");
					break;
	default:
					System.out.println("Invalid");
					break;
				}
	}
		

}
