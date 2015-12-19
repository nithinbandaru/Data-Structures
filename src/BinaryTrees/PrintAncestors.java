package BinaryTrees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

import BinaryTrees.InOrderSuccessorBST.TreeNode;


public class PrintAncestors {

	
	TreeNode root;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		
		PrintAncestors tree = new PrintAncestors();
		tree.constructTree();
		tree.levelOrderTraversal(tree.root);
		int key = 6;
		tree.getAncestors(tree.root , key);

	}
	
	private boolean getAncestors(TreeNode rootNode, int key) {
		// TODO Auto-generated method stub
		if(rootNode == null)
		{
			return false;
		}
		if(rootNode.data == key)
		{
			return true;
		}
		
		if(getAncestors(rootNode.left , key) || getAncestors(rootNode.right, key))
		{
			System.out.println(rootNode.data);
			return true;
		}
		return false;
		
		
	}

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
		root = new TreeNode(15);
		root.left = new TreeNode(10);
		root.right = new TreeNode(20);
		root.left.left = new TreeNode(8);
		root.left.left.left = new TreeNode(6);
		root.left.right = new TreeNode(12);
		root.left.right.left = new TreeNode(11);		
		root.right.left = new TreeNode(17);
		root.right.left.left = new TreeNode(16);		
		root.right.right = new TreeNode(25);
		root.right.right = new TreeNode(27);
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
	}
	
}
