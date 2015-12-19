package BinaryTrees;

import java.util.LinkedList;
import java.util.Queue;


public class ConvertTreeToChildSumTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		
		ConvertTreeToChildSumTree tree = new ConvertTreeToChildSumTree();
		tree.constructTree();
		tree.levelOrderTraversal(tree.root);
		TreeNode rootNode = tree.convertTree(tree.root);
		tree.levelOrderTraversal(rootNode);
	}
	
	private TreeNode convertTree(TreeNode rootNode) {
		// TODO Auto-generated method stub
		
		int leftData = 0;
		int rightData = 0 ;
		int diff = 0;
		
		if(rootNode == null || (rootNode.left == null && rootNode.right == null))
		{
			return null;
		}
		else
		{
			
			convertTree(rootNode.left);
			convertTree(rootNode.right);
			
			if(rootNode.left != null)
			{
				leftData = rootNode.left.data;
			}
			if(rootNode.right != null)
			{
				rightData = rootNode.right.data;
			}
			
		   diff = leftData + rightData - rootNode.data;
		   
		   if(diff > 0)
		   {
			   rootNode.data = rootNode.data + diff;
			
		   }
		   else if(diff < 0)
		   {
			   rootNode =  incrementChildren(rootNode , -diff);
		   }
		
		   return rootNode;
		}
			
		
		
		
		
		
		
	}

	private TreeNode incrementChildren(TreeNode rootNode, int diff) {
		// TODO Auto-generated method stub
		
		if(rootNode.left != null)
		{
			rootNode.left.data = rootNode.left.data + diff;
			incrementChildren(rootNode.left, diff);
		}
		else if(rootNode.right != null)
		{
			rootNode.right.data = rootNode.right.data + diff;
			incrementChildren(rootNode.right, diff);
		}
		return rootNode;
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
		root = new TreeNode(50);
		root.left = new TreeNode(7);
		root.right = new TreeNode(2);
		root.left.left = new TreeNode(3);
		root.left.right = new TreeNode(5);
		root.right.left = new TreeNode(1);
		root.right.right = new TreeNode(30);
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
