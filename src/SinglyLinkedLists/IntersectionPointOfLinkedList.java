package SinglyLinkedLists;


public class IntersectionPointOfLinkedList {

	LinkNode head1;
	LinkNode head2;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		IntersectionPointOfLinkedList list = new IntersectionPointOfLinkedList();
		list.addAtBeginnning(5);
		list.addAtBeginnning(4);
		list.addAtBeginnning(3);
		list.addAtBeginnning(2);
		list.addAtBeginnning(1);
		
		list.printLinkedList();		
		
		list.intersectionPoint();
			
	}
	
	public void intersectionPoint()
	{
		
		int lengthOfList1 = 0 ;
		LinkNode headNode1 = head1; 
		while(headNode1 != null)
		{
			lengthOfList1++;
			headNode1 = headNode1.next;
		}
		System.out.println(lengthOfList1);
		
		int lengthOfList2 = 0 ;
		LinkNode headNode2 = head2; 
		while(headNode2 != null)
		{
			lengthOfList2++;
			headNode2 = headNode2.next;
		}
		
		if(headNode1 != headNode2)
		{
			System.out.println("No Intersection possible");
			return;
		}
		
		int diff = (lengthOfList1 > lengthOfList2) ? (lengthOfList1 - lengthOfList2 ) : (lengthOfList2-lengthOfList1);
		
		while(diff > 0 )
		{
			headNode1 = headNode1.next;
			diff--;
		}
		
		while( headNode1 != headNode2)
		{
			headNode1 = headNode1.next;
			headNode2 = headNode2.next;
		}
		
		System.out.println(headNode1.data);
		
		
	}
	
	
	public void addAtBeginnning(int data)
	{
		LinkNode newNode = new LinkNode(data);
		newNode.next = head1;
		head1 = newNode;
	}
	
	
	
	public void printLinkedList()
	{
		LinkNode temp = head1;
		
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
