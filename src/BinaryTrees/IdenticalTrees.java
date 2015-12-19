package BinaryTrees;

import java.util.LinkedList;
import java.util.Queue;


public class IdenticalTrees {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		
		IdenticalTrees tree1 = new IdenticalTrees();
		TreeNode root1 = tree1.constructTree(tree1.root);
		//tree1.levelOrderTraversal(tree1.root);
		
		IdenticalTrees tree2 = new IdenticalTrees();
		TreeNode root2 = tree2.constructTree2(tree2.root);
		//tree2.levelOrderTraversal(tree2.root);
		
		isIdentical(root1 , root2);
		boolean identical = isIdenticalRecursive(root1 , root2);
		System.out.println("Identical : " + identical);


	}
	
	private static boolean isIdenticalRecursive(TreeNode rootNode1, TreeNode rootNode2) {
		// TODO Auto-generated method stub
		
		if(rootNode1 == null && rootNode2 == null)
		{
			return true;
		}
		if(rootNode1 != null & rootNode2 != null)
		{
			
			return (rootNode1.data == rootNode2.data && isIdenticalRecursive(rootNode1.left, rootNode2.left)  
					 && isIdenticalRecursive(rootNode1.right , rootNode2.right) );
			
		}
		
		return false;
	}

	private static void isIdentical(TreeNode rootNode1, TreeNode rootNode2) {
		// TODO Auto-generated method stub
		
		if(rootNode1 == null && rootNode2 == null)
		{
			System.out.println("Identical");
			return;
		}
		else
		{
			Queue<TreeNode> queue1 = new LinkedList<TreeNode>();
			Queue<TreeNode> queue2 = new LinkedList<TreeNode>();
			
			queue1.add(rootNode1);
			queue2.add(rootNode2);
			TreeNode temp1;
			TreeNode temp2;
			while(!queue1.isEmpty() && !queue2.isEmpty())
			{
				temp1 = queue1.remove();
				temp2 = queue2.remove();
				if(temp1.data != temp2.data)
				{
					System.out.println("Not Identical");
					return;
				}
				if(temp1.left != null)
				{
					queue1.add(temp1.left);
				}
				if (temp1.right !=null)					
				{
					queue1.add(temp1.right);
				}
				
				if(temp2.left != null)
				{
					queue2.add(temp2.left);
				}
				if (temp2.right !=null)					
				{
					queue2.add(temp2.right);
				}
				
			}	
			System.out.println("Identical");
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
	
	public TreeNode constructTree(TreeNode rootNode)
	{
		rootNode = new TreeNode(1);
		rootNode.left = new TreeNode(2);
		rootNode.right = new TreeNode(3);
		rootNode.left.left = new TreeNode(4);
		rootNode.left.right = new TreeNode(5);
		rootNode.right.left = new TreeNode(6);
		rootNode.right.right = new TreeNode(7);
		return rootNode;
	}
	
	public TreeNode constructTree2(TreeNode rootNode)
	{
		rootNode = new TreeNode(11);
		rootNode.left = new TreeNode(2);
		rootNode.right = new TreeNode(3);
		rootNode.left.left = new TreeNode(4);
		rootNode.left.right = new TreeNode(5);
		rootNode.right.left = new TreeNode(6);
		rootNode.right.right = new TreeNode(7);
		return rootNode;
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
