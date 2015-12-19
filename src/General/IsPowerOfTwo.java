package General;

public class IsPowerOfTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number = 34;
		
		boolean isPower = isPowerOf2(number);
		System.out.println(" is power of 2 " + isPower);

	}

	private static boolean isPowerOf2(int number) {
		
		int givenNum = number;
		
		while ( ( givenNum % 2 == 0 ) && givenNum > 1 )
		{
			givenNum = givenNum/2 ;
		}
		
		return (givenNum == 1 ? true : false);
	}

}
