package Stacks;
import java.util.HashMap;
import java.util.Stack;


public class BalancedParanthesis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//String expression = "[()]{}{[()()]()}";
		
		String expression = "[A + (B + C)}{] ";
		
		boolean isBalanced = checkBalancedParanthesis(expression);
		
		System.out.println(" the expression is balanced : " + isBalanced);

	}

	private static boolean checkBalancedParanthesis(String expression) {
		// TODO Auto-generated method stub
		
		if(expression.length() == 0)
		{
			throw new IllegalArgumentException(" Expression length shoud be greater than 0 ");
		}
		
		if(expression.length() % 2 != 0)
		{
			return false;
		}
		
		HashMap<Character,  Character> paranthesis = new HashMap<Character, Character >();
		paranthesis.put('(', ')');
		paranthesis.put('{', '}');
		paranthesis.put('[', ']');

		Stack<Character> stack = new Stack<Character>();
		for(int i = 0 ; i < expression.length(); i++)
		{
			char ch = expression.charAt(i);
			if(paranthesis.containsKey(ch) || paranthesis.values().contains(ch))
			{
				System.out.println("Element present :" + ch);
			
			
			if(paranthesis.containsKey(ch))
			{
				stack.push(ch);
				//System.out.println( "stack elements " + ch );
			}
			else if ( stack.isEmpty() || ch != paranthesis.get(stack.peek()))
			{
				//System.out.println( ch + " -- " + stack.peek() + "-- " + paranthesis.get(stack.peek()));
				return false;
			}
			else
			{
				stack.pop();
			}
			
			}
		}	
		
		return stack.isEmpty() ? true : false;
	}

}
