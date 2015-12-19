package BinaryTrees;

import java.util.LinkedList;
import java.util.Queue;


public class DeleteBinaryTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		
		DeleteBinaryTree tree = new DeleteBinaryTree();
		tree.constructTree();
		tree.levelOrderTraversal(tree.root);
		tree.deleteTree(tree.root);
		System.out.println("After delete");
		tree.levelOrderTraversal(tree.root);

	}
	
	public void deleteTree(TreeNode rootNode)
	{
		if(rootNode == null)
		{
			return;
		}
			
		deleteTree(rootNode.left);
		deleteTree(rootNode.right);
		if(rootNode.left == null && rootNode.right == null)
		{
			rootNode = null;
		}	
		
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
