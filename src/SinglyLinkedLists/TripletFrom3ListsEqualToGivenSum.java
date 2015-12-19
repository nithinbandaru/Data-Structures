package SinglyLinkedLists;

public class TripletFrom3ListsEqualToGivenSum {

	LinkNode head;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TripletFrom3ListsEqualToGivenSum list1 = new TripletFrom3ListsEqualToGivenSum();
		list1.addAtBeginnning(20);
		list1.addAtBeginnning(5);
		list1.addAtBeginnning(15);
		list1.addAtBeginnning(10);		
		
		TripletFrom3ListsEqualToGivenSum list2 = new TripletFrom3ListsEqualToGivenSum();
		list2.addAtBeginnning(10);
		list2.addAtBeginnning(9);
		list2.addAtBeginnning(2);
		list2.addAtBeginnning(2);
		
		TripletFrom3ListsEqualToGivenSum list3 = new TripletFrom3ListsEqualToGivenSum();
		list3.addAtBeginnning(1);
		list3.addAtBeginnning(2);
		list3.addAtBeginnning(4);
		list3.addAtBeginnning(8);
		
		list1.printLinkedList(list1.head);
		list2.printLinkedList(list2.head);
		list3.printLinkedList(list3.head);		
			
		printTheTriplet(list1.head, list2.head, list3.head , 25);
		
	}
	
	
	private static void printTheTriplet(LinkNode head1, LinkNode head2,
			LinkNode head3, int givenSum) {
		// TODO Auto-generated method stub
		
		LinkNode headNode1 = head1;
		
		while(headNode1 != null)
		{
			LinkNode headNode2 = head2;
			LinkNode headNode3 = head3;
			
			while( headNode2 != null && headNode3 != null)
			{
				
				int sum = headNode1.data + headNode2.data + headNode3.data ; 
				if(sum == givenSum)
				{
					System.out.println(headNode1.data + "--" + headNode2.data + "--" +headNode3.data);
					return;
				}
				else if( sum < givenSum)
				{
					headNode2 = headNode2.next;
				}
				else
				{
					headNode3 = headNode3.next;
				}
				
			}
			
			headNode1 = headNode1.next;
		}
		
		
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
