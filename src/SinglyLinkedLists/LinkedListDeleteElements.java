package SinglyLinkedLists;

public class LinkedListDeleteElements {

	LinkNode head;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedListDeleteElements list = new LinkedListDeleteElements();
		list.addAtBeginnning(2);
		list.addAtBeginnning(3);
		list.addAtBeginnning(4);
		list.addAtBeginnning(5);
		
		list.printLinkedList();		
			
	}
	
	public void deleteElement(int data)
	{
		LinkNode temp = head;
		
		if( temp == null)
		{
			return;
		}
		
		while(temp !=null && temp.next !=null)
		{
			if(temp.next.data == data)
			{
				temp.next = temp.next.next;
			}
			else
			{
				temp = temp.next;
			}
		}
		
		System.out.println(" Element not found ");
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
