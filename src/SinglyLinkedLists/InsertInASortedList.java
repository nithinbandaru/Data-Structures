package SinglyLinkedLists;

public class InsertInASortedList {

	LinkNode head;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		InsertInASortedList list = new InsertInASortedList();
		
		list.addAtBeginnning(50);
		list.addAtBeginnning(40);
		list.addAtBeginnning(30);
		list.addAtBeginnning(20);
		list.addAtBeginnning(10);
		
		list.insertAtRightPosition(61);
		list.printLinkedList();		
			
	}
	
	public void insertAtRightPosition(int data)
	{
		LinkNode newNode = new LinkNode(data);
		if(head == null)
		{			
			head = newNode;
		}		
		
		if(newNode.data < head.data )
		{
			newNode.next = head;
			head = newNode;
		}
		else
		{
			LinkNode temp = head;
			while(temp.next != null && newNode.data > temp.next.data)
			{
				System.out.println(newNode.data + ">>" + temp.next.data);
				temp = temp.next;
			}
			
			newNode.next = temp.next;
			temp.next = newNode;
			
			
			
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
