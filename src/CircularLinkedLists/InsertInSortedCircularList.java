package CircularLinkedLists;
public class InsertInSortedCircularList {

	LinkNode head;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InsertInSortedCircularList cll = new InsertInSortedCircularList();
		cll.addAtBeginning(60);
		cll.addAtBeginning(50);
		cll.addAtBeginning(40);		
		cll.addAtBeginning(30);
		cll.addAtBeginning(20);
		cll.addAtBeginning(10);
		
		cll.printList();
		System.out.println();
		cll.addInSortedList(65);
		cll.printList();
		

	}
	
	public void addInSortedList(int key)
	{
		System.out.println(head.data);
		if(head == null)
		{
			head = new LinkNode(key);
			head.next = head;
		}
		else
		{
			LinkNode last = head;
			LinkNode newNode = new LinkNode(key);
			while(last.next != head)
			{
				last = last.next;
			}		
			
			if(key < head.data)
			{
				newNode.next = head;
				head = newNode;
				last.next = head;
			}
			
			else if(key > last.data)
			{
				newNode.next = head;
				last.next = newNode;				
			}
			else
			{
				LinkNode temp = head;
				while(temp.next.data < key)
				{
					temp = temp.next;
				}
				newNode.next = temp.next;
				temp.next = newNode;
				
			}
		}
		
		
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
