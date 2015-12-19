package SinglyLinkedLists;

public class PairwiseSwapData {

	LinkNode head;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PairwiseSwapData list = new PairwiseSwapData();
		list.addAtBeginnning(6);
		list.addAtBeginnning(5);
		list.addAtBeginnning(4);
		list.addAtBeginnning(3);
		list.addAtBeginnning(2);
		list.addAtBeginnning(1);
		
		list.printLinkedList();		
		list.swapData();
		list.printLinkedList();
			
	}
	
	
	public void swapData()
	{
		LinkNode current = head;
		if(current == null)
		{
			return;
		}
		
		LinkNode nextNode = null;
		int temp = 0;
		
		while(current!= null && current.next != null)
		{
			nextNode = current.next;
			temp = current.data;
			current.data = nextNode.data;
			nextNode.data = temp;
			current = nextNode.next;			
			
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
