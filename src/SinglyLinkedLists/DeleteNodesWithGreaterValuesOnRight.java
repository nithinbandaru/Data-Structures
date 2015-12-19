package SinglyLinkedLists;

public class DeleteNodesWithGreaterValuesOnRight {

	LinkNode head;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 12->15->10->11->5->6->2->3->
		DeleteNodesWithGreaterValuesOnRight list = new DeleteNodesWithGreaterValuesOnRight();
		list.addAtBeginnning(3);
		list.addAtBeginnning(2);
		list.addAtBeginnning(6);		
		list.addAtBeginnning(5);
		list.addAtBeginnning(11);
		list.addAtBeginnning(10);
		list.addAtBeginnning(15);
		list.addAtBeginnning(12);
		
		list.printLinkedList(list.head);	
		
		list.deleteNodesWithGreaterValues(list.head);
			
	}
	
	
	private void deleteNodesWithGreaterValues(LinkNode headNode) {
		// TODO Auto-generated method stub
		
		if(headNode == null)
		{
			return;
		}
		
		LinkNode current = headNode;
		LinkNode nextNode = headNode.next;
		
		while(current != null && nextNode != null)
		{
			if(current.data < nextNode.data)
			{
				current = nextNode;
				nextNode = nextNode.next;
			}
			else
			{
				current = current.next;
			}
		}
		
		DeleteNodesWithGreaterValuesOnRight list = new DeleteNodesWithGreaterValuesOnRight();
		list.printLinkedList(headNode);
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
