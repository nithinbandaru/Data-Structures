package StringAlgorithms;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;


public class AnagramEfficient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1 = "nitro";
		String str2 = "ortim";
		
		boolean isAnagram = anagramCheckerBySort(str1, str2);
		System.out.println(isAnagram);
		
		boolean isAnagram2 = anagramCheckByMap(str1, str2);
		System.out.println("Anagram checker by Map: "+isAnagram2);
		
		boolean isAnagram3 = anagramCheckByMapEfficient(str1, str2);
		System.out.println("Anagram checker by Map Efficient: "+isAnagram3);
		
		String[] dictionaryOfWords = { "ntrio", "rinto", "inrto", "ortim", "s0otni", "tinor" };
		String anagramToFind = "nitro";
		
		ArrayList<String> listOfAnagrams= new ArrayList<String>();
		
		for(String str : dictionaryOfWords)
		{
			
			if(anagramCheckByMapEfficient(anagramToFind, str))

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

	private static boolean anagramCheckByMapEfficient(String str1, String str2) {
		// TODO Auto-generated method stub
		
		if(str1.length() != str2.length())
		{
			return false;
		}
		
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		for(int i =0 ; i < str1.length() ; i ++)
		{
			map.put(str1.charAt(i), map.containsKey(str1.charAt(i)) ? map.get(str1.charAt(i)) + 1 : 1);
		}
		
		for(int j = 0 ; j < str2.length() ; j++)
		{
			if(map.containsKey(str2.charAt(j)))
			{
				map.put(str2.charAt(j),  map.get(str2.charAt(j)) - 1);
				if(map.get(str2.charAt(j)) == 0)
				{
					map.remove(str2.charAt(j));
				}
			}
			else
			{
				return false;
			}
		}
		
		return map.size() == 0 ? true: false;
	}

	private static boolean anagramCheckByMap(String str1, String str2) {
		// TODO Auto-generated method stub
		
		if(str1.length() != str2.length())
		{
			return false;
		}
		
		char[] strArray1 = str1.toCharArray();
		char[] strArray2 = str2.toCharArray();
		
		HashMap<Character, Integer> map1 = new HashMap<Character, Integer>();
		for(char c : strArray1)
		{
			map1.put(c, map1.containsKey(c) ? map1.get(c) + 1 : 1);
		}
		
		HashMap<Character, Integer> map2 = new HashMap<Character, Integer>();
		
		for(char c : strArray2)
		{
			map2.put(c, map2.containsKey(c) ? map2.get(c) + 1 : 1);
		}
		
		return map1.equals(map2);
	}

	private static boolean anagramCheckerBySort(String str1, String str2) {
		// TODO Auto-generated method stub
		
		if(str1.length() != str2.length())
		{
			return false;
		}
		
		char[] strArray1 = str1.toCharArray();
		char[] strArray2 = str2.toCharArray();
		
		Arrays.sort(strArray1);
		Arrays.sort(strArray2);
		return Arrays.equals(strArray1, strArray2);
	}

}
