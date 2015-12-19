package BinarySearchTree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;


public class IsBSTorNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		
		IsBSTorNot tree = new IsBSTorNot();
		tree.constructTree();
		tree.levelOrderTraversal(tree.root);

		boolean bst = tree.isBST(tree.root);
		System.out.println("Is BST ?? " + bst);
		
	}
	
	private boolean isBST(TreeNode rootNode) {
		// TODO Auto-generated method stub
		
		return isBSTUtil(rootNode, Integer.MIN_VALUE, Integer.MAX_VALUE);
		
	}

	private boolean isBSTUtil(TreeNode rootNode, int minValue, int maxValue) {
		// TODO Auto-generated method stub
		
		if(rootNode == null)
		{
			return true;
		}
		
		if(rootNode.data > maxValue || rootNode.data < minValue)
		{
			return false;
		}
		return (isBSTUtil(rootNode.left, minValue, rootNode.data) && isBSTUtil(rootNode.right, rootNode.data, maxValue));
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
		root = new TreeNode(4);
		root.left = new TreeNode(2);
		root.right = new TreeNode(6);
		root.left.left = new TreeNode(1);
		root.left.right = new TreeNode(3);
		root.right.left = new TreeNode(5);
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
