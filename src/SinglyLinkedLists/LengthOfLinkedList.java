package SinglyLinkedLists;

public class LengthOfLinkedList {

	LinkNode head;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LengthOfLinkedList list = new LengthOfLinkedList();
		list.addAtBeginnning(1);
		list.addAtBeginnning(2);
		list.addAtBeginnning(3);
		list.addAtBeginnning(4);
		list.addAtBeginnning(5);
		
		list.printLinkedList();	
		System.out.println();
		int lengthofLinkedList = list.sizeOfLinkedListIterative();
		System.out.println(" Size via Iterative = " + lengthofLinkedList);
		
		int lengthofLinkedList2 = list.sizeOfLinkedListRecursive(list.head);
		System.out.println(" Size via Recursive = " + lengthofLinkedList2);
		
	}
	
	public int sizeOfLinkedListRecursive(LinkNode headNode)
	{
		LinkNode temp = headNode;
		
		if(temp==null)
		{
			return 0;
		}
		
		return 1 + sizeOfLinkedListRecursive(temp.next);
	}
	
	
	public int sizeOfLinkedListIterative()
	{
		int length = 0;
		LinkNode temp = head;
		
		if(temp == null)
		{
			return 0;
		}
		while(temp != null)
		{
			temp = temp.next;
			length++;
		}		
		
		return length;	
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
