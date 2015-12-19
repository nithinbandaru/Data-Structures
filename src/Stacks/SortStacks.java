package Stacks;
import java.util.Stack;


public class SortStacks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stack<Integer> stack1 = new Stack<Integer>();
		
		
		stack1.push(1);
		stack1.push(9);
		stack1.push(3);
		stack1.push(4);
		stack1.push(8);
	
		Stack<Integer> stack2 = new Stack<Integer>();
		
		while(!stack1.isEmpty())
		{
			int temp = stack1.pop();
			
			while(!stack2.isEmpty() && temp < stack2.peek())
			{
				stack1.push(stack2.pop());
			}
			stack2.push(temp);
		}
		
		
		printStack(stack2);
		
	}

	
	private static void printStack(Stack<Integer> myStack) {
		// TODO Auto-generated method stub
	
		while(!myStack.isEmpty())
		{
			System.out.println(myStack.pop());
		}
		
	}

}
