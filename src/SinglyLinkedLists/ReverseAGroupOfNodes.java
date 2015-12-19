package SinglyLinkedLists;

public class ReverseAGroupOfNodes {

	LinkNode head;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ReverseAGroupOfNodes list = new ReverseAGroupOfNodes();
		list.addAtBeginnning(8);
		list.addAtBeginnning(7);
		list.addAtBeginnning(6);		
		list.addAtBeginnning(5);
		list.addAtBeginnning(4);
		list.addAtBeginnning(3);
		list.addAtBeginnning(2);
		list.addAtBeginnning(1);
		
		list.printLinkedList(list.head);		
		
		LinkNode newHead = list.reverse(list.head , 2);
		list.printLinkedList(newHead);		
			
	}
	
	
	private LinkNode reverse(LinkNode headNode, int reverseBy) {
		// TODO Auto-generated method stub
		
		LinkNode current = headNode;
		LinkNode prev = null;
		LinkNode next = null;
		
		int count = 0 ;
		while(current != null && count < reverseBy)
		{
			next = current.next;
			current.next = prev;
			prev = current;
			current = next ;
			count++;
	
		}
		if(next != null)
		{
			headNode.next = reverse(next , reverseBy);
		}
	
		
		return prev;
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
