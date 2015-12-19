package General;

public class Exponent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number = 5 ;
		int power  = 3 ;
		
		int exponent = powerIterative( number , power );
		
		System.out.println(" Iterative Exponent " + exponent);
		
		exponent = powerRecursive( number , power);
		
		System.out.println(" Recursive Exponent " + exponent);
		

	}

	private static int powerRecursive(int number, int power) {
		// TODO Auto-generated method stub
		
		if( number <= 1)
		{
			return 1;
		}
		else if ( power % 2 == 0 )
		{
			int y = powerRecursive( number , power/2);
			return y*y;
		}
		else
		{
			return number * powerRecursive(number , power - 1);
		}
		
	}

	private static int powerIterative(int number, int power) {
		// TODO Auto-generated method stub
		
		int result = 1;
		for( int i = 1 ; i <= power ; i++)
		{
			result = number * result ;
		}
		
		return result;
	}

}
