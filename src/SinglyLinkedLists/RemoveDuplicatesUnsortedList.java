package SinglyLinkedLists;
import java.util.HashSet;


public class RemoveDuplicatesUnsortedList {

	LinkNode head;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		RemoveDuplicatesUnsortedList list = new RemoveDuplicatesUnsortedList();
		// 12->11->12->21->41->43->21
		list.addAtBeginnning(21);
		list.addAtBeginnning(43);		
		list.addAtBeginnning(41);
		list.addAtBeginnning(21);
		list.addAtBeginnning(12);
		list.addAtBeginnning(11);
		list.addAtBeginnning(12);
		
		list.printLinkedList();	
		list.removeDuplicates();
		list.printLinkedList();
			
	}
	
	public void removeDuplicates()
	{
		
		HashSet<Integer> set = new HashSet<Integer>();
		
		LinkNode current = head ;
		LinkNode nextNode = null;
		if(current == null)
		{
			return;
		}
		
		while(current.next != null)
		{
			set.add(current.data);
			if(set.contains(current.next.data))
			{
				nextNode = current.next.next;
				current.next = nextNode;
			}
			else
			{
				current = current.next;
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
