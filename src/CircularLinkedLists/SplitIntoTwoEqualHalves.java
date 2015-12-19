package CircularLinkedLists;
import java.util.ArrayList;
import java.util.List;


public class SplitIntoTwoEqualHalves {

	LinkNode head;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SplitIntoTwoEqualHalves cll = new SplitIntoTwoEqualHalves();
		cll.addAtBeginning(6);
		cll.addAtBeginning(5);
		cll.addAtBeginning(4);		
		cll.addAtBeginning(3);
		cll.addAtBeginning(2);
		cll.addAtBeginning(1);
		
		cll.printList(cll.head);
		System.out.println();		

		List<LinkNode> listOfHeads = cll.splitList(cll.head);
		LinkNode head1 = listOfHeads.get(0);
		LinkNode head2 = listOfHeads.get(1);
		
		cll.printList(head1);
		System.out.println();		
		cll.printList(head2);
		
	}
	
	public List<LinkNode> splitList(LinkNode headNode)
	{
		if(headNode != null)
		{
			List<LinkNode> listOfHeads = new ArrayList<LinkNode>();
			LinkNode head1 = headNode;
			LinkNode head2 = null;			
			
			LinkNode slowPtr = headNode;
			LinkNode fastPtr = headNode;
			
			// Get the mid element and last element using hare and tortoise method
			while(fastPtr.next != headNode && fastPtr.next.next != headNode)
			{
				slowPtr = slowPtr.next;
				fastPtr = fastPtr.next.next;
			}			
			
			if(fastPtr.next.next == headNode)
			{
				fastPtr = fastPtr.next;
			}			
			
			// set head of second half 
			if(headNode.next != null)
			{
				head2 = slowPtr.next;				
			}
			
			// make second half circular
			fastPtr.next = slowPtr.next;
			
			// make first half circular
			slowPtr.next = headNode;
			
			// System.out.println(slowPtr.data + " " + fastPtr.data);
			listOfHeads.add(head1);
			listOfHeads.add(head2);
			
			return listOfHeads;
		}
		return null;
	}
	
	public void printList(LinkNode headNode)
	{
		if(headNode == null)
		{
			return;
		}
		LinkNode last = headNode;
		do
		{
			System.out.print(last.data + "->");
			last = last.next;
		}
		while(last != headNode);
	}
	
	public void addAtBeginning(int key)
	{
		if(head== null)
		{
			LinkNode newNode = new LinkNode(key);
			head = newNode;
			head.next = head;
		}
		else
		{
			
			LinkNode last = head;
			while(last.next != head)
			{
				last = last.next;
			}
			LinkNode newNode = new LinkNode(key);
			newNode.next = head;
			head = newNode;
			last.next = head;
		}
		
		
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
