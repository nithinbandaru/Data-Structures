package BinaryTrees;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;


public class IsBinaryTreeHeightBalanced {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		
		IsBinaryTreeHeightBalanced tree = new IsBinaryTreeHeightBalanced();
		tree.constructTree();
		tree.levelOrderTraversal(tree.root);
		boolean balanced = tree.IsHeghtBalanced(tree.root);
		System.out.println("Balanced : " + balanced);

	}
	
	private boolean IsHeghtBalanced(TreeNode rootNode) {

		if(rootNode == null)
		{
			return true;
		}
		
		if(heighDiff(rootNode) == -1)
		{
			return false;
		}
		System.out.println(heighDiff(rootNode));
		return true;
		
	}

	private int heighDiff(TreeNode rootNode) {

		if(rootNode == null)
		{
			return 0;
		}
		
		int leftHt = heighDiff(rootNode.left);
		int rightHt = heighDiff(rootNode.right);
		
		if(leftHt == -1 || rightHt == -1)
		{
			return -1;
		}
		if(Math.abs(leftHt - rightHt) > 1)
		{
			return -1;
		}
		
		return Math.max(leftHt, rightHt) + 1;
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
		root.left.left.left = new TreeNode(7);
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
