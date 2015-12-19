package SinglyLinkedLists;

public class AlternateSplitOfLinkedList {

	LinkNode head;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AlternateSplitOfLinkedList list = new AlternateSplitOfLinkedList();
		//list.addAtBeginnning(6);
		list.addAtBeginnning(5);
		list.addAtBeginnning(4);
		list.addAtBeginnning(3);
		list.addAtBeginnning(2);
		list.addAtBeginnning(1);
		
		list.printLinkedList(list.head);	
		list.alternateSplit();
			
	}
	
	public void alternateSplit()
	{
		if(head == null)
		{
			return;
		}
		
		LinkNode current = head;
		LinkNode nextNode = head.next;
		
		AlternateSplitOfLinkedList list1 = new AlternateSplitOfLinkedList();
		AlternateSplitOfLinkedList list2 = new AlternateSplitOfLinkedList();
		
		while(current != null )
		{
			list1.addAtEnd(current.data);
			if(nextNode != null)
			{
				list2.addAtEnd(nextNode.data);
				current = nextNode.next;
			}		
			else
			{
				current = current.next;
			}
			if(current != null)
			{
				nextNode = current.next;
			}
		}
		
		list1.printLinkedList(list1.head);
		list2.printLinkedList(list2.head);
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

			while(temp.next != null)
			{
				temp = temp.next;
			}
			temp.next = newNode;
		}
	}
	
	
	public void printLinkedList(LinkNode headNode)
	{
		LinkNode temp = headNode;
		
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

