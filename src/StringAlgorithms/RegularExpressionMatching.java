package StringAlgorithms;
import java.util.regex.*;

public class RegularExpressionMatching {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// 1st way 
		
		String[] testString = {"ababbc", "ababbb", "ababba"};
		
		Pattern pattern = Pattern.compile("abab*(a|b)");

		for(String s: testString)
		{
			Matcher matcher = pattern.matcher(s);
			boolean isMatch2 = matcher.matches();
			System.out.print(isMatch2+" ");
		}
		
		// 2nd way 
		String input = "ababbc";
		boolean isMatch = Pattern.matches("abab*(a|b)", input);
		
		System.out.println(isMatch);
		
		
		
	}

}
