package General;

public class CountNumberOfTwos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number = 22;
		
		countTwos(number);		

	}

	private static void countTwos(int givenNumber) {
		
		int count = 0;
		int digit = 0;
		for(int number = 1 ; number <= givenNumber ; number++)
		{
			int num = number;
			while(num != 0)
			{
				digit = num % 10 ;
				num = num / 10;
				//System.out.println(num);
				if(digit == 2)
				{
					count++;
				}			
			}
		}
		
		System.out.println(count);
	}

}
