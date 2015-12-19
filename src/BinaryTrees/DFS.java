package BinaryTrees;

import java.util.LinkedList;
import java.util.Queue;


public class DFS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		
		DFS tree = new DFS();
		tree.constructTree();
		tree.levelOrderTraversal(tree.root);
		System.out.println("<-- Pre Order Traversal -->");
		tree.preOrderTraversal(tree.root);
		System.out.println();
		System.out.println("<-- In Order Traversal -->");		
		tree.inOrderTraversal(tree.root);	
		System.out.println();
		System.out.println("<-- Post Order Traversal -->");		
		tree.postOrderTraversal(tree.root);		
		
	}
	
	
	public void preOrderTraversal(TreeNode rootNode)
	{
		
		if(rootNode == null)
		{
			return;
		}
		
		System.out.print(rootNode.data + " ");
		preOrderTraversal(rootNode.left);
		preOrderTraversal(rootNode.right);
		
	}
	
	public void inOrderTraversal(TreeNode rootNode)
	{
		
		if(rootNode == null)
		{
			return;
		}
		
		inOrderTraversal(rootNode.left);		
		System.out.print(rootNode.data + " ");
		inOrderTraversal(rootNode.right);
		
	}
	
	public void postOrderTraversal(TreeNode rootNode)
	{
		
		if(rootNode == null)
		{
			return;
		}
		
		postOrderTraversal(rootNode.left);
		postOrderTraversal(rootNode.right);		
		System.out.print(rootNode.data + " ");
		
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
