package Stacks;

public class ArrayStackImplementation {

	private int top;
	private int capacity;
	private int[] myArray;
	
	
	public ArrayStackImplementation(int size)
	{
		capacity = size;
		myArray = new int[capacity];
		top = -1;
	}
	
	
	public boolean isEmpty()
	{
		if(top == -1)
		{
			return true;
		}
		return false;
	}
	
	public boolean isStackFull()
	{
		if(top == capacity - 1)
		{
			return true;
		}
		return false;
	}
	
	public void push(int data)
	{
		if(isStackFull())
		{
			System.out.println("Stack is full");
			return;
		}
		top = top + 1;
		myArray[top] = data;
	}
	
	public int pop()
	{
		if(isEmpty())
		{
			System.out.println("Stack is Empty");
			return -1;
		}
		int topElement = myArray[top];
		top = top-1;
		return topElement;
	}
	
	public int peek()
	{
		return myArray[top];
	}
	
	public void printStack()
	{
		for(int i=0; i <capacity ; i++)
		{
			System.out.print(myArray[i]+ " -- ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayStackImplementation myStack = new ArrayStackImplementation(5);
		myStack.push(1);
		myStack.printStack();
		myStack.push(2);
		myStack.printStack();		
		myStack.push(3);
		myStack.printStack();
		System.out.println("Peek : " + myStack.peek());
		System.out.println("Pop : " + myStack.pop());
		System.out.println("Peek : " + myStack.peek());
		System.out.println("Is Empty : " + myStack.isEmpty());
		myStack.push(4);
		myStack.push(6);
		myStack.push(5);
		System.out.println("Is Stack Full : " + myStack.isStackFull());
		myStack.printStack();
		
		
	}

}
