package General2;

public class SieveOfEratosthenes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// time complexity = O(n log log n )
		
		int size = 15;
		int[] primes = new int[size+1];
		
		System.out.println(primes.length);
		for(int i= 0; i < size; i++)
		{
			primes[i] = 1;
			
		}

		primes[0] = 0;
		primes[1] = 0;
		
		for(int i = 2 ; i <= Math.sqrt(size);i++)
		{
			if(primes[i] == 1)
			{
				for(int j = 2; i*j <= size ; j++)
				{
					primes[i*j] = 0;
				}
			}
		}
		
		
		for(int i=0; i< size; i++)
		{
			if(primes[i] == 1)
			{
				System.out.print(i+" ");
			}
		}
	}
	

}
