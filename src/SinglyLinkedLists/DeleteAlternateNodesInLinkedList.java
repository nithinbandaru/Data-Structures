package SinglyLinkedLists;

public class DeleteAlternateNodesInLinkedList {

	LinkNode head;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DeleteAlternateNodesInLinkedList list = new DeleteAlternateNodesInLinkedList();
		list.addAtBeginnning(5);
		list.addAtBeginnning(4);
		list.addAtBeginnning(3);
		list.addAtBeginnning(2);
		list.addAtBeginnning(1);
		
		list.printLinkedList();		
		list.deleteAlternateNode();
		list.printLinkedList();
	}
	
	public void deleteAlternateNode()
	{
		
		if(head == null)
		{
			return;
		}
		
		LinkNode currentNode = head;
		LinkNode nextNode = head.next;
		
		while(currentNode != null && nextNode != null)
		{			
			currentNode.next = nextNode.next;
			currentNode = currentNode.next;
			if(currentNode != null)
			{
				nextNode = currentNode.next;
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
