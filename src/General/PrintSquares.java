package General;

public class PrintSquares {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int range1 = 5;
		int range2 = 10;
		
		printSquareTillNumber(range1, range2);	
		
		System.out.println();
		printSquaresN(range2);

	}

	private static void printSquaresN(int range2) {

		long i = 1;
		for (long n = 1; i < range2; i++) {
		  n = n + ( 2*i + 1);
		  System.out.print(n +" ");
		}
		
		
	}

	private static void printSquareTillNumber(int range1, int range2) {
		// TODO Auto-generated method stub
		
		int result = 0 ;
		for( int i = 1 ; i < range2 ; i=i+2)
		{
			result = result + i ;
			if(result >= range1 && result <= range2)
			{
				System.out.print(result + " ");
			}
		}
		
	}

}
