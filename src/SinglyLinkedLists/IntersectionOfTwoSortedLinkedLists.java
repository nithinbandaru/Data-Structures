package SinglyLinkedLists;

public class IntersectionOfTwoSortedLinkedLists {

	LinkNode head;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		IntersectionOfTwoSortedLinkedLists list1 = new IntersectionOfTwoSortedLinkedLists();
		list1.addAtBeginnning(6);
		list1.addAtBeginnning(4);
		list1.addAtBeginnning(3);
		list1.addAtBeginnning(2);
		list1.addAtBeginnning(1);
		
		list1.printLinkedList(list1.head);
		
		IntersectionOfTwoSortedLinkedLists list2 = new IntersectionOfTwoSortedLinkedLists();
		list2.addAtBeginnning(8);
		list2.addAtBeginnning(6);
		list2.addAtBeginnning(4);
		list2.addAtBeginnning(2);		
		
		list2.printLinkedList(list2.head);	
		
		LinkNode newHead = makeNewListOfIntersectionElements(list1.head , list2.head);
		IntersectionOfTwoSortedLinkedLists list4 = new IntersectionOfTwoSortedLinkedLists();
		list4.printLinkedList(newHead);
	}
	
	
	private static LinkNode makeNewListOfIntersectionElements(LinkNode headNode1,
			LinkNode headNode2) {
		// TODO Auto-generated method stub
		
		LinkNode currentNode1 = headNode1;
		LinkNode currentNode2 = headNode2;
		
		
		IntersectionOfTwoSortedLinkedLists list3 = new IntersectionOfTwoSortedLinkedLists();
		
		while(currentNode1 != null && currentNode2 != null)
		{
			if(currentNode1.data < currentNode2.data)
			{
				currentNode1 = currentNode1.next;
			}
			else if (currentNode1.data > currentNode2.data)
			{
				currentNode2 = currentNode2.next;
			}
			else
			{
				list3.addAtEnd(currentNode1.data);				
				currentNode1 = currentNode1.next;
				currentNode2 = currentNode2.next;
			}
			
		}
		
		return list3.head;
		
		
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
