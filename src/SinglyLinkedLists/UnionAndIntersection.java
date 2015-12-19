package SinglyLinkedLists;

public class UnionAndIntersection {

	LinkNode head;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		UnionAndIntersection list1 = new UnionAndIntersection();
		list1.addAtBeginnning(20);
		list1.addAtBeginnning(15);
		list1.addAtBeginnning(10);
		list1.addAtBeginnning(4);
		
		list1.printLinkedList(list1.head);		
		
		UnionAndIntersection list2 = new UnionAndIntersection();
		list2.addAtBeginnning(10);
		list2.addAtBeginnning(8);
		list2.addAtBeginnning(4);
		list2.addAtBeginnning(2);
		
		list2.printLinkedList(list2.head);		
		
		
		UnionOfLists(list1.head , list2.head);
		IntersectionOfLists(list1.head , list2.head);
		
	}
	
	
	private static void IntersectionOfLists(LinkNode head1, LinkNode head2) {
		// TODO Auto-generated method stub
		LinkNode headNode1 = head1;
		LinkNode headNode2 = head2;
		UnionAndIntersection list = new UnionAndIntersection();
		
		while(headNode1 != null && headNode2 != null)
		{
			if(headNode1.data < headNode2.data)
			{				
				headNode1 = headNode1.next;
			}
			else if(headNode1.data > headNode2.data)
			{				
				headNode2 = headNode2.next;
			}
			else
			{
				list.addAtEnd(headNode1.data);
				headNode1 = headNode1.next;
				headNode2 = headNode2.next;				
			}			
		}	
		
		
		System.out.println(" --- intersection ---");
		list.printLinkedList(list.head);
	}


	private static void UnionOfLists(LinkNode head1, LinkNode head2) {
		// TODO Auto-generated method stub
		
		LinkNode headNode1 = head1;
		LinkNode headNode2 = head2;
		UnionAndIntersection list = new UnionAndIntersection();
		
		
		while(headNode1 != null && headNode2 != null)
		{
			if(headNode1.data < headNode2.data)
			{
				list.addAtEnd(headNode1.data);
				headNode1 = headNode1.next;
			}
			else if(headNode1.data > headNode2.data)
			{
				list.addAtEnd(headNode2.data);
				headNode2 = headNode2.next;
			}
			else
			{
				list.addAtEnd(headNode2.data);
				headNode1 = headNode1.next;
				headNode2 = headNode2.next;
				
			}
			
		}
		
		while(headNode1 != null )
		{
			list.addAtEnd(headNode1.data);
			headNode1 = headNode1.next;
			
		}
		
		while(headNode2 != null)
		{
			list.addAtEnd(headNode2.data);
			headNode2 = headNode2.next;			
		}
		
		System.out.println(" --- union ---");
		list.printLinkedList(list.head);
		
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
