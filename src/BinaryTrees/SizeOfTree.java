package BinaryTrees;

import java.util.LinkedList;
import java.util.Queue;


public class SizeOfTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		
		SizeOfTree tree = new SizeOfTree();
		tree.constructTree();
		int sizeIterative  = tree.levelOrderTraversal(tree.root);	
		
		int sizeRecursive = tree.size(tree.root);
		System.out.println("Size of Tree Iterative : " + sizeIterative);
		System.out.println("Size of Tree Recursive : " + sizeRecursive);


	}
	
	public int size(TreeNode rootNode)
	{
		if(rootNode == null)
		{
			return 0;
		}
		
		return (size(rootNode.left) + 1 + size(rootNode.right));
		
	}
	
	
	TreeNode root;
		
	class TreeNode
	{
		int data;
		TreeNode left;
		TreeNode right;
		
		public TreeNode(int val)
		{
			data = val;
			left = null;
			right = null;			
		}
		
	}
	
	public void constructTree()
	{
		root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		root.left.left = new TreeNode(4);
		root.left.right = new TreeNode(5);
		root.right.left = new TreeNode(6);
		root.right.right = new TreeNode(7);
	}
	
	public int levelOrderTraversal(TreeNode rootNode)
	{
		int size = 0 ;
		if(rootNode == null)
		{
			return size;
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
				size++;
				if(temp.left != null)
				{
					queue.add(temp.left);
				}
				if (temp.right !=null)					
				{
					queue.add(temp.right);
				}
			}	
		}
		System.out.println();
		return size;
	}
	
}
