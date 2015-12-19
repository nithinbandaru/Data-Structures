package StringAlgorithms;

public class TrimSpaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "  hello world  ";
		//System.out.println(str.length());
		
		trimString(str);

	}

	private static void trimString(String str) {
		// TODO Auto-generated method stub
		
		char[] charArray = str.toCharArray();
		String trimmedString = "";
		for(char ch : charArray)
		{
			if(ch != ' ')
			{
				trimmedString = trimmedString + ch;
			}
			
		}
		
		System.out.println(trimmedString);
	}

}
