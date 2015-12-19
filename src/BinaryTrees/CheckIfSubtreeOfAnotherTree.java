package BinaryTrees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;


public class CheckIfSubtreeOfAnotherTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		
		CheckIfSubtreeOfAnotherTree S = new CheckIfSubtreeOfAnotherTree();
		S.constructSubTree();
		S.levelOrderTraversal(S.root);
		
		CheckIfSubtreeOfAnotherTree T = new CheckIfSubtreeOfAnotherTree();
		T.constructTree();
		T.levelOrderTraversal(T.root);		
		
		boolean subTree = isSubTree(T.root, S.root);
		
		System.out.println( "Is it a subTree " + subTree);

	}
	
	private static boolean isSubTree(TreeNode treeRoot, TreeNode subTreeRoot) {
		// TODO Auto-generated method stub
		if(subTreeRoot == null)
		{
			return true;
		}		
		if(treeRoot == null)
		{
			return false;
		}
		
		if(isIdentical(treeRoot,subTreeRoot))
		{
			return true;
		}
		
		
		return ( isSubTree(treeRoot.left,subTreeRoot) || isSubTree(treeRoot.right,subTreeRoot) );	
		
	}

	private static boolean isIdentical(TreeNode treeRoot, TreeNode subTreeRoot) {
		// TODO Auto-generated method stub
		
		if(treeRoot == null && subTreeRoot == null)
		{
			return true;
		}
		if(treeRoot == null || subTreeRoot == null)
		{
			return false;
		}
		
		return (treeRoot.data == subTreeRoot.data && isIdentical(treeRoot.left,subTreeRoot.left)
				&& isIdentical(treeRoot.right ,subTreeRoot.right ));
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
	
	public void constructSubTree()
	{
		root = new TreeNode(10);
		root.left = new TreeNode(4);
		root.right = new TreeNode(6);
		root.left.right = new TreeNode(30);
	}
	
	public void constructTree()
	{
		root = new TreeNode(26);
		root.left = new TreeNode(10);
		root.right = new TreeNode(3);
		root.left.left = new TreeNode(4);
		root.left.right = new TreeNode(6);
		root.left.left.right = new TreeNode(30);
		
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
