package SinglyLinkedLists;

public class MiddleElementOfLinkedList {

	LinkNode head;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MiddleElementOfLinkedList list = new MiddleElementOfLinkedList();
		list.addAtBeginnning(5);
		list.addAtBeginnning(4);
		list.addAtBeginnning(3);
		list.addAtBeginnning(2);
		list.addAtBeginnning(1);
		list.addAtBeginnning(0);
		
		list.printLinkedList();		
		
		int midElement = list.middleElement();
		System.out.println("Mid Element : " + midElement);
			
	}
	
	
	public int middleElement()
	{
		
		LinkNode slowPtr = head;
		LinkNode fastPtr = head;
		
		if(slowPtr != null)
		{
			while(fastPtr != null && fastPtr.next != null)
			{
				System.out.println(slowPtr.data + "--" + fastPtr.data);
				slowPtr = slowPtr.next;
				fastPtr = fastPtr.next.next;
			}
			
			return slowPtr.data;
		}
	
		return Integer.MIN_VALUE;
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
