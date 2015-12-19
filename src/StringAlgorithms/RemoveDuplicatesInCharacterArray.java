package StringAlgorithms;
import java.util.HashSet;


public class RemoveDuplicatesInCharacterArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "geeksforgeeks";
		
		String uniqueStr = "";
		
		HashSet<Character> set = new HashSet<Character>();
		
		for(int i = 0 ; i < str.length(); i++)
		{
			
			if(!set.contains(str.charAt(i)))
			{
				set.add(str.charAt(i));
				uniqueStr+= str.charAt(i);
			}
		}
		System.out.println("unique Characters: " + uniqueStr);
		

	}

}
