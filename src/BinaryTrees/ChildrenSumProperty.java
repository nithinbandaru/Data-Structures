package BinaryTrees;

import java.util.LinkedList;
import java.util.Queue;


public class ChildrenSumProperty {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		
		ChildrenSumProperty tree = new ChildrenSumProperty();
		tree.constructTree();
		tree.levelOrderTraversal(tree.root);
		boolean s = tree.childrenSum(tree.root);
		System.out.println(s);

	}
	
	private boolean childrenSum(TreeNode rootNode) {
		// TODO Auto-generated method stub
		
		int leftData = 0; 
		int rightData = 0;
		
		
		if(rootNode == null || (rootNode.left == null && rootNode.right == null))
		{
			return true;
		}
		else
		{
			if(rootNode.left != null)
			{
				leftData = rootNode.left.data;
			}
			
			if(rootNode.right != null)
			{
				rightData = rootNode.right.data;
			}
			if(rootNode.data == rootNode.left.data + rootNode.right.data
					&& childrenSum(rootNode.left) &&  childrenSum(rootNode.right))
			{
				return true;
			}
			else
			{
				return false;
			}			
			
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
		root = new TreeNode(19);
		root.left = new TreeNode(7);
		root.right = new TreeNode(2);
		root.left.left = new TreeNode(5);
		root.left.right = new TreeNode(2);
		root.right.left = new TreeNode(2);
		root.right.right = new TreeNode(0);
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
