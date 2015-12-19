package General2;

public class FactorsOfANumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 36;
		
		for(int i = 1; i <= Math.sqrt(num); i++)
		{
			if(num % i == 0)
			{
				System.out.print(i+" ");
				if( i != Math.sqrt(num))					
				{
					System.out.print(num/i+" ");
				}
			}
			
			
		}

	}

}
