package CircularLinkedLists;

public class BasicCLL {

	LinkNode head;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BasicCLL cll = new BasicCLL();
		cll.addAtBeginning(6);
		cll.addAtBeginning(5);
		cll.addAtBeginning(4);		
		cll.addAtBeginning(3);
		cll.addAtBeginning(2);
		cll.addAtBeginning(1);
		
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
