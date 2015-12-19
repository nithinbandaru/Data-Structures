package StringAlgorithms;

public class CheckPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "nithin";
		System.out.println("Is Palinrome: "+ IsPalindrome(str));

	}

	private static boolean IsPalindrome(String str) {
		// TODO Auto-generated method stub
		
		int i = 0;
		int j = str.length() -1;
		
		
		while(i<j)
		{
			if(str.charAt(i)==str.charAt(j))
			{
				i++;
				j--;
			}
			else
			{
				return false;
			}
		}
		
		
		return true;
	}

}
