package SinglyLinkedLists;

public class MergeTwoSortedLinkedLists {

	LinkNode head;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MergeTwoSortedLinkedLists list1 = new MergeTwoSortedLinkedLists();
		list1.addAtBeginnning(25);
		list1.addAtBeginnning(22);
		
		list1.addAtBeginnning(15);
		list1.addAtBeginnning(10);
		list1.addAtBeginnning(5);
		
		list1.printLinkedList(list1.head);	
		
		MergeTwoSortedLinkedLists list2 = new MergeTwoSortedLinkedLists();
		list2.addAtBeginnning(20);
		list2.addAtBeginnning(5);
		list2.addAtBeginnning(2);
		list2.printLinkedList(list2.head);	
		
		MergeTwoSortedLinkedLists list3 = new MergeTwoSortedLinkedLists();
		list3.MergeSortedLinkedlists(list1.head , list2.head);
		
			
	}
	
	
	private void MergeSortedLinkedlists(LinkNode headNode1, LinkNode headNode2) {
		// TODO Auto-generated method stub
		
		LinkNode head1 = headNode1;
		LinkNode head2 = headNode2;
		
		LinkNode newHead = new LinkNode(0);
		LinkNode current = newHead;
		
		while( head1 != null && head2 != null)
		{
			
			if(head1.data < head2.data)
			{
				current.next = head1;
				head1 = head1.next;
			}
			else
			{
				current.next = head2;
				head2 = head2.next;
			}
			
			current = current.next;
		}
		
		if(head1 != null)
		{
			current.next = head1;
		}
		
		if(head2 != null)
		{
			current.next = head2;
		}
		
		MergeTwoSortedLinkedLists list4 = new MergeTwoSortedLinkedLists();		
		list4.printLinkedList(newHead.next);
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
