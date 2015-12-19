package SinglyLinkedLists;

public class GetNthNodeInLinkedList {

	LinkNode head;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		GetNthNodeInLinkedList list = new GetNthNodeInLinkedList();
		list.addAtBeginnning(5);
		list.addAtBeginnning(4);
		list.addAtBeginnning(3);
		list.addAtBeginnning(2);
		list.addAtBeginnning(1);
		
		list.printLinkedList();	
		
		int NthNode = list.getNthNode(3);
		System.out.println("Nth Node : " + NthNode);
			
	}
	
	
	public int getNthNode(int index)
	{
		int NthNode = Integer.MIN_VALUE;
		
		LinkNode temp = head;
		int count = 0;
		while(temp!=null)
		{
			if(count == index)
			{
				NthNode = temp.data;
				return NthNode;
			}
			temp = temp.next;
			count++;
			
		}
		
		
		
		return NthNode;
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
