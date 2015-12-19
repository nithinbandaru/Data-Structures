package BinaryTrees;

import java.util.LinkedList;
import java.util.Queue;


public class RootToLeafPath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		
		RootToLeafPath tree = new RootToLeafPath();
		tree.constructTree();
		tree.levelOrderTraversal(tree.root);
		tree.printPath(tree.root);

	}
	
	private void printPath(TreeNode rootNode) {
		// TODO Auto-generated method stub
		
		int[] pathArray = new int[1000];
		printPathRecursive(rootNode , pathArray , 0);
		
	}

	private void printPathRecursive(TreeNode rootNode, int[] pathArray, int pathLen) {
		// TODO Auto-generated method stub
		
		if(rootNode == null)
		{
			return;
		}
		
		pathArray[pathLen] = rootNode.data;
		pathLen++;
		
		if(rootNode.left == null && rootNode.right == null)
		{
			printArray(pathArray, pathLen);
		}
		else
		{
			printPathRecursive(rootNode.left , pathArray , pathLen);
			printPathRecursive(rootNode.right , pathArray , pathLen);
		}
		
		
		
	}

	private void printArray(int[] pathArray, int pathLen) {
		// TODO Auto-generated method stub
		
		for(int i = 0 ; i < pathLen ; i++)
		{
			System.out.print(pathArray[i] + " ");
		}
		System.out.println("----");
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
