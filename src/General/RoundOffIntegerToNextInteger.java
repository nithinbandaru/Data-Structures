package General;

public class RoundOffIntegerToNextInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float number = 6.0f ;
		
		int roundOff = roundOffToInteger(number);
		System.out.println("Round off of " + number + " is " + roundOff);
		

	}

	private static int roundOffToInteger(float number) {
		// TODO Auto-generated method stub
		
		int intPartOfNumber = (int) number;
		System.out.println(intPartOfNumber);
		if( number -  intPartOfNumber > 0)
		{
			return intPartOfNumber + 1;
		}
		return intPartOfNumber;
	}

}
