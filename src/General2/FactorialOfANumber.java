package General2;

public class FactorialOfANumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 10 ;
		System.out.println("factorialIterative: " + factorialIterative(num));
		
		factorialReursive(num);
		
		System.out.println("factorialReursive: " + factorialReursive(num));

		
		findTrailingZeros(num);
		
		countZeros(num);
		
	}

	private static void countZeros(int num)
	{
		int count = 0; 
		if(num < 0 )
		{
			System.out.println(" give a good number");
		}
		
		for ( int i = 5 ; num / i > 0 ; i = i * 5)
		{
			count = count + num / i;
		}
		System.out.println("Zeros count : " + count);
		
	}
	
	
	private static void findTrailingZeros(int num) {
		// TODO Auto-generated method stub
		int fact = factorialIterative(num);
		
		int numOfZeros = 0;
		
		while(fact % 10 == 0)
		{
			fact = fact / 10;
			numOfZeros++;
		}
		
		System.out.println("Num of trailing zeros: " +numOfZeros);
		
	}



	private static int factorialReursive(int num) {
		// TODO Auto-generated method stub
		if(num == 0 )
		{
			return 1;
		}
		
		return num * factorialReursive(num-1);
	}

	private static int factorialIterative(int num) {
		// TODO Auto-generated method stub
		
		int fact = 1;
		for(int i = num ; i>0 ; i--)
		{
			fact = fact*i;
		}
		
		return fact;
		
	}

}
