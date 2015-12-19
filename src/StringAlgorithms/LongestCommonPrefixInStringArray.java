package StringAlgorithms;

public class LongestCommonPrefixInStringArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String[] strArray = {"abcd", "abbd", "abdy", "cabz"};
		 
		 printLongestCommonPrefix(strArray);

	}

	private static void printLongestCommonPrefix(String[] strArray) {
		// TODO Auto-generated method stub
		
		int index = 0;
		boolean flagBreak = false;
		for(int i = 0 ; i<strArray[0].length() ; i++)
		{
			if(!flagBreak)
			{
				char c = strArray[0].charAt(i);
				for(int j = 1 ; j< strArray.length ; j++)
				{
					if(strArray[j].charAt(i) != c)
					{
						index = i;
						flagBreak = true;
						break;
					}
				}
				
			}
			else
			{
				break;
			}
		}
		
		System.out.println("index: "+index);
		String prefix = index ==0 ? null: strArray[0].substring(0,index);
		System.out.println("prefix: "+ prefix);
	}

}
