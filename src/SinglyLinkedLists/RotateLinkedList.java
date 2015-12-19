package SinglyLinkedLists;

public class RotateLinkedList {

	LinkNode head;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		RotateLinkedList list = new RotateLinkedList();
		list.addAtBeginnning(60);		
		list.addAtBeginnning(50);
		list.addAtBeginnning(40);
		list.addAtBeginnning(30);
		list.addAtBeginnning(20);
		list.addAtBeginnning(10);
		
		list.printLinkedList(list.head);		
			
		list.rotate(list.head , 4);
		
	}
	
	
	private void rotate(LinkNode headNode, int rotateCount) {
		// TODO Auto-generated method stub
		
		LinkNode current = headNode;
		LinkNode newEnd = headNode;
		LinkNode newHead;
		int count = 1;
		while(current.next != null)
		{
			if(count == rotateCount)
			{
				newEnd = current;
			}
			current = current.next;
			count++;
		}
		current.next = headNode;
		newHead = newEnd.next;
		newEnd.next = null;
		RotateLinkedList list = new RotateLinkedList();
		list.printLinkedList(newHead);
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
