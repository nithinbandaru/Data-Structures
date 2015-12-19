package SinglyLinkedLists;

public class PalindromeLinkedList {

	LinkNode head;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PalindromeLinkedList list = new PalindromeLinkedList();
		list.addAtBeginnning(1);
		list.addAtBeginnning(2);
		list.addAtBeginnning(3);
		list.addAtBeginnning(3);
		list.addAtBeginnning(2);
		list.addAtBeginnning(1);
		
		list.printLinkedList();		
			
		boolean isPal = list.IsPalindrome();
		System.out.println("Is Palindrome: " + isPal);
	}
	
	
	private  boolean IsPalindrome() {
		// TODO Auto-generated method stub
		
		LinkNode slowPtr = head;
		LinkNode fastPtr = head;
		System.out.println(" Finding MidPoint of linkedlist");
		if(slowPtr != null)
		{
			while (fastPtr.next != null && fastPtr.next.next != null)
			{
				slowPtr = slowPtr.next;
				fastPtr = fastPtr.next.next;
			}
		}
		
		System.out.println(slowPtr.data);
		
		System.out.println(" Reversing Half linkedlist");
		LinkNode currentNode = slowPtr.next;
		slowPtr.next = null;		
		LinkNode prevNode = null;		
		
		LinkNode nextNode = null;
		LinkNode tail = null;
		while(currentNode != null)
		{
			nextNode = currentNode.next;
			currentNode.next = prevNode;
			prevNode = currentNode;
			currentNode = nextNode;			
		}
		
		tail = prevNode ;
		
		System.out.println(tail.data);
		System.out.println(" Compare both Half of linkedlist");
		
		
		while(head != null && tail != null)
		{
			System.out.println(head.data +"--"+ tail.data);
			if(head.data != tail.data)
			{
				return false;
			}
			head = head.next;
			tail = tail.next;
			
		}
		
		
		return true;
	}


	public void addAtBeginnning(int data)
	{
		LinkNode newNode = new LinkNode(data);
		newNode.next = head;
		head = newNode;
	}
	
	
	
	public void printLinkedList()
	{
		LinkNode temp = head;
		
		if(temp == null)
		{
			System.out.println("List is empty");
			return;
		}
		
		while(temp != null)
		{
			System.out.print(temp.data + "->");
			temp = temp.next;
		}
		System.out.println();
	}
	
	
	public class LinkNode
	{
		int data;
		LinkNode next;
		
		public LinkNode(int data)
		{
			this.data = data;
			next = null;
		}
		
	}

}
