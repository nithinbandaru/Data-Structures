package General;

public class PalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number = -121;
		
		boolean isPalindrome = isNumberPalindrome(number);
		System.out.println(" is Palindrome Number: " + isPalindrome);

	}

	private static boolean isNumberPalindrome(int number) {
		// TODO Auto-generated method stub 
		
		int palindromeNumber = number ;
		
		int reverseNumber = 0;
		
		while ( palindromeNumber != 0 )
		{
			int remainder = palindromeNumber % 10 ;
			reverseNumber = 10 * reverseNumber + remainder;
			palindromeNumber = palindromeNumber / 10 ;
			System.out.println(remainder + "--" + reverseNumber + "--" + palindromeNumber);		
					
		}
		
		return (reverseNumber == number) ? true : false;
	}

}
