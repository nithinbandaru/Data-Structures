package StringAlgorithms;

import java.util.HashSet;

public class PermutationsOfString {

	public static void main(String[] args) {

		
		String str = "abc" ;
		
		HashSet<String> perumations = getAllPermutations(str);
		
		for(String s: perumations)
		{
			System.out.println(s);
		}
		
	}

	private static HashSet<String> getAllPermutations(String givenString) {

		HashSet<String> permutations = new HashSet<String>();
		
		if(givenString == null || givenString.length() == 0)
		{
			permutations.add("");
			return permutations;
		}
		
		char firstCharacter = givenString.charAt(0);
		String remainingString = givenString.substring(1);
		
		HashSet<String> words = getAllPermutations(remainingString);
		
		for(String word : words)
		{	
			for(int i = 0 ; i <= word.length(); i++)
			{
				String prefix = word.substring(0, i);
				String suffix = word.substring(i);
				permutations.add(prefix + firstCharacter + suffix);
			}
		}
		
		return permutations;
	}

}
