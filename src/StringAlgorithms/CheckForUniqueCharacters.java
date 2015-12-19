package StringAlgorithms;
import java.util.HashSet;


public class CheckForUniqueCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "harwani";
		boolean b = isStringUniqueByHashSetMethod(input);
		System.out.println("Unique Characters by hassh set: " + b);
		boolean c = isStringUniqueByBooleanArray(input);
		System.out.println("Unique Characters by boolean Array: " + c);
		
	}

	private static boolean isStringUniqueByHashSetMethod(String input) {
		// TODO Auto-generated method stub
		HashSet<Character> set = new HashSet<Character>();
		for(int i = 0 ; i<input.length(); i++)
		{
			if(set.contains(input.charAt(i)))
			{
				return false;
			}
			else
			{
				set.add(input.charAt(i));
			}
		}
		return true;
	}
	
	private static boolean isStringUniqueByBooleanArray(String input)
	{
		boolean[] boolArray = new boolean[256];
		for(int i = 0; i<input.length();i++)
		{
			int charVal = input.charAt(i);
			//System.out.println("charVal: "+charVal);
			if(boolArray[charVal])
			{
				return false;
			}
			boolArray[charVal] = true;
		}
		
		
		return true;
	}

}
