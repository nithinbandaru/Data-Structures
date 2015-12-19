package StringAlgorithms;
import java.util.ArrayList;


public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "nitro";
		String str2 = "ntrio";
		
		//boolean isAnagram = anagramFinder(str1,str2);
		//System.out.println(isAnagram);
		
		boolean isAnagram2 = anagramChecker(str1,str2);
		System.out.println(isAnagram2);
		
		String[] dictionaryOfWords = { "ntrio", "rinto", "inrto", "ortim", "s0otni", "tinor" };
		String anagramToFind = "nitro";
		
		ArrayList<String> listOfAnagrams= new ArrayList<String>();
		
		for(String str : dictionaryOfWords)
		{
			
			if(anagramChecker(anagramToFind, str))

			{
				listOfAnagrams.add(str);
				
			}
			
		}
		
		System.out.println("print all anagrams");
		
		for(String str : listOfAnagrams)
		{
			System.out.println(str +" ");
		}
	}

	private static boolean anagramChecker(String inputWord, String anagramWord) {
		// TODO Auto-generated method stub
		
		char[] givenString = inputWord.toCharArray();		
		StringBuilder buff = new StringBuilder(anagramWord);
		
		for(char c: givenString)
		{
			int index = buff.indexOf(""+c);			
			if(index != -1)
			{
				buff.deleteCharAt(index);
				//System.out.println(buff);
			}
			else
			{
				return false;
			}
		}
		
		return buff.length() == 0 ? true: false;
	}

	private static boolean anagramFinder(String inputWord, String anagramWord) {
		// TODO Auto-generated method stub
		
		char[] givenString = inputWord.toCharArray();
		
		for(char c: givenString)
		{
			int index = anagramWord.indexOf(c);
			
			if(index != -1)
			{
				anagramWord = anagramWord.substring(0, index) + anagramWord.substring(index+1, anagramWord.length());
				//System.out.println(anagramWord);
			}
			else
			{
				return false;
			}
		}
		
		return anagramWord.isEmpty();
		
	}

}
