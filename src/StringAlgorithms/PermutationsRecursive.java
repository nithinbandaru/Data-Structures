package StringAlgorithms;

public class PermutationsRecursive {
	public static void main(String [] args){
		printPermutations("", "PIG");
	}
	public static void printPermutations(String prefix, String suffix)
	{
		if(suffix.length() == 0)
		{
			System.out.println(prefix);
		}
		else
		{
			for(int i = 0; i < suffix.length(); i++)
			{
				printPermutations(prefix + suffix.charAt(i), 
						suffix.substring(0, i) + suffix.substring(i+1, suffix.length()));
			}
		}
	}
}
