package BinaryTrees2;
import java.util.*;

public class CreateLinkedListOfNodesAtEachDepth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CreateLinkedListOfNodesAtEachDepth tree = new CreateLinkedListOfNodesAtEachDepth();
		tree.insertLevelOrder(1);
		tree.insertLevelOrder(2);
		tree.insertLevelOrder(3);
		tree.insertLevelOrder(4);
		tree.insertLevelOrder(5);
		tree.insertLevelOrder(6);
		tree.insertLevelOrder(7);
		
		ArrayList<LinkedList<TreeNode>> result = tree.createLinkedLists(tree.root);
		int size = result.size();
		
		System.out.println("No of levels: " + size);
		
		for(int i = 0 ; i < size; i++)
		{
			LinkedList<TreeNode> node = result.get(i);
			int sizeOfEachLevel = node.size();
			for(int j = 0 ; j< sizeOfEachLevel ; j++)
			{
				System.out.print(node.get(j).data + " ");
			}
			System.out.println();
		}
	}

	
	public ArrayList<LinkedList<TreeNode>> createLinkedLists(TreeNode rootNode)
	{
		
		ArrayList<LinkedList<TreeNode>> result = new ArrayList<LinkedList<TreeNode>>();
		
		LinkedList<TreeNode> currLevel = new LinkedList<TreeNode>();
		
		if(rootNode != null)
		{
			currLevel.add(rootNode);
		}
		
		while(currLevel.size() > 0)
		{
			result.add(currLevel);
			LinkedList<TreeNode> parents = currLevel;
			currLevel = new LinkedList<TreeNode>();
			for(TreeNode parent : parents)
			{
				if(parent.leftChild != null)
				{
					currLevel.add(parent.leftChild);
				}
				if(parent.rightChild != null)
				{
					currLevel.add(parent.rightChild);
				}
			}
		}
		
		
		return result;
	}
	
	
	TreeNode root;
	class TreeNode
	{
		int data;
		TreeNode leftChild;
		TreeNode rightChild;
		
		public TreeNode(int val)
		{
			data = val;
			leftChild = null;
			rightChild = null;
		}
		
	}

	public void insertLevelOrder(int value)
	{
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		//TreeNode rootNode = root;
		TreeNode newNode = new TreeNode(value);
		if(root == null)
		{
			root = newNode;
			return;
		}
		queue.add(root);
		TreeNode temp;
		while(!queue.isEmpty())
		{
			temp = queue.remove();
			
			if(temp.leftChild == null)
			{
				temp.leftChild = newNode;
				//System.out.println("left child added: "+newNode.data);
				return;
			}
			else
			{
				queue.add(temp.leftChild);
			}
			if(temp.rightChild == null)
			{
				temp.rightChild = newNode;
				//System.out.println("Right child added: "+newNode.data);
				return;
			}
			else
			{
				queue.add(temp.rightChild);
			}
		}
	}
	
}
