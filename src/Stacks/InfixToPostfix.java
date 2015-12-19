package Stacks;
import java.util.HashMap;
import java.util.Stack;


public class InfixToPostfix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String infix = "((1+2)*4-5)*3";
		String infix1 = "1*(2+3)";
		String postfix = convertToPostfix(infix1);
		System.out.println(postfix);

	}

	public static String convertToPostfix(String infix) {
		// TODO Auto-generated method stub
		String postfix = "";
		
		
		HashMap<Character , Integer> map = new HashMap<Character , Integer>();
		map.put('+', 1);
		map.put('-', 1);
		map.put('*', 2);
		map.put('/', 2);
		map.put('(', 0);
		map.put(')', 0);
		
		
		Stack<Character> stack = new Stack<Character>(); 
		for(int i=0; i<infix.length();i++)
		{
			char ch = infix.charAt(i);
			if(ch == '(')
			{
				stack.push(ch);
			}
			else if(ch == ')')
			{
				while(stack.peek()!='(')
				{
					postfix = postfix + stack.pop();
				}
				stack.pop();
			}
			
			else if(map.containsKey(ch))
			{
				
				while(!stack.isEmpty() && map.get(stack.peek()) > map.get(ch))
				{
					postfix = postfix + stack.pop();
				}
				stack.push(ch);
			}
			
			else
			{
				postfix = postfix+ ch;
			}
		}
		
		
		while(!stack.isEmpty())
		{
			postfix = postfix+ stack.pop();
		}
		return postfix;
	}

}
