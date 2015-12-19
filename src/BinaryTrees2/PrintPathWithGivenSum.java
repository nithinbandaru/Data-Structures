package BinaryTrees2;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class PrintPathWithGivenSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintPathWithGivenSum tree = new PrintPathWithGivenSum();
		tree.insertLevelOrder(1);
		tree.insertLevelOrder(2);
		tree.insertLevelOrder(6);
		tree.insertLevelOrder(4);
		tree.insertLevelOrder(5);
		tree.insertLevelOrder(3);
		tree.insertLevelOrder(7);
		tree.levelOrderTraversal(tree.root);
		System.out.println();
		
		printPath(tree.root , 7 , "", 0);
		
	}
	
	
	private static void printPath(TreeNode rootNode, int givenSum, String path, int currentSum) {
		// TODO Auto-generated method stub
		
		if(rootNode != null)
		{
			currentSum = currentSum + rootNode.data;
			path = path + String.valueOf(rootNode.data) + "-->";
			
			if(currentSum == givenSum)
			{
				System.out.println(path);
			}
			
			printPath(rootNode.leftChild , givenSum, new String(path), currentSum);

			printPath(rootNode.rightChild , givenSum, new String(path), currentSum);
			
			
		}
		
		
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
	
	public void levelOrderTraversal(TreeNode rootNode)
	{
		if(rootNode == null)
		{
			return;
		}
		else
		{
			Queue<TreeNode> queue = new LinkedList<TreeNode>();
			queue.add(rootNode);
			TreeNode temp;
			while(!queue.isEmpty())
			{
				temp = queue.remove();
				System.out.print(temp.data+" ");
				if(temp.leftChild != null)
				{
					queue.add(temp.leftChild);
				}
				if (temp.rightChild !=null)					
				{
					queue.add(temp.rightChild);
				}
			}	
		}
	}



}
