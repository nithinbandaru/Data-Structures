package StringAlgorithms;

import java.util.LinkedHashSet;

public class RemoveDuplicatesInAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "geeksforgeeks";
		
		LinkedHashSet str2 = removeDuplicates(str);
		
		String str3 = removeDuplicates2(str);
		
	}

	private static String removeDuplicates2(String str) {

		int len = str.length();
		
		char[] charArray = str.toCharArray();
		
		boolean[] characters = new boolean[256];
		
		for(int i =0 ; i<characters.length ; i++)
		{
			characters[i] = false;
		}
	
		
		int index = 0;
		
		for(int i = 0 ; i< charArray.length ; i++)
		{
			if(!characters[charArray[i]])
			{
				charArray[index++] = charArray[i];
				characters[charArray[i]] = true;
			}
			
		}
		
		charArray[index] = '\0';
		
		System.out.println(charArray);
		
		return null;
	}

	private static LinkedHashSet removeDuplicates(String str) {

		
		LinkedHashSet<Character> set = new LinkedHashSet<Character>(); 
		
		for(int i=0 ; i< str.length() ; i++)
		{
			set.add(str.charAt(i));
		}
		
		System.out.println(set);
		
		return set;
	}

}
