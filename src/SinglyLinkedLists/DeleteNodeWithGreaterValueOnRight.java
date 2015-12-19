package SinglyLinkedLists;

public class DeleteNodeWithGreaterValueOnRight {

	LinkNode head;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 12->15->10->11->5->6->2->3->
		DeleteNodeWithGreaterValueOnRight list = new DeleteNodeWithGreaterValueOnRight();
		list.addAtEnd(1);
		list.addAtEnd(2);
		list.addAtEnd(3);		
		list.addAtEnd(4);
		list.addAtEnd(11);
		list.addAtEnd(20);
		list.addAtEnd(25);
		list.addAtEnd(32);
		
		list.printLinkedList(list.head);
		
		deleteNodes(list.head);
			
	}
	
	
	private static void deleteNodes(LinkNode headNode) {
		// TODO Auto-generated method stub
		
		LinkNode revHead = reverse(headNode);
		DeleteNodeWithGreaterValueOnRight list = new DeleteNodeWithGreaterValueOnRight();
		list.printLinkedList(revHead);
		
		LinkNode max = revHead;
		LinkNode current = revHead;
		LinkNode next = null;
		
		while(current != null & current.next != null)
		{
			next = current.next;
			if(next.data < max.data)
			{
								
				current.next = next.next;				
			}
			else
			{
				current = current.next;
				max = current;
			}
			
		}
		
		LinkNode revHead2 = reverse(revHead);
		
		list.printLinkedList(revHead2);
		
	}


	private static LinkNode reverse(LinkNode headNode) {
		// TODO Auto-generated method stub
		
		LinkNode current = headNode;
		LinkNode prev = null ;
		LinkNode next = null;
		
		while( current != null)
		{
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
			
		}
		headNode = prev;
		
		return headNode;
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
