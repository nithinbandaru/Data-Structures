package SinglyLinkedLists;

public class MoveLastElementToFront {

	LinkNode head;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MoveLastElementToFront list = new MoveLastElementToFront();
		list.addAtBeginnning(5);
		list.addAtBeginnning(4);
		list.addAtBeginnning(3);
		list.addAtBeginnning(2);
		list.addAtBeginnning(1);
		
		list.printLinkedList();		
		list.moveToFront();
		
		list.printLinkedList();
	}
	
	public void moveToFront()
	{
		LinkNode current = head;
		
		if(current == null)
		{
			return;
		}
		
		LinkNode tail = null;
		
		while(current.next.next != null)
		{
			current = current.next;
		}
		
		tail = current.next;
		tail.next = head ;
		current.next = null;
		head = tail;
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
