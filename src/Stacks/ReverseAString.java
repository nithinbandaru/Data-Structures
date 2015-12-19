package Stacks;
import java.util.Stack;


public class ReverseAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "hello";
		String reverse = reverseString(str);
		System.out.println(" Reverse of " + str + " is : " + reverse);
	}

	private static String reverseString(String str) {
		// TODO Auto-generated method stub
		
		String reverse = "";
		Stack<Character> stack = new Stack<Character>();
		for(int i=0 ; i<str.length();i++)
		{
			stack.push(str.charAt(i));
		}
		
		for(int i=0; i<str.length();i++)
		{
			reverse = reverse + stack.pop()  ; 
		}
		
		return reverse;
	}

}
