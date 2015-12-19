package General;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number = 5 ;
		
		int  factorial = factorialIterative(number);
		System.out.println(" factorial Iterative " + factorial );
		
		
		factorial = factorialRecursive(number);
		System.out.println(" factorial recursive " + factorial );


	}

	private static int factorialRecursive(int number) {
		// TODO Auto-generated method stub
		if(number <= 1)
		{
			return 1;
		}
		return number * factorialRecursive(number - 1);
		
	}

	private static int factorialIterative(int number) {
		
		int result = 1;
		
		for ( int i=number ; i > 1 ; i--)
		{
			result = result * i;
		}		
		
		return result;
	}

}
