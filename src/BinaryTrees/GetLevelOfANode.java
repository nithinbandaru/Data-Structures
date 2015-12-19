package BinaryTrees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;


public class GetLevelOfANode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		
		GetLevelOfANode tree = new GetLevelOfANode();
		tree.constructTree();
		tree.levelOrderTraversal(tree.root);
		
		int node = 6 ;
		int level = tree.getLevel(tree.root, node);

		System.out.println("level of node " + node + " is " + level );
	}
	
	private int getLevel(TreeNode rootNode, int node) {
		// TODO Auto-generated method stub		
		return getLevelUtil(rootNode, node, 1);
	}

	private int getLevelUtil(TreeNode rootNode, int node, int level) {
		// TODO Auto-generated method stub
		if(rootNode == null)
		{
			return 0;
		}
		if(rootNode.data == node)
		{
			return level;
		}
		int nodeLevel = getLevelUtil(rootNode.left , node , level + 1);
		if(nodeLevel != 0)
		{
			return nodeLevel;
		}
		nodeLevel = getLevelUtil(rootNode.right , node , level + 1);
		return nodeLevel;
	
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
