package BinaryTrees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;


public class Traversal_SpiralLevelOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		
		Traversal_SpiralLevelOrder tree = new Traversal_SpiralLevelOrder();
		tree.constructTree();
		tree.levelOrderTraversal(tree.root);
		tree.sprialLevelOrderTraversal(tree.root);

	}
	
	private void sprialLevelOrderTraversal(TreeNode rootNode) {
		// TODO Auto-generated method stub
		
		if(rootNode == null)
		{
			return;
		}
		
		Stack<TreeNode> stack1 = new Stack<TreeNode>();
		Stack<TreeNode> stack2 = new Stack<TreeNode>();
		
		stack1.push(rootNode);
		
		while(!stack1.isEmpty() || !stack2.isEmpty())
		{
			TreeNode temp ;
			
			while(!stack1.isEmpty())
			{
				temp = stack1.pop();
				
				System.out.print(temp.data + " ");
				
				if(temp.right != null)
				{
					stack2.push(temp.right);
				}
				if(temp.left != null)
				{
					stack2.push(temp.left);
				}
				
			}
			
			while(!stack2.isEmpty())
			{
				temp = stack2.pop();
				
				System.out.print(temp.data + " ");
				
				if(temp.left != null)
				{
					stack1.push(temp.left);
				}
				if(temp.right != null)
				{
					stack1.push(temp.right);
				}
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
