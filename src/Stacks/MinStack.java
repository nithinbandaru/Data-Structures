package Stacks;

public class MinStack {
	
	Node top;
	
	public void push(int x)
	{
		
		if(top == null)
		{
			top = new Node(x);
			
		}
		else
		{
			Node temp = new Node(x);
			temp.next = top;
			temp.min = Math.min(top.min, x);
			top = temp;
		}
		
	}

	
	public int pop()
	{
		
		if(top == null)
		{
			System.out.println("Empty stack");
			return -1;
		}
		
		Node temp = top;
		top = top.next;
		return temp.value;
		
	}
	
	public int top()
	{
		if(top == null)
		{
			System.out.println("Empty stack");
			return -1;
		}
		
		Node temp = top;
		return temp.value;		
		
	}
	
	public int getMinValue()
	{
		if(top == null)
		{
			System.out.println("Empty stack");
			return -1;
		}
		
		Node temp = top;
		return temp.min;		
		
	}
	
	
	public static void main(String[] args) {

		MinStack mStack = new MinStack();
		mStack.push(7);
		mStack.push(8);
		System.out.println(mStack.getMinValue());
		mStack.push(5);
		mStack.push(9);
		System.out.println(mStack.getMinValue());
		mStack.push(5);
		mStack.push(2);
		System.out.println(mStack.getMinValue());
		mStack.pop();
		mStack.pop();
		System.out.println(mStack.getMinValue());

		
		
	}
	
	
	
	class Node
	{
		int value;
		int min;
		Node next;
		
		public Node(int x)
		{
			value = x;
			min = x;
			next = null;
					
		}
		
		
	}

}
