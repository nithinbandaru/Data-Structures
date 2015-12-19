package SinglyLinkedLists;

public class IdenticalLinkedLists {

	LinkNode head;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		IdenticalLinkedLists list1 = new IdenticalLinkedLists();
		list1.addAtBeginnning(6);
		list1.addAtBeginnning(4);
		list1.addAtBeginnning(3);
		list1.addAtBeginnning(2);
		list1.addAtBeginnning(1);
		
		list1.printLinkedList(list1.head);	
		
		IdenticalLinkedLists list2 = new IdenticalLinkedLists();
		list2.addAtBeginnning(5);
		list2.addAtBeginnning(4);
		list2.addAtBeginnning(3);
		list2.addAtBeginnning(2);
		list2.addAtBeginnning(1);
		
		list2.printLinkedList(list2.head);	
		
		boolean identical = isIdentical(list1.head , list2.head);
		System.out.println("Lists are identical : " + identical);
		
			
	}
	
	
	private static boolean isIdentical(LinkNode headNode1, LinkNode headNode2) {
		// TODO Auto-generated method stub
		
		if(headNode1 == null && headNode2==null)
		{
			return true;
		}
		LinkNode head1 = headNode1;
		LinkNode head2 = headNode2;
		
		while(head1 != null && head2 != null)
		{
			
			if(head1.data != head2.data)
			{
				return false;
			}
			
			head1 = head1.next;
			head2 = head2.next;
		}
		
		if( head1 != null || head2 != null)
		{
			return false;
		}
		
		return true;
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
