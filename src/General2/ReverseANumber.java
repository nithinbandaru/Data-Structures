package General2;

public class ReverseANumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int givenNum = 12345;
		
		reverseNumber(givenNum);

	}

	private static void reverseNumber(int givenNum) {
		// TODO Auto-generated method stub
		
		int reverseNum = 0;
		int remainder = 0;
		while(givenNum != 0)
		{
			remainder = givenNum % 10 ;
			reverseNum = reverseNum * 10 + remainder;
			givenNum = givenNum / 10;			
			
		}
		
		System.out.println("Reverse Number : " + reverseNum);
		
	}

}
