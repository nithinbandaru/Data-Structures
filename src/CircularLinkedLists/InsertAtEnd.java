package CircularLinkedLists;

public class InsertAtEnd {

	LinkNode head;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InsertAtEnd cll = new InsertAtEnd();
		cll.addAtEnd(6);
		cll.addAtEnd(5);
		cll.addAtEnd(4);		
		cll.addAtEnd(3);
		cll.addAtEnd(2);
		cll.addAtEnd(1);
		
		cll.printList();

	}
	
	public void printList()
	{
		if(head == null)
		{
			return;
		}
		LinkNode last = head;
		do
		{
			System.out.print(last.data + " ");
			last = last.next;
		}
		while(last != head);
	}
	
	public void addAtEnd(int key)
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
			last.next = newNode;
			
			
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
