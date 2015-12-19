package General2;

public class PerfectNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(isPerfect(0));

	}
	
	public static boolean isPerfect(Integer input)
	{
		Integer[] divisors = new Integer[500];
		getDivisors(input, divisors);
		boolean isPer = false;
		
		int sum = 0;
		
		for(int i =0 ; i < 500 ; i++)
		{
			if(divisors[i] == null)
			{
				break;
			}
			else
			{
				sum += divisors[i];	
			}
			
		}
		
		if(sum == input)
		{
			isPer = true;
		}
		
		return isPer;
	}

	private static void getDivisors(Integer input, Integer[] divisors) {

		int index = 0;
		
		for(int j = 1 ; j <= input / 2 ; j++)
		{
			if( input % j == 0)
			{
				divisors[index++] = j;
			}
		}
		
	}

}
