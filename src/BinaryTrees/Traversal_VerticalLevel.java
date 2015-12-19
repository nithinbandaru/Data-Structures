package BinaryTrees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;


public class Traversal_VerticalLevel {

	static int minHzDist = 0 ; int maxHzDist = 0;	
	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		
		Traversal_VerticalLevel tree = new Traversal_VerticalLevel();
		tree.constructTree();
		tree.levelOrderTraversal(tree.root);
		tree.verticalTraversal(tree.root);

	}
	
	private void verticalTraversal(TreeNode rootNode) {
		// TODO Auto-generated method stub
		
		findMinMaxLevel(rootNode, minHzDist , maxHzDist , 0);
		System.out.println(minHzDist + " " + maxHzDist);
		
		for(int lineNum = minHzDist ; lineNum <= maxHzDist ; lineNum++ )
		{
			printVerticalLevel(rootNode, lineNum, 0);
			System.out.println();
		}
	}

	private void findMinMaxLevel(TreeNode rootNode, int min, int max, int HzDist) {
		// TODO Auto-generated method stub
		
		if(rootNode == null)
		{
			return;
		}
		if(HzDist < min)
		{
			minHzDist = HzDist;
		}
		else if (HzDist > max)
		{
			maxHzDist = HzDist;
		}
		
		findMinMaxLevel(rootNode.left, min,max,HzDist-1);
		findMinMaxLevel(rootNode.right, min,max,HzDist+1);
		
	}

	private void printVerticalLevel(TreeNode rootNode, int lineNum, int HzDist) {
		// TODO Auto-generated method stub
		
		if(rootNode == null)
		{
			return;
		}
		
		if(lineNum == HzDist)
		{
			System.out.print(rootNode.data+" ");
		}
		printVerticalLevel(rootNode.left ,lineNum ,  HzDist - 1 );
		printVerticalLevel(rootNode.right ,lineNum , HzDist + 1 );
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
		root.right.left.right = new TreeNode(8);		
		root.right.right = new TreeNode(7);
		root.right.right.right = new TreeNode(9);
		
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
