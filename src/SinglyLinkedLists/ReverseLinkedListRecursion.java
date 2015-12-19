package SinglyLinkedLists;

public class ReverseLinkedListRecursion {

	LinkNode head;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ReverseLinkedListRecursion list = new ReverseLinkedListRecursion();
		list.addAtBeginnning(5);
		list.addAtBeginnning(4);
		list.addAtBeginnning(3);
		list.addAtBeginnning(2);
		list.addAtBeginnning(1);
		
		list.printLinkedList();
		list.reverseList(list.head);
		list.printLinkedList();	
			
	}
	
	public void reverseList(LinkNode headNode)
	{
	
		if(headNode.next == null)
		{
			head = headNode;
			return;
		}
		reverseList(headNode.next);
		LinkNode temp = headNode.next;
		temp.next = headNode;
		headNode.next = null;
				
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
