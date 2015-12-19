package StringAlgorithms;

public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "how are you";
		System.out.println("Reverse String recursion : "+ reverseStringRecursion(str));
		
		System.out.println("Reverse String normal : "+ reverseString(str));


	}
	
	
	public static String reverseString(String str)
	{
		if(str == null || str.length() <= 1)
		{
			return str;
		}		
		String reverseStr = "";
		for(int i = str.length()-1 ; i >= 0 ; i--)
		{
			reverseStr = reverseStr + str.charAt(i);
		}
		return reverseStr;
	}

	
	
	public static String reverseStringRecursion(String str)
	{
		//String revStr ="";
		if(str == null || str.length() <= 1)
		{
			return str;
		}		
		return reverseString(str.substring(1))+ str.charAt(0);
	}

}

