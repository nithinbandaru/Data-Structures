package StringAlgorithms;

public class BalancedParanthesis {

	public static void main(String[] args) {

		String str = "((BCD)AE)" ;
		
		
		boolean isBalanced = IsBalanced(str);
		System.out.println(isBalanced);
		
		String str2 = "(PH)N)(X)" ;
		
		isBalanced = IsBalanced(str2);
		System.out.println(isBalanced);
		
		
		
		
	}

	private static boolean IsBalanced(String str) {

		if(str == null || str.length() == 0)
		{
			return true;
		}
		
		int count = 0 ;
		
		for( int i=0; i< str.length() ; i++)
		{
			char ch = str.charAt(i);
			
			if(ch == '(')
			{
				count++;
			}
			else if(ch == ')')
			{
				if(count == 0)
				{
					return false;
				}
				else
				{
					count--;
				}
				
			}
			
		}
		
		if(count != 0)
		{
			return false;
		}
		
		return true;
	}

}
