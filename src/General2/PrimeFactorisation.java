package General2;

public class PrimeFactorisation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 20;
		
		for(int i = 2 ; i < Math.sqrt(num); i++)
		{
			if(num % i == 0)
			{
				int count = 0 ;
				
				while(num % i == 0)
				{
					num = num / i;
					count++;
				}
				
				System.out.println(i + "^" + count);
			}		
			
		}
		
		if(num != 1)
		{
			System.out.println(num+"^1" );
		}

	}

}
