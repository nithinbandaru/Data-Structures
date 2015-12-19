package General;

public class MultipleOfNumberEndingWith3Has1s {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Any Number that ends with 3 has multiple with all 1's
		
		int numberThatEndsWith3 = 3;
		
		int numberwith1s = getNumberWith1s(numberThatEndsWith3);
		System.out.println(numberwith1s);

	}

	private static int getNumberWith1s(int numberThatEndsWith3) {
		// TODO Auto-generated method stub
		
		
		int remainder = 1 ;
		int count = 1;
		
		while (remainder != 0 )
		{
			remainder = (remainder * 10 + 1) % numberThatEndsWith3;
			count++;
		}
		
		int number = 0;
		for ( int i = 0 ; i< count ; i++)
		{
			number = number * 10 + 1;
		}
		
		
		return number;
	}

}