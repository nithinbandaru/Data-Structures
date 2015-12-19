package SinglyLinkedLists;
public class LinkedListAddElements {

	LinkNode head;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedListAddElements list = new LinkedListAddElements();
		list.addAtBeginnning(2);
		list.addAtBeginnning(3);
		list.addAtBeginnning(4);
		list.addAtBeginnning(5);
		
		list.printLinkedList();
		
		System.out.println();
		
		LinkedListAddElements list2 = new LinkedListAddElements();
		list2.addAtEnd(6);
		list2.addAtEnd(7);
		list2.addAtEnd(8);
		list2.addAtEnd(9);
		
		list2.printLinkedList();
		
		
	}
	
	
	public void addAtBeginnning(int data)
	{
		LinkNode newNode = new LinkNode(data);
		newNode.next = head;
		head = newNode;
	}
	
	public void addAtEnd(int data)
	{
		LinkNode temp = head;
		LinkNode newNode = new LinkNode(data);
		if(temp == null)
		{
			head = newNode;
		}
		else
		{
			while(temp.next!=null)
			{
				temp = temp.next;
			}
			temp.next = newNode;
		}
		
	}
		
	
	public void addAtIndex(int data, int pos)
	{
		LinkNode newNode = new LinkNode(data);
		LinkNode temp = head;
		int currPosition = 0; 
		
		while(temp != null && currPosition < pos-1)
		{
			
			temp = temp.next;
			currPosition++;
			System.out.println("curr pos:" +currPosition);
		}
		if(temp !=null)
		{
			newNode.next = temp.next;
			temp.next = newNode;
		}		
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
