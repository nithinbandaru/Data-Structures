package SinglyLinkedLists;

public class TraversalOfLinkedListUsingRecursion {

	LinkNode head;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TraversalOfLinkedListUsingRecursion list = new TraversalOfLinkedListUsingRecursion();
		list.addAtBeginnning(5);
		list.addAtBeginnning(4);
		list.addAtBeginnning(3);
		list.addAtBeginnning(2);
		list.addAtBeginnning(1);
		
		list.printLinkedList();	
		list.forwardTraversal(list.head);
		System.out.println();
		list.reverseTraversal(list.head);
			
	}
	
	public void reverseTraversal(LinkNode headNode)
	{
		
		if(headNode == null)
		{
			return;
		}
		
		reverseTraversal(headNode.next);
		System.out.print("<--" + headNode.data ); 		
		
	}
	
	
	public void forwardTraversal(LinkNode headNode)
	{
		
		
		if(headNode == null)
		{
			return;
		}
		System.out.print(headNode.data + "-->");
		forwardTraversal(headNode.next);		
		
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

