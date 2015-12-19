package BinaryTrees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;


public class MirrorImageOfItselfSymmetricTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		
		MirrorImageOfItselfSymmetricTree tree = new MirrorImageOfItselfSymmetricTree();
		tree.constructTree();
		tree.levelOrderTraversal(tree.root);
		
		boolean symmetric = IsSymmetric(tree.root);
		System.out.println("Symmetric : " + symmetric);

	}
	
	private static boolean IsSymmetric(TreeNode rootNode) {

		return isMirror(rootNode, rootNode);
	}

	private static boolean isMirror(TreeNode rootNode1, TreeNode rootNode2) {

		if(rootNode1 == null && rootNode2 == null)
		{
			return true;
		}
		
		if(rootNode1.data == rootNode2.data)
		{
			return (isMirror(rootNode1.left ,rootNode2.right) && isMirror(rootNode1.right , rootNode2.left));
		}
		
		return false;
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
		root.right = new TreeNode(2);
		root.left.left = new TreeNode(3);
		root.left.right = new TreeNode(4);
		root.right.left = new TreeNode(4);
		root.right.right = new TreeNode(3);
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
