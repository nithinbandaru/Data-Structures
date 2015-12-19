package General2;

public class BinaryPalindromesInARange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int range = 5;
		printBinaryPalindromes(range);

	}

	private static void printBinaryPalindromes(int range) {
		// TODO Auto-generated method stub
		
		for(int i=1; i<=range ; i++){
			
			if(isPalindrome(binaryRepresentation(i)))
			{
				System.out.println("palindromic Binary number -> "+ i +" : "+binaryRepresentation(i));
			}
		}
		
	}

	private static boolean isPalindrome(String str) {
		// TODO Auto-generated method stub
		
		int i = 0 , j= str.length()-1;
		while(i<=j)
		{
			if(str.charAt(i)!=str.charAt(j))
			{
				return false;
			}
			i++;
			j--;
			
		}
		
		return true;
	}

	private static String binaryRepresentation(int decimalNum) {
		// TODO Auto-generated method stub
		String binary = "";
		int temp = decimalNum;
		while(temp != 0)
		{
			binary = temp %2 + binary;			
			temp = temp /2 ;
			
		}
		//System.out.println(decimalNum+" : "+binary);
		return binary;
	}
	
	

}
