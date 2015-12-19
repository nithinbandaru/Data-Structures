package SinglyLinkedLists;
public class SearchElementInLinkedList {

	LinkNode head;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SearchElementInLinkedList list = new SearchElementInLinkedList();
		list.addAtBeginnning(5);
		list.addAtBeginnning(4);
		list.addAtBeginnning(3);
		list.addAtBeginnning(2);
		list.addAtBeginnning(1);
		
		list.printLinkedList();		
		System.out.println();
		list.searchElementIterative(4);
		
		System.out.println();
		boolean isFound = list.searchElementsRecursive(list.head, 4);
		System.out.println("Is Element Found via Recursive: " + isFound);
		
	}
	
	public boolean searchElementsRecursive(LinkNode headNode , int key)
	{
		LinkNode temp = headNode;
		
		if(temp == null)
		{
			return false;
		}
		
		if(temp.data == key)
		{
			return true;
		}
		
		return searchElementsRecursive(temp.next, key);
	}
	
	
	public void searchElementIterative(int key)
	{
		LinkNode temp = head;
		
		if(temp == null)
		{
			return ;
		}
		
		while(temp !=null)
		{
			if(temp.data == key)
			{
				System.out.println("Element found");
				return;
			}
			else
			{
				temp = temp.next;
			}
		}
		
		System.out.println("Element Not Found ");
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
