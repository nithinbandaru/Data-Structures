package SinglyLinkedLists;
import java.util.HashSet;
import java.util.Set;


public class UnionAndIntersectionUsingHashSet {

	LinkNode head;
	public static void main(String[] args) {

		UnionAndIntersectionUsingHashSet list1 = new UnionAndIntersectionUsingHashSet();
		list1.addAtBeginnning(20);
		list1.addAtBeginnning(15);
		list1.addAtBeginnning(10);
		list1.addAtBeginnning(4);
		
		list1.printLinkedList(list1.head);		
		
		UnionAndIntersectionUsingHashSet list2 = new UnionAndIntersectionUsingHashSet();
		list2.addAtBeginnning(10);
		list2.addAtBeginnning(8);
		list2.addAtBeginnning(4);
		list2.addAtBeginnning(2);
		
		list2.printLinkedList(list2.head);		
		
		
		UnionOfLists(list1.head , list2.head);
		IntersectionOfLists(list1.head , list2.head);
		
	}
	
	
	private static void IntersectionOfLists(LinkNode head1, LinkNode head2) {

		LinkNode headNode1 = head1;
		LinkNode headNode2 = head2;
		UnionAndIntersectionUsingHashSet list = new UnionAndIntersectionUsingHashSet();
		
		Set<Integer> set = new HashSet<Integer>();
		
		while(headNode1 != null)
		{
			set.add(headNode1.data);			
			headNode1 = headNode1.next;
		}
		
		while(headNode2 != null)
		{
			if(set.contains(headNode2.data))
			{
				list.addAtEnd(headNode2.data);
			}
			
			headNode2 = headNode2.next;
		}
		
		
		System.out.println(" --- intersection ---");
		list.printLinkedList(list.head);
	}


	private static void UnionOfLists(LinkNode head1, LinkNode head2) {

		
		LinkNode headNode1 = head1;
		LinkNode headNode2 = head2;
		UnionAndIntersectionUsingHashSet list = new UnionAndIntersectionUsingHashSet();
		
		Set<Integer> set = new HashSet<Integer>();
		
		while(headNode1 != null)
		{
			set.add(headNode1.data);
			list.addAtEnd(headNode1.data);
			headNode1 = headNode1.next;
		}
		
		while(headNode2 != null)
		{
			if(!set.contains(headNode2.data))
			{
				list.addAtEnd(headNode2.data);
			}
			
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

