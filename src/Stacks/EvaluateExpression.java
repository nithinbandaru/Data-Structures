package Stacks;
import java.util.HashSet;
import java.util.Stack;


public class EvaluateExpression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "1+2*3";
		//int res = performOperation('8','2','*');
		//System.out.println("Result: "+ res+"");
		String postfix = InfixToPostfix.convertToPostfix(input);
		System.out.println("postfix: "+postfix);
		evaluateString(postfix);
		

	}

	private static void evaluateString(String input) {
		// TODO Auto-generated method stub
		Stack<Character> stack = new Stack<Character>();
		
		for(int i=0; i<input.length();i++)
		{
			char ch = input.charAt(i);
			if(ch == '*' || ch == '/' || ch == '-' || ch == '+')
			{
				stack.push(performOperation(stack.pop(), stack.pop(), ch).charAt(0));
			}
			else
			{
				
				stack.push(ch);

			}
		}
		System.out.println("output "+stack.pop());
		
	}

	private static String performOperation(char c, char d, char e) {
		// TODO Auto-generated method stub
		int a = Integer.parseInt(c+"");
		//System.out.println(a);
		int b = Integer.parseInt(d+"");
		//System.out.println(b);
		switch(e)
		{
		case '*':
			return a*b + "";
		case '/':
			return b/a +"";
		case '+':
			return a+b +"";
		case '-':
			return b-a+"";
		default:
			return "";
			
		}
		//return 1;
	}

}
