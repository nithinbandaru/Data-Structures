package SinglyLinkedLists;

public class RemoveDuplicatesInSortedList {

	LinkNode head;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		RemoveDuplicatesInSortedList list = new RemoveDuplicatesInSortedList();
		list.addAtBeginnning(60);
		list.addAtBeginnning(60);		
		list.addAtBeginnning(43);
		list.addAtBeginnning(21);
		list.addAtBeginnning(13);
		list.addAtBeginnning(11);
		list.addAtBeginnning(11);
		
		list.printLinkedList();	
		list.removeDuplicates();
		list.printLinkedList();
			
	}
	
	public void removeDuplicates()
	{
		LinkNode currentNode = head;
		LinkNode nextNode = null;
		
		if(currentNode == null)
		{
			return;
		}
		
		while(currentNode.next != null)
		{
			if(currentNode.data == currentNode.next.data )
			{
				nextNode = currentNode.next.next;
				currentNode.next = nextNode;
			}
			else
			{
				currentNode = currentNode.next;
			}
			
		}
		
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
