package SinglyLinkedLists;

public class NthNodeFromEndOfLinkedList {

	LinkNode head;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		NthNodeFromEndOfLinkedList list = new NthNodeFromEndOfLinkedList();
		// 3->4->5->6->7->1->2
		list.addAtBeginnning(2);
		list.addAtBeginnning(1);
		list.addAtBeginnning(7);
		list.addAtBeginnning(6);
		list.addAtBeginnning(5);
		list.addAtBeginnning(4);
		list.addAtBeginnning(3);
		
		list.printLinkedList();	
		
		int NthNodeFromEnd = list.getNthNode(3);
			
		System.out.println("Nth node from end: " + NthNodeFromEnd);
	}
	
	
	private  int getNthNode(int index) {
		// TODO Auto-generated method stub
		
		LinkNode current = head;
		LinkNode temp = head;
		
		if(temp == null || current == null)			
		{
			return Integer.MIN_VALUE;
		}
		
		for(int i=0; i < index ; i++)
		{
			temp = temp.next;
		}
		//System.out.println(temp.data);
		while(temp !=null)
		{
			System.out.println(temp.data + " " + current.data);
			temp = temp.next;
			current = current.next;			
		}
		
		
		return current.data;
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
