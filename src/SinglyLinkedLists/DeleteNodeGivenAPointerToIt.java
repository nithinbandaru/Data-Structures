package SinglyLinkedLists;

public class DeleteNodeGivenAPointerToIt {

	LinkNode head;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DeleteNodeGivenAPointerToIt list = new DeleteNodeGivenAPointerToIt();
		list.addAtBeginnning(5);
		list.addAtBeginnning(4);
		list.addAtBeginnning(3);
		list.addAtBeginnning(2);
		list.addAtBeginnning(1);
		
		list.printLinkedList();		
		list.deleteNode(list.head.next.next);
		list.printLinkedList();
			
	}
	
	public void deleteNode(LinkNode someNode)
	{
		LinkNode temp = null;
		if(someNode.next != null)
		{
			temp = someNode.next;				
		}
		
		someNode.data = temp.data;
		someNode.next = temp.next;		
		
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
