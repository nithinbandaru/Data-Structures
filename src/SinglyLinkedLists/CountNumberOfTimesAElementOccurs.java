package SinglyLinkedLists;

public class CountNumberOfTimesAElementOccurs {

	LinkNode head;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CountNumberOfTimesAElementOccurs list = new CountNumberOfTimesAElementOccurs();
		list.addAtBeginnning(7);
		list.addAtBeginnning(5);
		list.addAtBeginnning(3);		
		list.addAtBeginnning(5);
		list.addAtBeginnning(4);
		list.addAtBeginnning(3);
		list.addAtBeginnning(5);
		list.addAtBeginnning(1);
		
		list.printLinkedList();	
		
		int getCount = list.getCountOfElement(5);
		System.out.println("Count of 5 is " + getCount);
			
	}
	
	
	private int getCountOfElement(int key) {
		// TODO Auto-generated method stub
		
		int count = 0;
		
		LinkNode current = head;
		
		while(current !=null)
		{
			
			if( key == current.data)
			{
				count++;
			}
			current = current.next;
		}		
		
		return count;
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
