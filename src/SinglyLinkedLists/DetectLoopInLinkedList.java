package SinglyLinkedLists;

public class DetectLoopInLinkedList {

	LinkNode head;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DetectLoopInLinkedList list = new DetectLoopInLinkedList();
		
		list.addAtBeginnning(6);		
		list.addAtBeginnning(5);
		list.addAtBeginnning(4);
		list.addAtBeginnning(3);
		list.addAtBeginnning(2);
		list.addAtBeginnning(1);
		list.head.next.next.next.next.next.next = list.head.next.next;
	
		list.detectLoop();
			
	}
	
	public void detectLoop()
	{
		LinkNode slowPtr = head;
		LinkNode fastPtr = head;
		
		if(head == null)
		{
			return;
		}
		
		while(slowPtr != null && fastPtr != null && fastPtr.next != null)
		{
			slowPtr = slowPtr.next;
			fastPtr = fastPtr.next.next;
			if(slowPtr == fastPtr)
			{
				System.out.println("Found Loop");
				return;
			}
			
		}
		
		System.out.println("No Loop Detected");
		
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
