package General2;

public class CountNumberOfTwos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		numberoftwos(24244);
		
		totalCount(22);
	}

	
	
	private static void totalCount(int range) {
		// TODO Auto-generated method stub
		
		int count = 0;
		for( int i = 2;  i <= range ; i++ )
		{
			count = count + numberoftwos(i);
		}
		System.out.println("Total 2s: " + count) ;
		
	}



	public static int numberoftwos(int num)
	{
		int count = 0;
		
		while(num > 0)
		{
			
			if(num % 10 == 2)
			{
				count++;
			}
			num = num / 10;
		}
		//System.out.println("Number of twos: "+ count);
		return count;
	}
}
