package StringAlgorithms;
import java.util.ArrayList;


public class NaivePatternSearching {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "AABAACAADAABAAABAA";
		String pattern = "AABA";
		ArrayList<Integer> indexList = naiveSearch(pattern, text);
		
		for(int i:indexList)
		{
			System.out.println("pattern found at index " + i);	
		}
		

	}

	private static ArrayList<Integer> naiveSearch(String pattern, String text) {
		
		int patternLength = pattern.length();
		int textLength = text.length();
		
		ArrayList<Integer> index = new ArrayList<Integer>();
		
		System.out.println(patternLength + " " + textLength);
		
		for(int i=0 ; i < textLength - patternLength ; i++)
		{
			int j; 
			for(j = 0 ; j < patternLength ; j++ )
			{
				if(text.charAt(i+j) != pattern.charAt(j))
				{
					break;
				}
			}
			if(j == patternLength)
			{
				index.add(i);
			}
			
		}
		
		return index;
	}

}
