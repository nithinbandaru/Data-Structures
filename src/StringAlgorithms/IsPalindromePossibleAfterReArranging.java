package StringAlgorithms;
import java.util.HashMap;
import java.util.Map;


public class IsPalindromePossibleAfterReArranging {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "nitttin";
		
		boolean pal = isPalindromePossible(str); 
		
		System.out.println(pal);
		
		
	}

	/*
	 * A set of characters can form a palindrome 
	 * if at most one character occurs odd number of times 
	 * and all characters occur even number of times	
	 */
	
	private static boolean isPalindromePossible(String str) {
		// TODO Auto-generated method stub
		
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for(int i=0 ; i< str.length() ;i++)
		{
			char ch = str.charAt(i);
			map.put(ch,  map.containsKey(ch) ? map.get(ch) + 1 : 1);
		}		
		
		int oddCount = 0;
		for(Map.Entry<Character, Integer> entry : map.entrySet())
		{
			if(entry.getValue() % 2 != 0)
			{
				oddCount++;
			}
		}
		
		return (oddCount <= 1);
	}

}
