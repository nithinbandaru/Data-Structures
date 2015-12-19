package StringAlgorithms;

public class RemoveWhiteSpaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "g%20eeks     for ge  eeks  ";
		//char[] charArray = str.toCharArray();
	    removeSpaces(str);

	}

	private static void removeSpaces(String givenString) {
		// TODO Auto-generated method stub
		
		int count = 0 ;
		StringBuffer buff = new StringBuffer();
		for(int i =0 ; i< givenString.length() ; i++)
		{
			char ch = givenString.charAt(i);
			if(ch != ' ')
			{
				buff.append(ch);
			}
		}
		System.out.println("String after spaces removal " + buff);
	}

}
