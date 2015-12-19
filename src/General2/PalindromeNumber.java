package General2;

public class PalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 12321;
		boolean a = isPalindrome(num);
		System.out.println("Palindrome " +a);
	}

	private static boolean isPalindrome(int num) {
		// TODO Auto-generated method stub
		if(num < 0)
		{
			return false;
		}
		int givenNum = num;
		int divisor = 1;
		int noOfDigits= 1;
		while(givenNum / divisor >= 10)
		{
			divisor = divisor * 10; 
			noOfDigits++;
		}
		System.out.println("No of digits: "+ noOfDigits);
		
		int leftDigit, rightDigit;
		
		while(givenNum != 0)
		{
			leftDigit = givenNum / divisor;
			rightDigit = givenNum % 10 ; 
			System.out.println(leftDigit + " " + rightDigit);
			if(leftDigit != rightDigit)
			{
				return false;	
			}
			
			givenNum = (givenNum % divisor) / 10 ;
			divisor = divisor/100;
				
		}
		return true;
		
	}

}
