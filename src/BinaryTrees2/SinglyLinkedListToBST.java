package BinaryTrees2;
import java.util.LinkedList;


public class SinglyLinkedListToBST {

	LinkNode head;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<Integer> list = new LinkedList<Integer>();
		for (int i = 0; i < 10; i++)
			list.add(i);
		Node root = convertToBst(list, 0, list.size() - 1);
		printInOrderTree(root);
	}
	
	private static class Node {
		int value;
		Node left;
		Node right;
		public Node(int val) {
			this.value = val;
		}
	}
	
	private static void printInOrderTree(Node root) {
		if (root == null) return;
		printInOrderTree(root.left);
		System.out.print(root.value + "  ");
		printInOrderTree(root.right);
	}
	
	private static Node convertToBst(LinkedList<Integer> list, int lowIndex , int highIndex) {
		if (highIndex < lowIndex) return null;
		if (highIndex == lowIndex)
			return new Node(list.get(highIndex));
		
		int midIndex = (lowIndex + highIndex) / 2;
		int middleVal = list.get(midIndex);
		Node newNode = new Node(middleVal);
		newNode.left = convertToBst(list, lowIndex, midIndex - 1);
		newNode.right = convertToBst(list,  midIndex + 1, highIndex);
		return newNode;
	}
	
	
	public int getCount(int data)
	{
		int count = 0;
		LinkNode temp = head;
		while(temp!=null)
		{
			if(data == temp.data)
			{
				count++;
			}
			temp = temp.next;
		}
		
		return count;
		
	}
	
	public void addAtBeginning(int val)
	{
		LinkNode temp = head;
		LinkNode newNode = new LinkNode(val);
		if(temp == null)
		{
			head = newNode;
		}
		else
		{
			newNode.next = head;
			head = newNode;
		}
	}
	
	public void printList()
	{
		LinkNode temp = head;
		while(temp!=null)
		{
			System.out.print(temp.data+" ");
			temp = temp.next;
		}
		System.out.println();
	}
	
	public void deleteAtBeginning()
	{
		LinkNode temp = head;
		head = temp.next;
		temp = null;
	}
	
	public class LinkNode
	{
		int data;
		LinkNode next;
		public LinkNode(int val)
		{
			data = val;
			next = null;
		}
	}


}
