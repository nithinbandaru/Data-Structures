package SinglyLinkedLists;

public class DeleteAnEntireLinkedList {

	LinkNode head;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DeleteAnEntireLinkedList list = new DeleteAnEntireLinkedList();
		list.addAtBeginnning(5);
		list.addAtBeginnning(4);
		list.addAtBeginnning(3);
		list.addAtBeginnning(2);
		list.addAtBeginnning(1);
		
		list.printLinkedList();	
		
		list.deleteLinkedList();
		
		list.printLinkedList();
			
	}
	
	public void deleteLinkedList()
	{
		/*
		LinkNode current = head;
		LinkNode nextNode ;
		
		while(current != null)
		{
			nextNode = current.next;
			current = nextNode;
			
		}		
		*/
		head = null;
		
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
